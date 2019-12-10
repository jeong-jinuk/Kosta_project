package kr.or.kosta.dto;

public class Search_LogVO {

	private int searchlog_number;
	private int member_number;
	private String tag_table_num;
	private String searchlog_word;
	private String searchlog_date;

	public String getTag_table_num() {
		return tag_table_num;
	}

	public void setTag_table_num(String tag_table_num) {
		this.tag_table_num = tag_table_num;
	}

	public int getSearchlog_number() {
		return searchlog_number;
	}

	public void setSearchlog_number(int searchlog_number) {
		this.searchlog_number = searchlog_number;
	}

	public int getMember_number() {
		return member_number;
	}

	public void setMember_number(int member_number) {
		this.member_number = member_number;
	}

	

	public String getSearchlog_word() {
		return searchlog_word;
	}

	public void setSearchlog_word(String searchlog_word) {
		this.searchlog_word = searchlog_word;
	}

	public String getSearchlog_date() {
		return searchlog_date;
	}

	public void setSearchlog_date(String searchlog_date) {
		this.searchlog_date = searchlog_date;
	}

}
