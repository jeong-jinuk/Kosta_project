package kr.or.kosta.dto;

import java.util.List;

public class Movie_tagVO {
	private String movie_Number, tag_Table_Num;
	private List<TagtableVO> tag_table;
	private List<Tag_TableVO1> tag_table1;
	
	public List<Tag_TableVO1> getTag_table1() {
		return tag_table1;
	}
	public void setTag_table1(List<Tag_TableVO1> tag_table1) {
		this.tag_table1 = tag_table1;
	}
	public List<TagtableVO> getTag_table() {
		return tag_table;
	}
	public void setTag_table(List<TagtableVO> tag_table) {
		this.tag_table = tag_table;
	}
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

	

}
