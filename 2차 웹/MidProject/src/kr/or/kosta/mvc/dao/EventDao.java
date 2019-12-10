package kr.or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.EventVO;
import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.YS_MovieVO;

@Repository
public class EventDao {
	@Autowired
	private SqlSessionTemplate ss;
	
	public int Eventex() {
		return ss.selectOne("event.exist");
	}
	
	public String event() {
		return ss.selectOne("event.show");
	}
	
	public List<YS_MovieVO> event_in_target(Map<String, String> map) {
		return ss.selectList("event.event_in_target_select", map);
		
	}
	
	public void event_insert(EventVO evo) {
		ss.insert("event.insert", evo);
	}
}
