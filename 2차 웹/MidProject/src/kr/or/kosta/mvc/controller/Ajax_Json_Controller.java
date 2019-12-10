package kr.or.kosta.mvc.controller;

import java.util.ArrayList;import java.util.HashMap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.dto.ChartVO;


/*
 * 
 * */
@RestController
public class Ajax_Json_Controller {
	
	@RequestMapping(value="/stringify", method=RequestMethod.POST)
    @ResponseBody
    public Object stringify(@RequestBody ChartVO chartvo) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", chartvo.getAnalysistitle());
       
        return map;
    }
	//차트를 위한 컨트롤러
	//ChartVO를 받는다.
	//여기서 Hashmap + Ajax + Property를 사용함.
	
	    @PostMapping("/restController")
	    public Object restController(@RequestBody ChartVO chartvo) {
	        ArrayList<String> arrList = new ArrayList<String>();
	      
	            arrList.add(chartvo.getAnalysistitle());
	            arrList.add(chartvo.getAnalysisprice());
	            arrList.add(chartvo.getAnalysistag());
	        
	        return arrList;
	    }
	    //restController
	    //차트의 값을 POST방식으로 하는 컨트롤러 역할임.
	}

	
	
