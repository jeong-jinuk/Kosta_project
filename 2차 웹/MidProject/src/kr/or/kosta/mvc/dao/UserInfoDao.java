package kr.or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.MyMemberVO;
import kr.or.kosta.dto.userChartViewVO;


@Repository
public class UserInfoDao {  
	
	@Autowired 
	private SqlSessionTemplate ss;
	//마이페이지- 유저 정보 관련 dao .        ks 
	public void instUserMvFilter(Map<String, String> map) {
		ss.delete("userInfo.delUserFilter",map);
		
		String[] temp = map.get("filterList").split(",");
		for(String a : temp) {
			map.put("filterNum", a);
		
		ss.insert("userInfo.insertUserFilter",map);
		}
	}
	public List<String> getUserFilterList(String userId) { 
		return ss.selectList("userInfo.getFilterList",userId);
	}
	
	public void updateUserInfo(MyMemberVO memvo) { 
		
		ss.update("member.updateUserInfo",memvo);
	}
	
	public MyMemberVO getMemberInfo(String userId) {  
		return ss.selectOne("member.getUserInfo",userId);
	}
	
	public List<MovieVO> getMyRankInfo(String userId) { 
		return ss.selectList("userInfo.getMyRankList",userId);
	}
	
	//차트 데이터 받아오는 메서드
	public List<userChartViewVO> getAvgSoldList(Map<String,String> map){ 
		
		return ss.selectList("userInfo.getAvgSoldData",map);
	}
	
	//검색어 로그 저장하는 부분. 
	public void instUserSearchLog(Map<String,String> map) {
		
		ss.insert("userInfo.insertSearchLog",map);
	}
 	

}
