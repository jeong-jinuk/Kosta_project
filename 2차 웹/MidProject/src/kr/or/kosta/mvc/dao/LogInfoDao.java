package kr.or.kosta.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.Login_LogVO;
import kr.or.kosta.dto.Movie_Sold_LogVO;
import kr.or.kosta.dto.Search_LogVO;
import kr.or.kosta.dto.View_LogVO;
import kr.or.kosta.dto.Watch_LogVO;

@Repository
public class LogInfoDao {

	@Autowired
	private SqlSessionTemplate ss;

	// 검색 로그 정보
	public List<Search_LogVO> getSearch_LogList() {
		return ss.selectList("loginfo.showSearch_Log");
	}

	// 조회 로그 정보
	public List<View_LogVO> getView_LogList() {
		return ss.selectList("loginfo.showView_Log");
	}

	// 시청 로그 정보
	public List<Watch_LogVO> getWatch_LogList() {
		return ss.selectList("loginfo.showWatch_Log");
	}

	// 판매 영화 로그 정보
	public List<Movie_Sold_LogVO> getMovie_Sold_LogList() {
		return ss.selectList("loginfo.showMovie_Sold_Log");
	}

	// 로그인 로그 정보
	public List<Login_LogVO> getLogin_LogList() {
		return ss.selectList("loginfo.showLogin_Log");
	}

}
