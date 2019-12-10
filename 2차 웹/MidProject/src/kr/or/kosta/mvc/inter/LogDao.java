package kr.or.kosta.mvc.inter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

//모든 로그의DAO 인터페이스
public interface LogDao {
	//로그의 전체수 카운트
	public int getLogCount_All();
	//오늘 생긴 로그의 수 카운트
	public int getLogCount_CurrentDate();
	//최근 5일간의 로그수 일별 카운트
	public List<Integer> getLogCount_Days();
	//최근 5달간의 로그수 일별 카운트
	public List<HashMap<String, BigDecimal>> getLogCount_Months();
	//최근 5년간의 로그수 일별 카운트
	public List<Integer> getLogCount_Years();
}
