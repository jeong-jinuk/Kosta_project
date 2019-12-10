package kr.or.kosta.dto;

public class GM_MovieVO {
	private int movie_price, movie_view_count, movie_watch_count, movie_investment, movie_copyright_cost,
			movie_number_of_audience;
	private double movie_rating;
	private String movie_title, movie_purchase_date, movie_open_date, movie_number;

	public String getMovie_number() {
		return movie_number;
	}

	public void setMovie_number(String movie_number) {
		this.movie_number = movie_number;
	}

	public int getMovie_price() {
		return movie_price;
	}

	public void setMovie_price(int movie_price) {
		this.movie_price = movie_price;
	}

	public double getMovie_rating() {
		return movie_rating;
	}

	public void setMovie_rating(double movie_rating) {
		this.movie_rating = movie_rating;
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

	public int getMovie_investment() {
		return movie_investment;
	}

	public void setMovie_investment(int movie_investment) {
		this.movie_investment = movie_investment;
	}

	public int getMovie_copyright_cost() {
		return movie_copyright_cost;
	}

	public void setMovie_copyright_cost(int movie_copyright_cost) {
		this.movie_copyright_cost = movie_copyright_cost;
	}

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public String getMovie_purchase_date() {
		return movie_purchase_date;
	}

	public void setMovie_purchase_date(String movie_purchase_date) {
		this.movie_purchase_date = movie_purchase_date;
	}

	public int getMovie_number_of_audience() {
		return movie_number_of_audience;
	}

	public void setMovie_number_of_audience(int movie_number_of_audience) {
		this.movie_number_of_audience = movie_number_of_audience;
	}

	public String getMovie_open_date() {
		return movie_open_date;
	}

	public void setMovie_open_date(String movie_open_date) {
		this.movie_open_date = movie_open_date;
	}
}
