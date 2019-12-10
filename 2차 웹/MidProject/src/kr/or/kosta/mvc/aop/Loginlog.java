package kr.or.kosta.mvc.aop;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.dto.Login_LogVO;
import kr.or.kosta.dto.MyMemberVO;
import kr.or.kosta.mvc.controller.LoginController;
import kr.or.kosta.mvc.dao.MemberDao;

@Component
@Aspect
public class Loginlog {
	@Autowired
	private MemberDao mdao;
	
	@AfterReturning(pointcut="execution(* kr.or.kosta.mvc.controller.*.login*(..))",returning="ret")
	public void loginlog(JoinPoint jp,Object ret) {//오브젝트로 받아와서 파라미터값 열어보기
		System.out.println(ret.getClass().getMethods().toString());
		System.out.println(ret instanceof ModelAndView);
		Object[] o=jp.getArgs();//메소드의 파라미터값을 순서대로 받아옴
		MyMemberVO mvo= null;
		for(Object temp: o) {
			if(temp instanceof MyMemberVO) {
				mvo = (MyMemberVO) temp;
			}
		}//파라미터값을 순서대로 돌리면서 원하는 타입의 값을 받아온다.
		mdao.llogging(mvo);
	}
	
	@Before("execution(* kr.or.kosta.mvc.controller.*.logout*(..))")
	public void logoutlog(JoinPoint jp) {//로그아웃시 로그에 업데이트를 해주기 위한 어드바이스
		Object[] o=jp.getArgs();//로그아웃 메소드의 파라미터값을 가져온다.
		HttpSession hs =null;
		for(Object temp: o) {
			if(temp instanceof HttpSession) {
				hs = (HttpSession) temp;
			}//가져온 파라미터중 세션에 관련된 값을 hs에 셋팅
		}
		String uid = (String) hs.getAttribute("uid");//세션에 올라가있는 uid를 스트링 타입으로 변환해준다
		mdao.logoutlogging(uid);//로그아웃 로그를 남기기 위해 메소드 호출
	}

}
