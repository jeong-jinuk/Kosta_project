package kr.or.kosta.dto;

import java.util.List;

public class YS_Tag_TableVO {
	private int tag_Category_Num;
	private String tag_Table_Num, tag_Name;
	private List<YS_Tag_CategoryVO> tag_category;
	private double sum, sum_div_total;
	
	
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getSum_div_total() {
		return sum_div_total;
	}
	public void setSum_div_total(double sum_div_total) {
		this.sum_div_total = sum_div_total;
	}
	public int getTag_Category_Num() {
		return tag_Category_Num;
	}
	public void setTag_Category_Num(int tag_Category_Num) {
		this.tag_Category_Num = tag_Category_Num;
	}
	public String getTag_Table_Num() {
		return tag_Table_Num;
	}
	public void setTag_Table_Num(String tag_Table_Num) {
		this.tag_Table_Num = tag_Table_Num;
	}
	public String getTag_Name() {
		return tag_Name;
	}
	public void setTag_Name(String tag_Name) {
		this.tag_Name = tag_Name;
	}
	public List<YS_Tag_CategoryVO> getTag_category() {
		return tag_category;
	}
	public void setTag_category(List<YS_Tag_CategoryVO> tag_category) {
		this.tag_category = tag_category;
	}
	
	
	
}
