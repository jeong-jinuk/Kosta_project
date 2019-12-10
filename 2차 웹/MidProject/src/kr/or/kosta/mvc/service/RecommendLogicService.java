package kr.or.kosta.mvc.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.UserTagWeightedList;
import kr.or.kosta.dto.TagVO;
import kr.or.kosta.mvc.dao.MemberDao;
import kr.or.kosta.mvc.dao.MovieDao;
import kr.or.kosta.mvc.dao.RecommendDao;

@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,readOnly=true)
@Service
public class RecommendLogicService {

	
	@Autowired
	RecommendDao recommendDao;
	@Autowired
	MemberDao memberDao;
	

	public String getUserTagWeightedList(int member_number){
		UserTagWeightedList utwl=new UserTagWeightedList();
		//모든 멤버에 대한 리스트 구하는 코드 추가해야함.
		utwl.setMember_number(11);
		utwl=recommendDao.getMyList(utwl);
		/* 
		 *  utwl에 들어있는 멤버번호, 멤버가 가진 모든 리스트에대한 태그와 태그의 가중치들 정보가 저장되어있음.
		 *  연수씨꺼!!!	
		 */
		
	     List<UserTagWeightedList> user_list = null;
	        
	        String path="C:\\Users\\KOSTA\\Downloads\\세미프로젝트\\MidProject\\WebContent\\resources\\data\\";
	        StringBuffer svp=new StringBuffer();
	        svp.append(path).append("title").append(new SimpleDateFormat("yyyy-MM-dd").format(new Date())).append(".csv");
	        PrintWriter pw = null;  
	            
	        try {
	        	
	            pw=new PrintWriter(new File(svp.toString()));
	            StringBuffer sb = new StringBuffer();
	          
	            String cNameList = "Id,"+utwl.getMember_number()+",";
	            
	            sb.append(cNameList);
	            List<TagVO> ttvo=utwl.getList();    
	            int size=ttvo.size();
	            for(TagVO t: ttvo) {
//	                List<Tag_CategoryVO> cvo=t.getTag_category();
//	                for(Tag_CategoryVO c: cvo) {
	                for(int i =0; i<size+1; i++) {
	                sb.append(t.getTag_category_num()).append(",");
	                sb.append(t.getTag_table_num()).append(",");
	                sb.append(t.getSum_div_total()).append(",");
	                
	                    }
	                sb.append("=COUNT(A1:AOD1)").append(",");
	            sb.append("\n");
	            pw.write(sb.toString());
	            pw.close();
	           
	            }
	            } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            }
	        System.out.println("마무리");
	        
	             
		return "success";
	}
}
