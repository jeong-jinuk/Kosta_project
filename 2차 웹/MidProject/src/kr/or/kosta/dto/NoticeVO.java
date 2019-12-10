package kr.or.kosta.dto;

import java.util.List;

public class NoticeVO {
	private int notice_number;
	private String notice_title, notice_content, notice_date;
	private List<EventVO> eventvo;
	
	
	public List<EventVO> getEventvo() {
		return eventvo;
	}
	public void setEventvo(List<EventVO> eventvo) {
		this.eventvo = eventvo;
	}
	public int getNotice_number() {
		return notice_number;
	}
	public void setNotice_number(int notice_number) {
		this.notice_number = notice_number;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}

	public String getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(String notice_date) {
		this.notice_date = notice_date;
	}
	
	
}
