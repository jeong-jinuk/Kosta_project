package kr.or.kosta.mvc.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.kosta.dto.InserttagVO;
import kr.or.kosta.dto.MemberVO;
import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.MovietagVO;
import kr.or.kosta.mvc.dao.CommunityDao;
import kr.or.kosta.mvc.dao.DynamicExampleDao;
import kr.or.kosta.mvc.dao.GM_MovieDao;
import kr.or.kosta.mvc.dao.TagListDao;

import static kr.or.kosta.mvc.dao.CommunityDao.countlist;

@Controller
public class DefaultController {
	
	private StringBuilder sb;

	@Autowired
	private DynamicExampleDao dao; 
	
	@Autowired
	private GM_MovieDao mdao; 
	
	@GetMapping("/")//메인페이지
	public String MainPage(Model m) {
		List<String> title_list_popular = mdao.get_m_title_popular5();
		List<String> title_list_boxOffice = mdao.get_m_title_boxOffice5();
		List<String> title_list_lastviewed = mdao.get_m_title_lastviewed5(11);
		List<String> title_list_saved = new ArrayList<String>();
		List<String> title_list_pay = mdao.get_m_title_pay5();
		List<String> title_list_free = mdao.get_m_title_free5();
		List<String> title_list_similar_mylike = new ArrayList<String>();
		List<String> title_list_similar_tome = new ArrayList<String>();
		
		List<List<String>> list_popular = make_movie_list(title_list_popular);
		List<List<String>> list_boxOffice = make_movie_list(title_list_boxOffice);
		List<List<String>> list_lastviewed = make_movie_list(title_list_lastviewed);
		List<List<String>> list_saved = make_movie_list(title_list_saved);
		List<List<String>> list_pay = make_movie_list(title_list_pay);
		List<List<String>> list_free = make_movie_list(title_list_free);
		List<List<String>> list_similar_mylike = make_movie_list(title_list_similar_mylike);
		List<List<String>> list_similar_tome = make_movie_list(title_list_similar_tome);
		
		m.addAttribute("list_popular", list_popular);
		m.addAttribute("list_boxOffice", list_boxOffice);
		m.addAttribute("list_lastviewed", list_lastviewed);
		m.addAttribute("list_saved", list_saved);
		m.addAttribute("list_pay", list_pay);
		m.addAttribute("list_free", list_free);
		m.addAttribute("list_similar_mylike",list_similar_mylike);
		m.addAttribute("list_similar_tome", list_similar_tome);
		
		
		return "u_main";
	}
	
	@GetMapping("/{path}")
	public String ex1(@PathVariable String path) {
		return path;
	}
	//각각 경로를 알아서 보내기 위한 Get Mapping
	
	

	@GetMapping(value={"/blank5"})
	public String movielist5(Model m) {
		Map<String, String> map= new HashMap<String, String>();		
		m.addAttribute("list",dao.getMovieList3(map));
		return "blank5";
	}
	//blank5 ( 영화 검색 및 추가 등)를 위한 Get방식의 Mapping
	
	@GetMapping("/chartjs")
	public String sendchartvalue(String cmd, Model m) {
		List<Integer> result = null;
		result = dao.getprice1();
		System.out.println(result);
		m.addAttribute("chart1",dao.getprice1());
		return "chartjs";
	}
	//차트에 값을 보내기 위한 Mapping.
	
	@PostMapping("/blank5")
	public String searchTitle5(String searchType,String search,Model m) {
		Map<String, String> map= new HashMap<String, String>();
		map.put("searchType", searchType);
		map.put("search", search); 
		System.out.println(search);
		m.addAttribute("list",dao.getMovieList3(map)); 
		m.addAttribute("searchType",searchType);
		return "blank5";
	}
	//검색에 값을 받기 위한 Post방식의 Mapping
	
	
	@RequestMapping(value="update.do", method=RequestMethod.POST)
	public String update(@ModelAttribute MovieVO vo) throws Exception{
		dao.updateprice(vo);
		return "redirect:blank5"; 
	}
	//영화에서 영화의 가격이 업데이트시 매핑
	
