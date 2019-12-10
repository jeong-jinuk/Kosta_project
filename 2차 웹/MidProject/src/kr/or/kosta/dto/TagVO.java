package kr.or.kosta.dto;

import java.util.List;

public class TagVO {
    private String tag_table_num,tag_name;
    private int tag_category_num;
    private List<Tag_CategoryVO> tclist;
    //태그의 가중치저장
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
	public List<Tag_CategoryVO> getTclist() {
        return tclist;
    }
    public void setTclist(List<Tag_CategoryVO> tclist) {
        this.tclist = tclist;
    }
    public String getTag_table_num() {
        return tag_table_num;
    }
    public void setTag_table_num(String tag_table_num) {
        this.tag_table_num = tag_table_num;
    }
    public String getTag_name() {
        return tag_name;
    }
    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }
    public int getTag_category_num() {
        return tag_category_num;
    }
    public void setTag_category_num(int tag_category_num) {
        this.tag_category_num = tag_category_num;
    }
}