package kr.or.kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.dto.Login_LogVO;
import kr.or.kosta.dto.MyMemberVO;
import kr.or.kosta.mvc.dao.MemberDao;
//로그인만을 위한 컨트롤러
@Controller
public class LoginController {
	@Autowired
	private MemberDao memdao;
	
	@PostMapping("/u_loginProcess")
	public ModelAndView loginProcess(HttpSession session, HttpServletRequest request,MyMemberVO vo) {
		//데이터베이스에 존재하는 아이디 비밀번호와 입력값을 대조한 뒤 정상적인 내용이면  session에 저장해준다.
		System.out.println("id: "+vo.getMember_id());
		System.out.println("pwd: "+vo.getMember_password());
		vo.setMember_grade(memdao.gradechk(vo));
		System.out.println(vo.getMember_grade());
		MyMemberVO map = memdao.loginCheck(vo);
		ModelAndView mav = new ModelAndView();
		if(map == null) {
			mav.setViewName("u_loginerror");
		}else {
				session.setAttribute("uname", map.getMember_name());
				session.setAttribute("uid", vo.getMember_id());
				session.setAttribute("grade", vo.getMember_grade());
				mav.setViewName("redirect:u_main");
		}
		return mav;
	}
	
	@GetMapping("/u_logout")
	public ModelAndView logoutProcess(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("uname");
		session.removeAttribute("uid");
		session.removeAttribute("grade");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/");
		return mav;
	}//세션에 올라가있는 로그인한 회원의 정보를 제거한다.
	
	@GetMapping("/u_idcheck")
	public String idcheck(Model m,String member_id) {
		System.out.println(member_id);
		int cnt= memdao.IDchk(member_id);
		System.out.println(cnt);
		m.addAttribute("cnt", cnt);
		return "u_idcheck";
	}//회원가입시에 입력한 아이디가 DB에 있는지 확인한 후 있으면 1을 반환하고, 없으면 0을 반환하여 중복을 체크하는 메서드이다. 
	@PostMapping("/u_memberjoin")
	public String myMemberJoin(Model m, MyMemberVO vo) {
		memdao.insertmember(vo);
		return "redirect:u_joinsuccess";
	}//회원의 정보를 데이터베이스에 저장하는 메서드
}
