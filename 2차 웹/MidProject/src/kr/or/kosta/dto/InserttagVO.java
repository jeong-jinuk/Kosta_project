package kr.or.kosta.dto;

public class InserttagVO {

	
	/*
	 * 태그테이블vo
	 */
	private int tag_category_num,active_check_number ;
	private String tag_table_num;
	private String movie_number;
	
	public String getMovie_number() {
		return movie_number;
	}
	public void setMovie_number(String movie_number) {
		this.movie_number = movie_number;
	}
	private String tag_name;
	public int getTag_category_num() {
		return tag_category_num;
	}
	public void setTag_category_num(int tag_category_num) {
		this.tag_category_num = tag_category_num;
	}
	public int getActive_check_number() {
		return active_check_number;
	}
	public void setActive_check_number(int active_check_number) {
		this.active_check_number = active_check_number;
	}
	public String getTag_table_num() {
		return tag_table_num;
	}
	public void setTag_table_num(String tag_table_num) {
		this.tag_table_num = tag_table_num;
	}
	public String getTag_name() {
		return tag_name;
	}
	public void setTag_name(String namelist) {
		this.tag_name = namelist;
	}
	
	
}
