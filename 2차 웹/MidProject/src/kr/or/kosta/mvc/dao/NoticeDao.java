package kr.or.kosta.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.NoticeVO;

@Repository
public class NoticeDao {
	
	@Autowired
	private SqlSessionTemplate ss;
	
	public void insertnotice(NoticeVO nvo) {
		ss.insert("notice.insert", nvo);
	}
	
	public List<NoticeVO> shownotice() {
		List<NoticeVO> list = ss.selectList("notice.select");
		return list;
		
	}
	public int select_notice_num() {
		int res = ss.selectOne("notice.select_num");
		return res;
	}
	
}
