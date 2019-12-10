package kr.or.kosta.dto;

public class WatchLogVO {
	private int watchlog_number,member_number;
	private String movie_number,watchlog_date;
	public int getWatchlog_number() {
		return watchlog_number;
	}
	public void setWatchlog_number(int watchlog_number) {
		this.watchlog_number = watchlog_number;
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
	public String getWatchlog_date() {
		return watchlog_date;
	}
	public void setWatchlog_date(String watchlog_date) {
		this.watchlog_date = watchlog_date;
	}
}
