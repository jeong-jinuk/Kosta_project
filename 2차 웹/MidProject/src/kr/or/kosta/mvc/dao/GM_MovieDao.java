package kr.or.kosta.mvc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.GM_AgeVO;
import kr.or.kosta.dto.GM_MovieVO;
import kr.or.kosta.dto.GM_Movie_RatingVO;
import kr.or.kosta.dto.GM_Movie_Sold_LogVO;
import kr.or.kosta.dto.GM_RankVO;
import kr.or.kosta.dto.GM_ReviewVO;
import kr.or.kosta.dto.GM_View_LogVO;
import kr.or.kosta.dto.GM_Watch_LogVO;


@Repository
public class GM_MovieDao {

	
	@Autowired
	private SqlSessionTemplate ss;
	
	
	public void addMovie(GM_MovieVO vo) {
		ss.insert("GM_movie.add",vo);
	}
	
	public GM_MovieVO getMovieVO(String movie_title) {
		return ss.selectOne("GM_movie.getMovieVO",movie_title);
	}
	
	
	public String getMyRating(Map<String, String> map) {
		return ss.selectOne("GM_movie.getMyRating",map);
	}
	
	public int chk_Movie_rating(GM_Movie_RatingVO rmvo) {
		return ss.selectOne("GM_movie.chk_Movie_rating", rmvo);
	}
	
	public void addMovie_rating(GM_Movie_RatingVO rmvo) {
		ss.insert("GM_movie.addMovie_rating", rmvo);
	}
	
	public void updateMovie_rating(GM_Movie_RatingVO rmvo) {
		ss.update("GM_movie.updateMovie_rating", rmvo);
	}
	
	public List<HashMap<String, String>> get_movie_comment(String movie_number) {
		return ss.selectList("GM_movie.get_movie_comment", movie_number);
	}
	
	public String getMovie_number(String title) {
		return ss.selectOne("GM_movie.getMovie_number",title);
	}
	
	public int chk_Movie_review(GM_ReviewVO rvo) {
		return ss.selectOne("GM_movie.chk_Movie_review", rvo);
	}

	public int add_review(GM_ReviewVO rvo) {
		return ss.insert("GM_movie.add_review", rvo);
	}
	
	public int getMember_number(String id) {
		return ss.selectOne("GM_movie.getMember_number",id);
	}
	
	public int chk_rank_list(GM_RankVO rankvo) {
		return ss.selectOne("GM_movie.chk_rank_list",rankvo);
	}
	
	public void add_rank(GM_RankVO rankvo) {
		ss.insert("GM_movie.add_rank",rankvo);
	}
	
	public void update_rank(GM_RankVO rankvo) {
		ss.update("GM_movie.update_rank",rankvo);
	}
	
	public void add_view_log(GM_View_LogVO vlvo) {
		ss.insert("GM_movie.add_view_log",vlvo);
	}
	
	public void update_movie_view(GM_View_LogVO vlvo) {
		ss.update("GM_movie.update_movie_view",vlvo);
	}
	
	public String getMovie_title(String movie_number) {
		return ss.selectOne("GM_movie.getMovie_title",movie_number);
	}
	
	public void add_watch_log(GM_Watch_LogVO wlvo) {
		ss.insert("GM_movie.add_watch_log",wlvo);
	}
	
	public void update_movie_watch(GM_Watch_LogVO wlvo) {
		ss.update("GM_movie.update_movie_watch",wlvo);
	}
	
	public void add_sold_log(GM_Movie_Sold_LogVO mslvo) {
		ss.insert("GM_movie.add_sold_log",mslvo);
	}
	
	public int chk_event(String movie_number) {
		return ss.selectOne("GM_movie.chk_event",movie_number);
	}
	
	public GM_AgeVO get_login_log_age() {
		return ss.selectOne("GM_movie.get_login_log_age");
	}
	
	public List<String> get_m_title_boxOffice5() {
		return ss.selectList("GM_movie.get_m_title_boxOffice5");
	}
	public List<String> get_m_title_popular5() {
		return ss.selectList("GM_movie.get_m_title_popular5");
	}
	
	public List<String> get_m_title_lastviewed5(int member_number) {
		return ss.selectList("GM_movie.get_m_title_lastviewed5",member_number);
	}
	public List<String> get_m_title_pay5() {
		return ss.selectList("GM_movie.get_m_title_pay5");
	}
	
	public List<String> get_m_title_free5() {
		return ss.selectList("GM_movie.get_m_title_free5");
	}
	
	
}
