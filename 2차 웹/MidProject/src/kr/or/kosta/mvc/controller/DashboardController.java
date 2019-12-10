package kr.or.kosta.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.or.kosta.mvc.dao.JoinLogDao;
import kr.or.kosta.mvc.dao.LoginLogDao;
import kr.or.kosta.mvc.dao.MovieDao;
import kr.or.kosta.mvc.dao.MovieSoldLogDao;
import kr.or.kosta.mvc.dao.ViewLogDao;
import kr.or.kosta.mvc.dao.WatchLogDao;
import kr.or.kosta.mvc.inter.LogDao;
import kr.or.kosta.mvc.service.RecommendLogicService;

@Controller
public class DashboardController {
	
	@Autowired
	private WatchLogDao watchLogDao;
	@Autowired
	private ViewLogDao viewLogDao;
	@Autowired
	private MovieSoldLogDao movieSoldLogDao;
	@Autowired
	private LoginLogDao loginLogDao;
	@Autowired
	private JoinLogDao joinLogDao;
	@Autowired
	private MovieDao movieDao;
	private LogDao logDao;
	
	@Autowired
	private RecommendLogicService rls;
	
	String path="C:\\Users\\KOSTA\\Desktop\\";
	
	@RequestMapping(value="/upload", method=RequestMethod.POST )
	public String ex2(MultipartHttpServletRequest request) throws IllegalStateException, IOException {
		Iterator itr = request.getFileNames();
		if(itr.hasNext()) {
			List mpf=request.getFiles((String) itr.next());
			
			for(int i=0;i<mpf.size();i++) {
				File file=new File(path+((MultipartFile) mpf.get(i)).getOriginalFilename());
				((MultipartFile) mpf.get(i)).transferTo(file);
			}
		}
		return "success";
	}
	@RequestMapping("/test11")
	public String testRecommend(Model m) {
		rls.getUserTagWeightedList(11);
		return "test11";
	}
	
	
	//Dashboard 페이지에 기본적인 정보를 불러오기위한 작업을 처리하는 컨트롤러. 
	@RequestMapping("/admin")
	public String index(Model m) {
		DecimalFormat df=new DecimalFormat("#,###");
		int watchlogcount_all=watchLogDao.getLogCount_All();
		int watchlogcount_currentdate=watchLogDao.getLogCount_CurrentDate();
		
		int viewlogcount_all=viewLogDao.getLogCount_All();
		int viewlogcount_currentdate=viewLogDao.getLogCount_CurrentDate();
		
		int moviesoldLogcount_all=movieSoldLogDao.getLogPrice_All();
		int moviesoldLogcount_currentdate=movieSoldLogDao.getLogPrice_CurrentDate();
		
		int loginLogcount_all=loginLogDao.getLogCount_All();
		int loginLogcount_currentdate=loginLogDao.getLogCount_CurrentDate();
		
		int joinLogcount_all=joinLogDao.getLogCount_All();
		int joinLogcount_currentdate=joinLogDao.getLogCount_CurrentDate();
		
		int purchase_pastmonth=movieDao.getMoviePurchaseCount_pastMonth();
		int purchase_thismonth=movieDao.getMoviePurchaseCount_thisMonth();
		
		int copyrightcost_pastmonth=movieDao.getMovieCopyRightCost_pastMonth();
		int copyrightcost_thismonth=movieDao.getMovieCopyRightCost_thisMonth();
		
		int investment_pastmonth=movieDao.getMovieInvestment_pastMonth();
		int investment_thismonth=movieDao.getMovieInvestment_thisMonth();
		
		m.addAttribute("watchlogcount_all",df.format(watchlogcount_all));
		m.addAttribute("watchlogcount_currentdate",df.format(watchlogcount_currentdate));
		
		m.addAttribute("viewlogcount_all",df.format(viewlogcount_all));
		m.addAttribute("viewlogcount_currentdate",df.format(viewlogcount_currentdate));
		
		m.addAttribute("moviesoldlogcount_all",df.format(moviesoldLogcount_all));
		m.addAttribute("moviesoldlogcount_currentdate",df.format(moviesoldLogcount_currentdate));
		m.addAttribute("loginlogcount_all",df.format(loginLogcount_all));
		m.addAttribute("loginlogcount_currentdate",df.format(loginLogcount_currentdate));
		
		m.addAttribute("joinlogcount_all",df.format(joinLogcount_all));
		m.addAttribute("joinlogcount_currentdate",df.format(joinLogcount_currentdate));
		
		m.addAttribute("purchase_pastmonth",df.format(purchase_pastmonth));
		m.addAttribute("purchase_thismonth",df.format(purchase_thismonth));
		
		m.addAttribute("copyrightcost_pastmonth",df.format(copyrightcost_pastmonth));
		m.addAttribute("copyrightcost_thismonth",df.format(copyrightcost_thismonth));
		
		m.addAttribute("investment_pastmonth",df.format(investment_pastmonth));
		m.addAttribute("investment_thismonth",df.format(investment_thismonth));
		
		return "index";
	}

	


}
