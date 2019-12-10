package kr.or.kosta.dto;

public class GM_RankVO {
	private String movie_number;
	private int member_number, rank_number;

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

	public int getRank_number() {
		return rank_number;
	}

	public void setRank_number(int rank_number) {
		this.rank_number = rank_number;
	}
}