	@RequestMapping(value="updatestatus.do", method=RequestMethod.POST)
	public String updatestatus(@ModelAttribute MovieVO vo) throws Exception{
		dao.updatestatus(vo);
		return "redirect:blank5";
	}
	//영화에서 영화의 active_status_number 수정을 위한 매핑
	
	
	@RequestMapping(value="insert.do", method=RequestMethod.POST)
	public String insert(@ModelAttribute MovieVO vo, @ModelAttribute MovietagVO voo) throws Exception{
		dao.createmovie(vo);
		dao.beforeinsertmovie(voo);
		
		
		return "redirect:blank5";
	}
	//영화 추가를 위한 매핑
	
	@RequestMapping(value="inserttag.do",method=RequestMethod.POST)
	public String inserttag(@ModelAttribute InserttagVO vo ) throws Exception{
		
		TagListDao tldao = new TagListDao();
		
		List<MovieVO> movienumberlist =dao.getsavetaglist();
		
		String movie_num="";
	for(MovieVO mv: movienumberlist) {
		movie_num=mv.getMovie_number();
		System.out.println("movie_num : "+movie_num);
		
		
		
		for(int i = 0; i<=9; i++) {
			vo.setMovie_number(movie_num);
			
			
			
			tldao.connectR(movie_num);
			String tag_name;
			tag_name = tldao.namelist[i];
			vo.setTag_name(tag_name);
			Map<String,String> map = new HashMap<String,String>();
			
			map.put("movie_number",movie_num);
			map.put("tag_name",tag_name);
			
				
			if(dao.checktagname(tag_name)==0) {
				dao.inserttag(vo);
				dao.insertmovietag(map);
			} else {
				dao.insertmovietag(map);
			}
		
		
		}	
		}
		System.out.println("insert end");
		return "redirect:blank5";
	}	
	//댓글 탑 10개를 출력하기 위한 매핑

	
	
	@RequestMapping(value="updatecommunity.do",method=RequestMethod.POST)
	public String insertMemberCommunity(@ModelAttribute MemberVO vo ) throws Exception{
		CommunityDao co = new CommunityDao();
		
		
		
		int mem_community_number = 0;
		
		
		co.connectR();
		
		
		
		int member_list_number = dao.memberfinalnumber();
		
		
		for(int i=11; i<=member_list_number; i++) {
			vo.setMember_number(i);
			mem_community_number = countlist[i-10];
			vo.setMember_community_number(mem_community_number);
			dao.updatecommunitymember(vo);
			
			
		}
		
	return "redirect:blank4";
	}
//군집화를 위한 매핑

	// 영화제목으로 
	public List<List<String>> make_movie_list(List<String> movie_list) {

		

		List<List<String>> movie_src_list = new ArrayList<List<String>>();
		for (String i : movie_list) {
			String src = getMovie_Data(i);
			List<String> list = new ArrayList<String>();
			String m_code = mdao.getMovie_number(i);
			list.add(m_code);
			list.add(i);
			list.add(src);
			movie_src_list.add(list);
		}

//		for (List<String> l : movie_src_list) {
//			System.out.println(l);
//		}
//		m.addAttribute("src_list", movie_src_list);
		return movie_src_list;
	}
	

	public String getMovie_Data(String txt) {
		String clientId = "U8YzQ_7AjBaS8A19j_uR";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "YSP3_ozkfq";// 애플리케이션 클라이언트 시크릿값";\
		int display = 100; // 검색결과갯수. 최대100개

		try {
			int start = 1;
			while (true) {

				String text = URLEncoder.encode(txt, "utf-8");
				String apiURL = "https://openapi.naver.com/v1/search/movie.json?query=" + text + "&display=" + display
						+ "&start=" + start + "&";

				URL url = new URL(apiURL);
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("GET");
				con.setRequestProperty("X-Naver-Client-Id", clientId);
				con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
				int responseCode = con.getResponseCode();
				BufferedReader br;
				if (responseCode == 200) {
					br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
				} else {
					br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "UTF-8"));
				}
				sb = new StringBuilder();
				String line;

				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}

				JSONParser parser = new JSONParser();
				JSONObject obj = (JSONObject) parser.parse(sb.toString());

				JSONArray parse_items = (JSONArray) obj.get("items");
				if (parse_items == null) {
					return "NoData";
				}
				for (Object parse_mv : parse_items) {

					JSONObject i = (JSONObject) parse_mv;
					String titleEx = i.get("title").toString();

					if (titleEx.length() > 7) {
						String title = titleEx.substring(3, titleEx.length() - 4);
						if (txt.equals(title)) {

							return i.get("image").toString();
						}
					}

				}
				start++;
				br.close();
				con.disconnect();
			}
//					System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";

	}
	
	}
