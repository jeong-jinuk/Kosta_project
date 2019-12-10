package kr.or.kosta.dto;

import java.util.List;

/*
 * 유저의 MyList들 속에 있는 영화들이 가지고잇는 태그들과 태그들의 가중치를 계산한 것을 저장할 클래스
 * */
public class UserTagWeightedList {
		int member_number;
		List<TagVO> list;
		public int getMember_number() {
			return member_number;
		}
		public void setMember_number(int member_number) {
			this.member_number = member_number;
		}
		public List<TagVO> getList() {
			return list;
		}
		public void setList(List<TagVO> list) {
			this.list = list;
		}
		
	
}
