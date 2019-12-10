package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.mvc.dao.JoinLogDao;
import kr.or.kosta.mvc.dao.LoginLogDao;
import kr.or.kosta.mvc.dao.MovieSoldLogDao;
import kr.or.kosta.mvc.dao.ViewLogDao;
import kr.or.kosta.mvc.dao.WatchLogDao;
import kr.or.kosta.mvc.inter.LogDao;
import kr.or.kosta.mvc.service.LogService;
import kr.or.kosta.mvc.service.MovieService;

@RestController
@Controller
//�α� ��ȸ ���� ��û�� ó���� ��Ʈ�ѷ�
public class LogController {
	
	@Autowired
	private LogService logService;
	
	@GetMapping("/getLogData1")
	public List<Integer> getLoginLogData(String cmd) {
		System.out.println("test getlogdata1");
		return logService.getLoginLogData(cmd);
	}
	@GetMapping("/getLogData2")
	public List<Integer> getMovieSoldLogData(String cmd) {
		return logService.getMovieSoldLogData(cmd);
	}
	@GetMapping("/getLogData3")
	public List<Integer> getViewLogData(String cmd) {
		return logService.getViewLogData(cmd);
	}
	@GetMapping("/getLogData4")
	public List<Integer> getLogData4(String cmd) {
		return logService.getWatchLogData(cmd);
	}
	@GetMapping("/getLogData5")
	public List<Integer> getJoinLogData(String cmd) {
		return logService.getJoinLogData(cmd);
	}
}
