package kr.or.kosta.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.Login_LogVO;
import kr.or.kosta.dto.MyMemberVO;


@Repository
public class MemberDao {
	@Autowired
	private SqlSessionTemplate ss;
	
	public void insertmember(MyMemberVO vo) {
		ss.insert("member.join",vo);
	}

	public int IDchk(String id) {	
		return ss.selectOne("member.idChk",id);
	}

	public MyMemberVO loginCheck(MyMemberVO vo) {		
		return ss.selectOne("member.loginchk",vo);
	}

	public void llogging(MyMemberVO vo) {
		Login_LogVO llvo = new Login_LogVO();
		int num = ss.selectOne("member.memnum",vo);
		llvo.setMember_number(num);
		ss.insert("loginlog.login",llvo);
	}

	public void logoutlogging(String uid) {//세션에 있는 uid값을 받아와서
		Login_LogVO llvo = new Login_LogVO();
		MyMemberVO mvo = new MyMemberVO();
		mvo.setMember_id(uid);//mvo에 셋팅해주고
		int memnum =ss.selectOne("member.memnum",mvo);//db에 있는 멤버번호를 호출해와서
		llvo.setMember_number(memnum);//llvo에 셋팅한뒤
		int num = ss.selectOne("loginlog.che",llvo);//그를 통해 가장 최근의 로그인 기록의 로그인 번호를 가져와서
		llvo.setLoginlog_number(num);
		ss.update("loginlog.logout",llvo);//로그인 번호에 업데이트
	}

	public int gradechk(MyMemberVO vo) {
		System.out.println(vo.getMember_id());
		return ss.selectOne("member.gradechk",vo);
	}

	public List<Integer> getMemberNumberAll() {
		// TODO Auto-generated method stub
		return ss.selectList("member.membernumberall");
	}
	
	//계정설정 > 탈퇴시 사용 ks
		public void outUserAccount(String userId) {
			ss.delete("member.outUserAccount",userId);
	}

}
