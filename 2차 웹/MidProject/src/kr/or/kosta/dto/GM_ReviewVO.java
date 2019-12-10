package kr.or.kosta.dto;

public class GM_ReviewVO {
	private String movie_number, usedwords_contents, usedwords_times;
	private int member_number;

	public String getMovie_number() {
		return movie_number;
	}

	public void setMovie_number(String movie_number) {
		this.movie_number = movie_number;
	}

	public String getUsedwords_contents() {
		return usedwords_contents;
	}

	public void setUsedwords_contents(String usedwords_contents) {
		this.usedwords_contents = usedwords_contents;
	}

	public String getUsedwords_times() {
		return usedwords_times;
	}

	public void setUsedwords_times(String usedwords_times) {
		this.usedwords_times = usedwords_times;
	}

	public int getMember_number() {
		return member_number;
	}

	public void setMember_number(int member_number) {
		this.member_number = member_number;
	}
}
