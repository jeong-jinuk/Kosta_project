package kr.or.kosta.mvc.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.MovieSoldLogVO;
import kr.or.kosta.mvc.inter.LogDao;

@Repository
public class MovieSoldLogDao implements LogDao {
	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public int getLogCount_All() {
		// TODO Auto-generated method stub
		return ss.selectOne("moviesoldlog.moviesoldlogcount_all");
	}
	@Override
	public int getLogCount_CurrentDate() {
		// TODO Auto-generated method stub
		return ss.selectOne("moviesoldlog.moviesoldlogcount_currentdate");
	}
	@Override
	public List<Integer> getLogCount_Days() {
		// TODO Auto-generated method stub
		return ss.selectList("moviesoldlog.moviesoldlogcount_days");
	}
	@Override
	public List<HashMap<String, BigDecimal>> getLogCount_Months() {
		// TODO Auto-generated method stub
		return ss.selectList("moviesoldlog.moviesoldlogcount_months");
	}
	@Override
	public List<Integer> getLogCount_Years() {
		// TODO Auto-generated method stub
		return ss.selectList("moviesoldlog.moviesoldlogcount_years");
	}
	public int getLogPrice_All() {
		try {
		return ss.selectOne("moviesoldlog.moviesoldlogprice_all");
		}catch(Exception e) {
			return 0;
		}
	}
	public int getLogPrice_CurrentDate() {
		try {
			return ss.selectOne("moviesoldlog.moviesoldlogprice_currentdate");
		}catch(Exception e) {
			return 0;
		}
		
	}
	
	public List<Integer> getLogPrice_Days() {
		// TODO Auto-generated method stub
		return ss.selectList("moviesoldlog.moviesoldprice_days");
	}
	public List<Integer> getLogPrice_Months() {
		// TODO Auto-generated method stub
		return ss.selectList("moviesoldlog.moviesoldprice_months");
	}
	public List<Integer> getLogPrice_Years() {
		// TODO Auto-generated method stub
		return ss.selectList("moviesoldlog.moviesoldprice_years");
	}
}
