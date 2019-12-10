package kr.or.kosta.dto;

public class GM_Movie_RatingVO {
	String movie_number;
	int movie_rating, member_number;

	public int getMovie_rating() {
		return movie_rating;
	}

	public void setMovie_rating(int movie_rating) {
		this.movie_rating = movie_rating;
	}

	public String getMovie_number() {
		return movie_number;
	}

	public void setMovie_number(String movie_number) {
		this.movie_number = movie_number;
	}

	public int getMember_number() {
		return member_number;
	}

	public void setMember_number(int member_number) {
		this.member_number = member_number;
	}
}
