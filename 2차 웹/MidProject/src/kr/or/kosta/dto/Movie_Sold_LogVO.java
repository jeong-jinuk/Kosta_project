package kr.or.kosta.dto;

public class Movie_Sold_LogVO {

	private int soldlog_number, member_number, movie_price;
	private String movie_number, movie_sold_date;
	private PriceVO price;

	public PriceVO getPrice() {
		return price;
	}

	public void setPrice(PriceVO price) {
		this.price = price;
	}

	public int getSoldlog_number() {
		return soldlog_number;
	}

	public void setSoldlog_number(int soldlog_number) {
		this.soldlog_number = soldlog_number;
	}

	public int getMember_number() {
		return member_number;
	}

	public void setMember_number(int member_number) {
		this.member_number = member_number;
	}

	public int getMovie_price() {
		return movie_price;
	}

	public void setMovie_price(int movie_price) {
		this.movie_price = movie_price;
	}

	public String getMovie_number() {
		return movie_number;
	}

	public void setMovie_number(String movie_number) {
		this.movie_number = movie_number;
	}

	public String getMovie_sold_date() {
		return movie_sold_date;
	}

	public void setMovie_sold_date(String movie_sold_date) {
		this.movie_sold_date = movie_sold_date;
	}

}
