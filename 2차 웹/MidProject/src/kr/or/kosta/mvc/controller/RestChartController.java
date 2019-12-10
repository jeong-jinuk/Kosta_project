package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.dto.userChartViewVO;
import kr.or.kosta.mvc.dao.UserInfoDao;

@RestController
@RequestMapping("/userInfo")
public class RestChartController {
	 
	@Autowired
	private UserInfoDao uiDao;
	 
	//차트 데이터를 불러오기 위한 restcontroller 
	@RequestMapping("/chartType/{type}")
	@ResponseBody 
	public List<userChartViewVO> getChartDataJson(@PathVariable String type,String keyword){
		System.out.println("getChartDataJson" );
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("m_id","oracle6@naver.com");//추후 세션에 아이디 저장되면 수정해야 할 부분.
		
		if(type.equals("day")) {
			map.put("keyword","day");
		}
//		else if(type.equals("week")) {
//			System.out.println("week");
//			
//		}
		else {
			map.put("keyword","month");
		}
		
		
//		List<userChartViewVO> test  = uiDao.getAvgSoldList(map);
//		for(userChartViewVO uc : test) {
//			
//			System.out.println("test avera====="+ uc.getAverage());
//			System.out.println("test getSold_date====="+uc.getSold_date());
//		}
		
		
		
		return uiDao.getAvgSoldList(map);
	}


	
}
