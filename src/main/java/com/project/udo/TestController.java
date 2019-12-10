package com.project.udo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.udo.service.TestService;
import com.project.udo.vo.TestVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {
	
	@Autowired
	TestService testservice;
	
	@RequestMapping(value = "/test")
	public String freeboard(Model model) {
		
		List<TestVo> resultlist = testservice.findAllNotice();
		
		model.addAttribute("resultlist", resultlist);
		return "test";
	}
	
}
