package kr.or.kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.mvc.dao.ResearchDao;

@RestController
@RequestMapping("/u_research")
public class ProjectRestController {
	@Autowired
	private ResearchDao rdao;
	@RequestMapping("/u_re.data")
	public List<String> getResearchData(){
		List<String> list = rdao.movietitle();
		return list;
	}
	//http://localhost:9999/halfProject/research/re.data
}
