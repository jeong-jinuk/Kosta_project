package kr.or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.MemberVO;

@Repository
public class Admin_MemberDao {

	@Autowired
	private SqlSessionTemplate ss;

	// 회원 정보 리스트 출력
	public List<MemberVO> getMemberList(Map<String, String> map) {
		System.out.println(map);
		List<MemberVO> list = ss.selectList("admin_member.showMember", map);
		return list;
	}

	// 회원 상세 정보 출력
	public MemberVO getMemberDetail(int member_number) {
		return ss.selectOne("admin_member.showMemberDetail", member_number);
	}

	// 회원 정보 수정
	public void updateMember(MemberVO vo) {
		ss.update("admin_member.updateMember", vo);
	}
}
