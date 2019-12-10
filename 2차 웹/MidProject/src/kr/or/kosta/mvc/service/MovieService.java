package kr.or.kosta.mvc.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kr.or.kosta.mvc.dao.MovieDao;

@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,readOnly=true)
@Service
public class MovieService {

	@Autowired
	MovieDao movieDao;
	
	//영화 판권관련 정보를 불러오는 서비스 로직.
	public HashMap<String,Integer> getMovieStatistic(){
		HashMap<String,Integer> statistic=new HashMap<>();
		statistic.put("purchase_thismonth", movieDao.getMoviePurchaseCount_thisMonth());
		statistic.put("purchase_pastmonth", movieDao.getMoviePurchaseCount_pastMonth());
		statistic.put("copyrightcost_thismonth", movieDao.getMovieCopyRightCost_thisMonth());
		statistic.put("copyrightcost_pastmonth", movieDao.getMovieCopyRightCost_pastMonth());
		statistic.put("investment_thismonth", movieDao.getMovieInvestment_thisMonth());
		statistic.put("investment_pastmonth", movieDao.getMovieInvestment_pastMonth());
		return statistic;
	}

}
