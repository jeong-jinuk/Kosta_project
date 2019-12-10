package kr.or.kosta.mvc.dao;

import kr.or.kosta.dto.MovieVO;

public interface DynamicExampleDaoInter {
	public MovieVO getMovieList(MovieVO vo);
	public MovieVO getMovieTitleList(MovieVO vo);
	public MovieVO getMovieList3(MovieVO vo);
}
