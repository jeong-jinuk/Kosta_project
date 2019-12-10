package kr.or.kosta.mvc.dao;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import kr.or.kosta.dto.InserttagVO;

public class CommunityDao {
		
	public static int[] countlist;
        /*
         * �ѹ��� �ε��ؾ� �� ���  a
         */
	public void connectR() throws REXPMismatchException{	 
		
			try {
				System.out.println("�������");
			RConnection connection =  null;
            
            
            
        	connection = new RConnection();
        	//R�� ������ ����
        	connection.eval("library(caret)");
        	connection.eval("library('readxl')");
        	//R���� ���̺귯�� ȣ��
        	
        	connection.parseAndEval("amazon2<-read_xlsx('C:/RTest/amazon.xlsx')");
        	//�������� �ҷ�����
        	connection.eval("amazonkmeans <- kmeans(amazon2, centers=10, iter.max=10000)");
        	//k_means �˰��� ����
        	connection.eval("amazonkmeans$cluster");
        	//�����͸���Ʈ �޾ƿ���
        	
        	countlist = connection.eval("amazonkmeans$cluster").asIntegers();
        	        	for(int i=0; i<=29; i++) {
        	System.out.println(countlist[i]);
        	
        	        	}
        	connection.close();
        	System.out.println("����");
    		
			}catch(Exception e) {
				e.getStackTrace();
			}
		
//			return RCommunitylist;
			
		
       
}
}
        


 


