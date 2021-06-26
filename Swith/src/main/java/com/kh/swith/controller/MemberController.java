package com.kh.swith.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	
	@RequestMapping(value="/MemberCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public String selectMember(@RequestBody String email) {
		
		System.out.println(email);
		
		String res = "hi";
		
		
		return res;
	}
	
}
