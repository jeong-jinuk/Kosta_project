package kr.or.kosta.mvc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.MyListsVO;
import kr.or.kosta.dto.MyMemberVO;
import kr.or.kosta.dto.My_RankVO;
import kr.or.kosta.dto.userChartViewVO;
import kr.or.kosta.mvc.dao.MemberDao;
import kr.or.kosta.mvc.dao.MovieListDao;
import kr.or.kosta.mvc.dao.UserInfoDao;
  
@Controller
public class MyPageController {
  
	@Autowired
	private MovieListDao mlDao;
	
	@Autowired
	private UserInfoDao uiDao;
	
	@Autowired
	private MemberDao memDao;
	
	private Map<String,String> map;
	
	// 마이페이지 메인
	@GetMapping("/invoice")  
	public String moveUserPage(Model model) {
		
		String userId="oracle6@naver.com";//추후 세션에 아이디 저장되면 수정해야 할 부분.
		map = new HashMap<String,String>();
		
		map.put("m_id",userId);//추후 세션에 아이디 저장되면 수정해야 할 부분.
		map.put("keyword","day");//day 월간 데이터 저장 테스트
		
		List<userChartViewVO> ml_list = uiDao.getAvgSoldList(map);
		
		
		//메인에서 유저 차트 값 구하는 부분
		String date[] = new String[ml_list.size()];
		int avg[] = new int[ml_list.size()];
		int idx = 0;
		 
		for (userChartViewVO t : ml_list) {
			date[idx] = t.getSold_date();
			avg[idx] = t.getAverage();
			idx++;     
		}      
		
		uiDao.getMyRankInfo(userId);
		
		List<MovieVO> list = uiDao.getMyRankInfo(userId);
		
		for(MovieVO ss : list) {
			System.out.println("getMovie_title    "+ss.getMovie_title());
			System.out.println("getRank_name    "+ss.getGsbvo().getRank_name());
		}  
		
		
//		model.addAttribute("soldDate",date);
//		model.addAttribute("soldAvg",avg);
		model.addAttribute("ml_list", mlDao.getMyMovieList(userId));
		model.addAttribute("mvNamelist", mlDao.getMvListNames(userId));
		model.addAttribute("myRankInfo",uiDao.getMyRankInfo(userId));
		model.addAttribute("uAvgSoldList", uiDao.getAvgSoldList(map));
		 
		return "userMyPageMain";
	}
	
	//마이페이지->월간 사용금액 차트 내용 엑셀로 출력하는 부분
	@GetMapping("/chartFileDownload")
	public String fileTest(Model m) {
		map = new HashMap<String,String>();
		String path="C:\\Users\\KOSTA\\Downloads\\chartExcel.csv";
		PrintWriter pw = null;
		
		try {
				pw= new PrintWriter(new File(path));
				
				StringBuffer sb = new StringBuffer();
				String cNameList="sold_date,average";
				
				//리스트
				sb.append(cNameList);
				sb.append("\n");
				
				List<userChartViewVO> list = uiDao.getAvgSoldList(map);
				
				for(userChartViewVO sv : list ) {
					sb.append(sv.getSold_date()).append(",");
					sb.append(sv.getAverage());
					sb.append("\n");
				}
			
				pw.write(sb.toString());
				pw.close();
				System.out.println("마무리!");
				return "success";
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "500";
		}
	
	}
		

	// 마이페이지 메인->재생목록 추가하기 버튼 눌러서 동작하는, 재생목록 추가 메서드 (insert)
	@GetMapping("/addPlayList")
	public String insertList(Model model,String listName) {
		Map<String, String> map = new HashMap<>();
		
		map.put("listName", listName);
		map.put("userId", "oracle6@naver.com");
		
		model.addAttribute("ml_list", mlDao.getMvListNames("oracle6@naver.com"));
		
		mlDao.insertMyList(map);
		
		return "userPlayListPage";

	} 
	
	//마이페이지 메인-> 재생목록 추가하기로 저장한 이후 비동기식으로 플레이리스트 부분만 새로고침하기 위한 메서드
	@GetMapping("/refresh")
	public String refreshPlayList(Model model) {
		
		model.addAttribute("mvNamelist", mlDao.getMvListNames("oracle6@naver.com"));
		
		return "refreshPlayList";
	}

	// 마이페이지->재생목록에서 항목 눌렀을때 플레이리스트 페이지로 이동 메서드
	@GetMapping("/userListEditPage")
	public String moveUserListPage(Model model,String listName,String listNum) {

 
		model.addAttribute("listName", listName);
		model.addAttribute("listNum", listNum);
		model.addAttribute("playMvList", mlDao.getPlaylistMv(listNum));
		
		return "userPlayListPage";

	}    
	
	
	//마이페이지 메인->재생목록 클릭 -> 플레이리스트 페이지->영화추가-> 검색 모달창에서 검색 버튼 누를 시 동작하는 메서드
	@GetMapping("/searchMvCheck")
	public String searchMvCheck(Model model,String keyword) {
		
		List<MyListsVO> mvNamelist = mlDao.getMvListNames("oracle6@naver.com");
		 
		if(mvNamelist.size() != 0) {
			return "searchMvResultPage";
		} else {
			return "500"; //값 없으면 에러페이지 출력
		}
		
	}
	
