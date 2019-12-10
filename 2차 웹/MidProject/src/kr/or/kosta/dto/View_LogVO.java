package kr.or.kosta.dto;

public class View_LogVO {

	private int viewlog_number, member_number;
	private String movie_number, viewlog_date;

	public int getViewlog_number() {
		return viewlog_number;
	}

	public void setViewlog_number(int viewlog_number) {
		this.viewlog_number = viewlog_number;
	}

	public int getMember_number() {
		return member_number;
	}

	public void setMember_number(int member_number) {
		this.member_number = member_number;
	}

	public String getMovie_number() {
		return movie_number;
	}

	public void setMovie_number(String movie_number) {
		this.movie_number = movie_number;
	}

	public String getViewlog_date() {
		return viewlog_date;
	}

	public void setViewlog_date(String viewlog_date) {
		this.viewlog_date = viewlog_date;
	}

}
