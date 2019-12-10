package kr.or.kosta.dto;
public class ChartVO {
	
	
	/*
	 * 차트 VO
	 */
	
    private String analysistitle,analysisprice;
    private String analysistag;


	public String getAnalysisprice() {
		return analysisprice;
	}

	public void setAnalysisprice(String analysisprice) {
		this.analysisprice = analysisprice;
	}

	public String getAnalysistag() {
		return analysistag;
	}

	public void setAnalysistag(String analysistag) {
		this.analysistag = analysistag;
	}

	public String getAnalysistitle() {
		return analysistitle;
	}

	public void setAnalysistitle(String analysistitle) {
		this.analysistitle = analysistitle;
	}
    
}