package kr.or.kosta.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.kosta.mvc.dao.EventDao;

@Controller
public class EventController {
	@Autowired
	private EventDao edao;
	
	@GetMapping("/u_event")
	public String event(Model m) {
		int num = edao.Eventex();
		System.out.println(num);
		if(num == 1) {
			String event = edao.event();
			System.out.println(event);
			m.addAttribute("event",event);
		}
		return "u_event";
	}
}
