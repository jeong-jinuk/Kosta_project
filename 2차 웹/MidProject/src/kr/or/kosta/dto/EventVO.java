package kr.or.kosta.dto;

public class EventVO {
	private int event_number, notice_number;
	private String tag_Table_Num, event_Image,event_Start_Date, event_End_Date;
	
	public int getEvent_number() {
		return event_number;
	}
	public void setEvent_number(int event_number) {
		this.event_number = event_number;
	}
	public int getNotice_number() {
		return notice_number;
	}
	public void setNotice_number(int notice_number) {
		this.notice_number = notice_number;
	}
	public String getTag_Table_Num() {
		return tag_Table_Num;
	}
	public void setTag_Table_Num(String tag_Table_Num) {
		this.tag_Table_Num = tag_Table_Num;
	}
	public String getEvent_Image() {
		return event_Image;
	}
	public void setEvent_Image(String event_Image) {
		this.event_Image = event_Image;
	}
	public String getEvent_Start_Date() {
		return event_Start_Date;
	}
	public void setEvent_Start_Date(String event_Start_Date) {
		this.event_Start_Date = event_Start_Date;
	}
	public String getEvent_End_Date() {
		return event_End_Date;
	}
	public void setEvent_End_Date(String event_End_Date) {
		this.event_End_Date = event_End_Date;
	}
	
}
