package kr.or.kosta.dto;

//해당 VO는 db에 있는 테이블의 vo는 아니고, 마이페이지-> 내 사용금액 평균값 구할 때 값을 편하게 가져오기 위해 제작함. map으로 리턴받으니까 출력이 제대로 안되서 일단 제작
public class userChartViewVO {
	public String sold_date;
	public int average;
	
	public String getSold_date() {
		return sold_date;
	}
	public void setSold_date(String sold_date) {
		this.sold_date = sold_date;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	
}
