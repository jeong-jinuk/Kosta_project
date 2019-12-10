package kr.or.kosta.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.WatchLogVO;
import kr.or.kosta.mvc.dao.ResearchDao;

@Controller
public class ResearchController {
	@Autowired
	private ResearchDao rdao;
	
	@GetMapping("/u_researchmovie")
	public String researchmovie(String title) {
		MovieVO mvvo = new MovieVO();
		WatchLogVO wlvo = new WatchLogVO();
		mvvo.setMovie_title(title);
		System.out.println(title);
		String mnum = rdao.mnum(mvvo);
		int gnum = rdao.newbee();
		System.out.println(mnum);
		System.out.println(gnum);
		wlvo.setMember_number(gnum);
		wlvo.setMovie_number(mnum);
		System.out.println(wlvo.getMovie_number());
		rdao.insertresearch(wlvo);
		return "u_research";
	}
	
}
