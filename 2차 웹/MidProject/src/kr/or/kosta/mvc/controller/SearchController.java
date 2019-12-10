package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.SearchVO;
import kr.or.kosta.mvc.dao.MovieDao;

@Controller
public class SearchController {
	@Autowired
	private MovieDao dm;
	//검색을 지원하기 위한 컨트롤러
	@GetMapping("/u_search")
	public String Search(SearchVO sevo, Model m) {
		List<MovieVO> list1 = dm.moviesearch(sevo);//검색결과를 리스트로 받아옴
		List<String> list = new ArrayList<>();
		for(MovieVO mvo: list1) {
			String title = mvo.getMovie_title();
			//받아온 리스트에는 영화에 대한 정보들이 모두 들어있으므로, 그중에 필요한 정보인 영화 제목만을 뽑아 리스트로 만드는 작업이다.
			String a = '"'+title+'"';
			list.add(a);
		}
		m.addAttribute("list",list);
		return "u_searchsuccess";
	}
	
}
