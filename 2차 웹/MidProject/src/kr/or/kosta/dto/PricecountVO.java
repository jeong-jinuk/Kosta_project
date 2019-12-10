package kr.or.kosta.dto;

public class PricecountVO {

	/*
	 *  price count VO
	 */
	
	private int price1,price2,price3,price4,price5, movie_price;

	public int getMovie_price() {
		return movie_price;
	}

	public void setMovie_price(int movie_price) {
		this.movie_price = movie_price;
	}

	public int getPrice1() {
		return price1;
	}

	public void setPrice1(int price1) {
		this.price1 = price1;
	}

	public int getPrice2() {
		return price2;
	}

	public void setPrice2(int price2) {
		this.price2 = price2;
	}

	public int getPrice3() {
		return price3;
	}

	public void setPrice3(int price3) {
		this.price3 = price3;
	}

	public int getPrice4() {
		return price4;
	}

	public void setPrice4(int price4) {
		this.price4 = price4;
	}

	public int getPrice5() {
		return price5;
	}

	public void setPrice5(int price5) {
		this.price5 = price5;
	}
	
	
	public PricecountVO (int price1,int price2, int price3,int price4, int price5) {
		super();
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		this.price4 = price4;
		this.price5 = price5;
		
	}
	
}
