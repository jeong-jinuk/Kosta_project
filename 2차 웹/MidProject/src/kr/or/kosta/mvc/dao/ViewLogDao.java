package kr.or.kosta.mvc.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.mvc.inter.LogDao;

@Repository
public class ViewLogDao  implements LogDao{
	@Autowired
	private SqlSessionTemplate ss;
	

	@Override
	public int getLogCount_All() {
		// TODO Auto-generated method stub
		return ss.selectOne("viewlog.viewlogcount_all");
	}
	@Override
	public int getLogCount_CurrentDate() {
		// TODO Auto-generated method stub
		return ss.selectOne("viewlog.viewlogcount_currentdate");
	}
	@Override
	public List<Integer> getLogCount_Days() {
		// TODO Auto-generated method stub
		return ss.selectList("viewlog.viewlogcount_days");
	}
	@Override
	public List<HashMap<String, BigDecimal>> getLogCount_Months() {
		// TODO Auto-generated method stub
		return ss.selectList("viewlog.viewlogcount_months");
	}
	@Override
	public List<Integer> getLogCount_Years() {
		// TODO Auto-generated method stub
		return ss.selectList("viewlog.viewlogcount_years");
	}
}
