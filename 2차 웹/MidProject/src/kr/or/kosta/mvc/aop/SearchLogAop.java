package kr.or.kosta.mvc.aop;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;


import kr.or.kosta.mvc.dao.MemberDao;
import kr.or.kosta.mvc.dao.UserInfoDao;

@Component
@Aspect
public class SearchLogAop {
	@Autowired
	private UserInfoDao uiDao;

	
	@Before("execution(* kr.or.kosta.mvc.controller.*.searchMovie*(..))")
	public void searchLog(JoinPoint jp) {//검색하면 값이 출력되기 전에 로그부터 쌓인다.
		Object[] o=jp.getArgs();//모든 매개변수의 값들을 object 로 받아온다.
		HttpSession hs =null; //세션을 위한 값
		String keyword=""; //검색어를 받기위해 사용할 변수
		 
		for(Object temp: o) {
			if(temp instanceof HttpSession) {
				hs = (HttpSession) temp;
				
			}//가져온 파라미터중 세션에 관련된 값을 hs에 셋팅
		}
		if(o[1] instanceof String && o[1] != null) { //제대로된 값인지 검사
			keyword = String.valueOf(o[1]);
		}
		//System.out.println("keyword  ==  : "+keyword);
		Map<String,String> map = new HashMap<>();
		String uid = "oracle6@naver.com"; 
		//String uid = (String) hs.getAttribute("uid");//세션에 올라가있는 uid를 스트링 타입으로 변환해준다
		//테스트를 위해 임시로 uid 를 테스트값으로 변경
		
		map.put("userId",uid);
		map.put("keyword",keyword);
		uiDao.instUserSearchLog(map);
	}

}
