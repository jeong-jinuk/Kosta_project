package kr.or.kosta.mvc.dao;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import kr.or.kosta.dto.InserttagVO;

public class CommunityDao {
		
	public static int[] countlist;
        /*
         * 한번만 로드해야 할 목록  a
         */
	public void connectR() throws REXPMismatchException{	 
		
			try {
				System.out.println("연결시작");
			RConnection connection =  null;
            
            
            
        	connection = new RConnection();
        	//R과 스프링 연결
        	connection.eval("library(caret)");
        	connection.eval("library('readxl')");
        	//R에서 라이브러리 호출
        	
        	connection.parseAndEval("amazon2<-read_xlsx('C:/RTest/amazon.xlsx')");
        	//엑셀파일 불러오기
        	connection.eval("amazonkmeans <- kmeans(amazon2, centers=10, iter.max=10000)");
        	//k_means 알고리즘 적용
        	connection.eval("amazonkmeans$cluster");
        	//데이터리스트 받아오기
        	
        	countlist = connection.eval("amazonkmeans$cluster").asIntegers();
        	        	for(int i=0; i<=29; i++) {
        	System.out.println(countlist[i]);
        	
        	        	}
        	connection.close();
        	System.out.println("엔딩");
    		
			}catch(Exception e) {
				e.getStackTrace();
			}
		
//			return RCommunitylist;
			
		
       
}
}
        


 


