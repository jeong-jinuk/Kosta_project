package kr.or.kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.kosta.dto.Login_LogVO;
import kr.or.kosta.dto.Movie_Sold_LogVO;
import kr.or.kosta.dto.Search_LogVO;
import kr.or.kosta.dto.View_LogVO;
import kr.or.kosta.dto.Watch_LogVO;
import kr.or.kosta.mvc.dao.LogInfoDao;

@Controller
public class LogInfoController {

	@Autowired
	private LogInfoDao logInfoDao;

	// 검색 로그 정보 페이지
	@GetMapping("/search_log")
	public String showSearchTable(Model m) {
		List<Search_LogVO> list = logInfoDao.getSearch_LogList();
		m.addAttribute("slist", list);
		return "search_log";
	}

	// 조회 로그 정보 페이지
	@GetMapping("/view_log")
	public String showViewTable(Model m) {
		List<View_LogVO> list = logInfoDao.getView_LogList();
		m.addAttribute("slist", list);
		return "view_log";
	}

	// 시청 로그 정보 페이지
	@GetMapping("/whatch_log")
	public String showWatchTable(Model m) {
		List<Watch_LogVO> list = logInfoDao.getWatch_LogList();
		m.addAttribute("slist", list);
		return "whatch_log";
	}

	// 영화 판매 로그 정보 페이지
	@GetMapping("/movie_sold_log")
	public String showMovieTable(Model m) {
		List<Movie_Sold_LogVO> list = logInfoDao.getMovie_Sold_LogList();
		m.addAttribute("slist", list);
		return "movie_sold_log";
	}

	// 로그인 로그 정보 페이지
	@GetMapping("/login_log")
	public String showLoginTable(Model m) {
		List<Login_LogVO> list = logInfoDao.getLogin_LogList();
		m.addAttribute("slist", list);
		return "login_log";
	}
}
