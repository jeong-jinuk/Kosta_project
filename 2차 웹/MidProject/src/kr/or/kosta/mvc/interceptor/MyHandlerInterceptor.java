package kr.or.kosta.mvc.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

	// Controller에 들어가기전 접근
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("preHandle 동작!");

		boolean isAuth = false;	// 권한 판단 여부

		HttpSession session = request.getSession();
		int grade = (int) session.getAttribute("grade");	// 세션의 회원등급 정보를 받아옴

		String reqUri = request.getRequestURI();
		String[] reqUris = reqUri.split("/");
		String firstPath = reqUris[2];	// 해당 컨트롤러의 URI 부분을 추출

		if (firstPath.equals("member") && (grade == 5 || grade == 9)) {	// 회원관리자 or 최고관리자
			isAuth = true;

		} else if (firstPath.equals("movie") && (grade == 6 || grade == 9)) {	// 영화관리자 or 최고관리자
			isAuth = true;

		} else if (firstPath.equals("complaint") && (grade == 7 || grade == 9)) {	// 민원관리자 or 최고관리자
			isAuth = true;

		} else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('권한이 없습니다.'); history.go(-1);</script>");	// 권한이 없을 시 알림창 출력
			out.flush();
		}

		return isAuth;
	}
}
