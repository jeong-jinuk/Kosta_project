package kr.or.kosta.mvc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.List_tableVO;
import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.MyListsVO;


@Repository
public class MovieListDao {
	
	@Autowired
	private SqlSessionTemplate ss;
	
	//마이페이지 메인 하단에 내 재생목록들 출력할 때 사용 ks
	public List<MyListsVO> getMyMovieList(String userId){
		
		return ss.selectList("mymovielist.getMovieList",userId);
	}
	
	//내 재생목록 이름들만 얻어올때 사용ks
	public List<MyListsVO> getMvListNames(String userId){
		
		return ss.selectList("mymovielist.getMvListName",userId);
	}
	 
	
	//내 재생목록 추가할때 사용ks
	public void insertMyList(Map<String,String> map) {
		
		ss.insert("mymovielist.addMovieList",map);
	}
	//내 재생목록-> 영화 검색할때 사용ks
	public List<MovieVO> getSearchMvList(String keyword){
		System.out.println("keyword dao "+keyword);
		return ss.selectList("mymovielist.getSearchMvList",keyword);
	}
	
	//내 재생목록에서 검색한 영화들을 플레이리스트에 저장ks
	public void instMvPlayList(Map<String, String> map) {
		
		String[] temp = map.get("mvNumList").split(",");
		for(String a : temp) {
			System.out.println("dao ------------ "+a );
			map.put("movieNum", a);
		
		ss.insert("mymovielist.insertMvPlayList",map);
		}
	}
	
	//플레이리스트에 저장된 영상 목록들 불러올때 사용ks
	public List<List_tableVO> getPlaylistMv(String mylists_number){
		System.out.println("dao = "+mylists_number);
		return ss.selectList("mymovielist.getPlayListMv", mylists_number);
	}
	
	
	//플레이리스트 지우는 부분ks
	public void delPlayList(Map<String,String> map) {
		//플레이리스트를 삭제하려면 기존에 플레이리스트에 저장된 영상들을 다 삭제한 이후에 삭제해야
		//하는데 트리거를 사용한 상태라서 플레이리스트만 삭제하면 저장된 영상들도 같이 다 삭제된다.
		
		ss.delete("mymovielist.delPlayList",map);
	}
		
	//플레이리스트에 저장된 영상 지우는 부분ks
	public void delMvPlayList(Map<String,String> map) {
		
		ss.delete("mymovielist.delMvPlayList",map);
	}
	
	

}
