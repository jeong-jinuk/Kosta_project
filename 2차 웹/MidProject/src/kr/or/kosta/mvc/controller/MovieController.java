package kr.or.kosta.mvc.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.mvc.dao.MovieDao;
import kr.or.kosta.mvc.service.MovieService;

@RestController
@Controller
//영화 구매 및 판권 관련 구입금액, 수입액을 다루기위한 컨트롤러
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping("/getMovieStatistic")
	public HashMap<String,Integer> getMovieStatistic() {
		
		return movieService.getMovieStatistic();
	}
}
