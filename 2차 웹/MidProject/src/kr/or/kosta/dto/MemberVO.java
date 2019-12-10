package kr.or.kosta.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class MemberVO {
	
	/*
	 * 멤버테이블vo
	 */
	int member_number,member_grade,member_community_number;
	
	//환석 추가 부분
	private String member_id, member_name, member_password, member_birth, member_picture, member_join_date;
	private int active_check_number;
	private List<Login_LogVO> login_log;
	private List<Movie_Sold_LogVO> movie_sold_log;
	private List<Watch_LogVO> watch_log;
	private MultipartFile mfile;

	public String getMember_join_date() {
		return member_join_date;
	}

	public void setMember_join_date(String member_join_date) {
		this.member_join_date = member_join_date;
	}

	public int getActive_check_number() {
		return active_check_number;
	}

	public void setActive_check_number(int active_check_number) {
		this.active_check_number = active_check_number;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_password() {
		return member_password;
	}

	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}

	public String getMember_birth() {
		return member_birth;
	}

	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}

	public String getMember_picture() {
		return member_picture;
	}

	public void setMember_picture(String member_picture) {
		this.member_picture = member_picture;
	}

	public List<Login_LogVO> getLogin_log() {
		return login_log;
	}

	public void setLogin_log(List<Login_LogVO> login_log) {
		this.login_log = login_log;
	}

	public List<Movie_Sold_LogVO> getMovie_sold_log() {
		return movie_sold_log;
	}

	public void setMovie_sold_log(List<Movie_Sold_LogVO> movie_sold_log) {
		this.movie_sold_log = movie_sold_log;
	}

	public List<Watch_LogVO> getWatch_log() {
		return watch_log;
	}

	public void setWatch_log(List<Watch_LogVO> watch_log) {
		this.watch_log = watch_log;
	}

	public MultipartFile getMfile() {
		return mfile;
	}

	public void setMfile(MultipartFile mfile) {
		this.mfile = mfile;
	}

	public int getMember_number() {
		return member_number;
	}

	public void setMember_number(int member_number) {
		this.member_number = member_number;
	}

	public int getMember_grade() {
		return member_grade;
	}

	public void setMember_grade(int member_grade) {
		this.member_grade = member_grade;
	}

	public int getMember_community_number() {
		return member_community_number;
	}

	public void setMember_community_number(int member_community_number) {
		this.member_community_number = member_community_number;
	}
	

}
