package kr.or.kosta.dto;

import java.util.List;

public class YS_MovieVO {
	private String movie_Number, movie_Title, movie_Open_Date, movie_Purchase_Date;
	private int movie_Price, movie_Rating, movie_View_Count, movie_Watch_Count, movie_Number_Of_Audience;
	private int movie_Investment, movie_CopyRight_Cost;
	
	private List<YS_Movie_tagVO> movie_tag;
	
	
	
	public String getMovie_Number() {
		return movie_Number;
	}
	public void setMovie_Number(String movie_Number) {
		this.movie_Number = movie_Number;
	}
	public String getMovie_Title() {
		return movie_Title;
	}
	public void setMovie_Title(String movie_Title) {
		this.movie_Title = movie_Title;
	}
	public String getMovie_Open_Date() {
		return movie_Open_Date;
	}
	public void setMovie_Open_Date(String movie_Open_Date) {
		this.movie_Open_Date = movie_Open_Date;
	}
	public String getMovie_Purchase_Date() {
		return movie_Purchase_Date;
	}
	public void setMovie_Purchase_Date(String movie_Purchase_Date) {
		this.movie_Purchase_Date = movie_Purchase_Date;
	}
	public int getMovie_Price() {
		return movie_Price;
	}
	public void setMovie_Price(int movie_Price) {
		this.movie_Price = movie_Price;
	}
	public int getMovie_Rating() {
		return movie_Rating;
	}
	public void setMovie_Rating(int movie_Rating) {
		this.movie_Rating = movie_Rating;
	}
	public int getMovie_View_Count() {
		return movie_View_Count;
	}
	public void setMovie_View_Count(int movie_View_Count) {
		this.movie_View_Count = movie_View_Count;
	}
	public int getMovie_Watch_Count() {
		return movie_Watch_Count;
	}
	public void setMovie_Watch_Count(int movie_Watch_Count) {
		this.movie_Watch_Count = movie_Watch_Count;
	}
	public int getMovie_Number_Of_Audience() {
		return movie_Number_Of_Audience;
	}
	public void setMovie_Number_Of_Audience(int movie_Number_Of_Audience) {
		this.movie_Number_Of_Audience = movie_Number_Of_Audience;
	}
	public int getMovie_Investment() {
		return movie_Investment;
	}
	public void setMovie_Investment(int movie_Investment) {
		this.movie_Investment = movie_Investment;
	}
	public int getMovie_CopyRight_Cost() {
		return movie_CopyRight_Cost;
	}
	public void setMovie_CopyRight_Cost(int movie_CopyRight_Cost) {
		this.movie_CopyRight_Cost = movie_CopyRight_Cost;
	}
	public List<YS_Movie_tagVO> getMovie_tag() {
		return movie_tag;
	}
	public void setMovie_tag(List<YS_Movie_tagVO> movie_tag) {
		this.movie_tag = movie_tag;
	}
	
	
	
}
