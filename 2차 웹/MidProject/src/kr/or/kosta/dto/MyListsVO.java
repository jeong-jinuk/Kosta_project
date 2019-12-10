package kr.or.kosta.dto;

import java.util.List;

public class MyListsVO {
	
	//mlist_num - 리스트의 인덱스
	//mlist_name 마이페이지- 내 리스트 추가에서 유저가 설정한 리스트 이름
	private int mylists_number,member_number;
	private String mylists_name;
	private List<List_tableVO> ltList;
	
	
	
	public int getMember_number() {
		return member_number;
	}
	public void setMember_number(int member_number) {
		this.member_number = member_number;
	}
	public int getMylists_number() {
		return mylists_number;
	}
	public void setMylists_number(int mylists_number) {
		this.mylists_number = mylists_number;
	}
	public String getMylists_name() {
		return mylists_name;
	}
	public void setMylists_name(String mylists_name) {
		this.mylists_name = mylists_name;
	}
	public List<List_tableVO> getLtList() {
		return ltList;
	}
	public void setLtList(List<List_tableVO> ltList) {
		this.ltList = ltList;
	}
       
	    
}
