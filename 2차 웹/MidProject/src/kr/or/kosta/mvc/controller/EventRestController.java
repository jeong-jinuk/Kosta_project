package kr.or.kosta.mvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.Movie_tagVO;
import kr.or.kosta.dto.Tag_CategoryVO;
import kr.or.kosta.dto.Tag_TableVO;
import kr.or.kosta.mvc.dao.EventDao;
import kr.or.kosta.mvc.service.EventService;

@RestController
@RequestMapping
public class EventRestController {
	
	@Autowired
	private EventService eventservice;
	
	@RequestMapping(value="/eventinsert_chk", produces="application/text;charset=utf8")
	public String eventinsert_chk(String event_name, String event_type) {
		return eventservice.eventinsert_chk(event_name, event_type);

	}
	}
