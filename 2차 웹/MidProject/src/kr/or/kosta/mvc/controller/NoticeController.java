package kr.or.kosta.mvc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.or.kosta.dto.NoticeVO;
import kr.or.kosta.mvc.dao.NoticeDao;

@RestController
@Controller
public class NoticeController {
	
	@Autowired
	private NoticeDao noticeDao;
	
	//공지사항을 출력하는 컨트롤러
	@RequestMapping("/noticeselect")
	public List<NoticeVO> shownotice() {
		System.out.println("출력");
		List<NoticeVO> list = noticeDao.shownotice();

		return list;
	}
	//공지사항을 입력하는 컨트롤러
	@RequestMapping("/innotice")
	public String insertnotice(NoticeVO nvo) throws Exception {
		System.out.println("입력");
		noticeDao.insertnotice(nvo);
		return"success";
	}
}
