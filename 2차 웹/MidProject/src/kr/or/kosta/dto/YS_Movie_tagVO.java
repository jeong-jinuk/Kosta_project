package kr.or.kosta.dto;

import java.util.List;

public class YS_Movie_tagVO {
	private String movie_Number, tag_Table_Num;
	private List<YS_Tag_TableVO> tag_table;
	
	public String getMovie_Number() {
		return movie_Number;
	}
	public void setMovie_Number(String movie_Number) {
		this.movie_Number = movie_Number;
	}
	public String getTag_Table_Num() {
		return tag_Table_Num;
	}
	public void setTag_Table_Num(String tag_Table_Num) {
		this.tag_Table_Num = tag_Table_Num;
	}
	public List<YS_Tag_TableVO> getTag_table() {
		return tag_table;
	}
	public void setTag_table(List<YS_Tag_TableVO> tag_table) {
		this.tag_table = tag_table;
	} 
	

}