	//마이페이지 메인->재생목록 클릭 -> 플레이리스트 페이지->영화추가-> 검색 모달창에서 검색 버튼 누를 시 동작하는 메서드
	@GetMapping("/searchMvPrint")
	public String searchMovie(Model model,String keyword) {
		
		 
		model.addAttribute("searchMvList", mlDao.getSearchMvList(keyword));
		
		return "searchMvResultPage";
	}
		
	
	//플레이리스트 저장
	@GetMapping("/instMvPlayList")
	public String instMvInPlayList(Model model,String mvNumList,String playListNum) {
		Map<String,String> map = new HashMap<>();
		 
		map.put("mvNumList",mvNumList);
		map.put("playListNum",playListNum);
		map.put("listCategNum","2"); //내 재생목록은 List_category 테이블에서 2의 값을 가지고있고, 마이리스트에서 추가하므로 여기서 이렇게 값 추가 
		
		
		mlDao.instMvPlayList(map);
		
		return "userPlayListPage";
	}
	
	//플레이리스트 삭제
	@GetMapping("/delPlayList")
	public String delPlayList(Model model,String listNum) {
		Map<String,String> map = new HashMap<>();
		 
		map.put("listNum",listNum);
		
		mlDao.delPlayList(map);
		 
		return "userPlayListPage";
	}
	
	//플레이리스트에 저장된 영상 삭제
	@GetMapping("/delMvPlayList")
	public String delMvPlayList(Model model,String listNum,String movie_number) {
		Map<String,String> map = new HashMap<>();
		  
		map.put("listNum",listNum);
		map.put("movie_number",movie_number);
		
		mlDao.delMvPlayList(map);
		 
		
		return "userPlayListPage";
	}
	
	//플레이리스트에 검색한 영상 저장 이후 비동기식으로 새로고침 하기 위한 메서드
	@GetMapping("/refreshPlayList")
	public String refreshMvPlayList(Model model,String listNum) {
		
		model.addAttribute("playMvList", mlDao.getPlaylistMv(listNum));
		return "refreshPlayListMv";
	}

	
	
	//마이페이지->추천영화 필터링 설정 페이지에 값 저장할때 사용되는 메서드. 필터링 항목의 초기값이 없기 때문에 update 형식으로 쿼리를 짜는것은
	//문제가 생길 소지가 있어 일단 delete를 한번 해서 기존에 있는 값을 삭제하고 새로 선택된 값을 insert 하는 방식으로 동작하도록 함
	//세션에 유저아이디가 저장되어 있다는 가정하에 임시데이터로 진행. 추후 수정
	@GetMapping("/updateUserMvFileter") //delete,insert
	public String updateMvFilter(Model model,String filterList) {
		
		map.put("userId","oracle6@naver.com");   //이부분. 추후 수정필요
		map.put("filterList",filterList);
		uiDao.instUserMvFilter(map);
		return "userMvFilterPage";
	}    
	
	//마이페이지->추천영화 필터링 설정 페이지에 진입 시 기존에 저장 되어있는 값을 세팅하기 위한 메서드 
	@GetMapping("/userMvFilterPage")
	public String moveMvFilterPage(Model model) {
		String userId = "oracle6@naver.com"; //세션 값 추가. 수정필요
		model.addAttribute("filterList",uiDao.getUserFilterList(userId));
		System.out.println("filterList     "+uiDao.getUserFilterList(userId));
		return "userMvFilterPage";
	}
	 
	
	//마이페이지->계정정보 변경 메서드 (update)
	@PostMapping("/updateInfo")
	public String userUpdate(MultipartFile mfile, Model m, HttpServletRequest request,MyMemberVO memvo) throws UnsupportedEncodingException {
		String img_path = "img//movie";
		String r_path = request.getRealPath("/");
		String oriFn = mfile.getOriginalFilename();
//		long size = mfile.getSize();
//		String contentType = mfile.getContentType();
		
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path).append("\\");
		path.append(oriFn);
		File f = new File(path.toString());
		  
		//파일을 오라클에 업로드하는 방식이 아니라 일단 파일 이름만 저장되도록 함
		memvo.setMember_picture(oriFn);
		memvo.setMember_id("oracle6@naver.com"); //나중에 세션에 아이디값으로 변경
		// 파일 업로드 진행 
		try {
			if(oriFn != null && oriFn != "") {
				mfile.transferTo(f);
			}
			uiDao.updateUserInfo(memvo);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}  
		return "userMyPageMain"; 
	}   
	
	//마이페이지 메인->계정 설정 버튼 클릭시 저장 되어있는 유저의 데이터를 셋팅하기 위해 유저 정보 불러오는 부분
	@GetMapping("/userInfoPage")
	public String moveUserInfoPage(Model model) {
		 
		String userId="oracle6@naver.com"; //임시 유저 아이디 저장부분. 추후 세션값으로 변경
		
		MyMemberVO mvo = uiDao.getMemberInfo(userId);
		
		System.out.println("getMember_birth   = = "+mvo.getMember_birth());
		System.out.println("getMember_picture   = = "+mvo.getMember_picture());
		
		
		model.addAttribute("userInfo",uiDao.getMemberInfo(userId));
		
		return "userInfoUpdate";
	}
	
	//마이페이지->계정 설정->계정 탈퇴
	@GetMapping("/outUserAccount")
	public String outUserAccount() {
		 
		String userId="oracle6@naver.com"; // 세션에 저장된 실제 유저의 아이디값 대신 테스트용 임시값
		memDao.outUserAccount(userId);
		return "index";
	} 
	
	


	
	

}
