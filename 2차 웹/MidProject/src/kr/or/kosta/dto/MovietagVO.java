package kr.or.kosta.dto;

import java.util.List;

public class MovietagVO {
	
	/*
	 * 臾대퉬�깭洹퇦O
	 */

	private String movie_title, movie_open_date, movie_purchase_date,tag_name, movie_number;
	private int movie_price, movie_view_count, movie_watch_count, movie_number_of_audience,movie_investment, 
	movie_copylight_cost,active_check_number;
	private double movie_rating;
	private String tag_table_num;
	private List<TagVO> tlist;
	
	private List<Movie_tagVO> movie_tag;
	
	public List<Movie_tagVO> getMovie_tag() {
		return movie_tag;
	}
	public void setMovie_tag(List<Movie_tagVO> movie_tag) {
		this.movie_tag = movie_tag;
	}
	public List<TagVO> getTlist() {
		return tlist;
	}
	public void setTlist(List<TagVO> tlist) {
		this.tlist = tlist;
	}
	private MovieVO movievo;
	private TagtableVO tagtablevo;

	public MovieVO getMovievo() {
		return movievo;
	}
	public void setMovievo(MovieVO movievo) {
		this.movievo = movievo;
	}
	public int getActive_check_number() {
		return active_check_number;
	}
	public void setActive_check_number(int active_check_number) {
		this.active_check_number = active_check_number;
	}
	public TagtableVO getTagtablevo() {
		return tagtablevo;
	}
	public void setTagtablevo(TagtableVO tagtablevo) {
		this.tagtablevo = tagtablevo;
	}
	
	public String getMovie_number() {
		return movie_number;
	}
	public void setMovie_number(String movie_number) {
		this.movie_number = movie_number;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getMovie_open_date() {
		return movie_open_date;
	}
	public void setMovie_open_date(String movie_open_date) {
		this.movie_open_date = movie_open_date;
	}
	public String getMovie_purchase_date() {
		return movie_purchase_date;
	}
	public void setMovie_purchase_date(String movie_purchase_date) {
		this.movie_purchase_date = movie_purchase_date;
	}
	public String getTag_name() {
		return tag_name;
	}
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}
	public int getMovie_price() {
		return movie_price;
	}
	public void setMovie_price(int movie_price) {
		this.movie_price = movie_price;
	}
	public int getMovie_view_count() {
		return movie_view_count;
	}
	public void setMovie_view_count(int movie_view_count) {
		this.movie_view_count = movie_view_count;
	}
	public int getMovie_watch_count() {
		return movie_watch_count;
	}
	public void setMovie_watch_count(int movie_watch_count) {
		this.movie_watch_count = movie_watch_count;
	}
	public int getMovie_number_of_audience() {
		return movie_number_of_audience;
	}
	public void setMovie_number_of_audience(int movie_number_of_audience) {
		this.movie_number_of_audience = movie_number_of_audience;
	}
	public int getMovie_investment() {
		return movie_investment;
	}
	public void setMovie_investment(int movie_investment) {
		this.movie_investment = movie_investment;
	}
	public int getMovie_copylight_cost() {
		return movie_copylight_cost;
	}
	public void setMovie_copylight_cost(int movie_copylight_cost) {
		this.movie_copylight_cost = movie_copylight_cost;
	}
	public double getMovie_rating() {
		return movie_rating;
	}
	public void setMovie_rating(double movie_rating) {
		this.movie_rating = movie_rating;
	}
	public String getTag_table_num() {
		return tag_table_num;
	}
	public void setTag_table_num(String tag_table_num) {
		this.tag_table_num = tag_table_num;
	}
	
}
