package kr.or.kosta.dto;

import java.util.List;

public class TagtableVO {
	
	/*
	 * 태그테이블vo
	 */

	private int tag_category_num;
	private String tag_table_num, tag_name;
	
	
	
	private MovietagVO movietagvo;
	private MovieVO movievo;
	
	
	private List<Tag_CategoryVO> tag_category;
	private double sum, sum_div_total;
	
	
	public List<Tag_CategoryVO> getTag_category() {
		return tag_category;
	}
	public void setTag_category(List<Tag_CategoryVO> tag_category) {
		this.tag_category = tag_category;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getSum_div_total() {
		return sum_div_total;
	}
	public void setSum_div_total(double sum_div_total) {
		this.sum_div_total = sum_div_total;
	}
	public MovietagVO getMovietagvo() {
		return movietagvo;
	}
	public void setMovietagvo(MovietagVO movietagvo) {
		this.movietagvo = movietagvo;
	}
	public MovieVO getMovievo() {
		return movievo;
	}
	public void setMovievo(MovieVO movievo) {
		this.movievo = movievo;
	}
	public int getTag_category_num() {
		return tag_category_num;
	}
	public void setTag_category_num(int tag_category_num) {
		this.tag_category_num = tag_category_num;
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
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}
	
}
