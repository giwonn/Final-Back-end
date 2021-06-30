package com.kh.swith.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.swith.biz.MemberBiz;
import com.kh.swith.dto.MemberDto;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberBiz memberBiz;
	
	@RequestMapping(value="/MemberCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public String selectMember(@RequestBody String email) {
		
		System.out.println(email);
		
		String res = "NotUser";
		
		
		return res;
	}
	
	@RequestMapping(value="/MemberInsert.do", method = RequestMethod.POST)
	@ResponseBody
	public String InsertMember(@RequestBody MemberDto memberDto) {
		
		System.out.println("Test : " + memberDto.getNickName());	
		
//		if (memberBiz.MemberInsert(memberDto) > 0) {
//			return "일정 등록 성공!";
//		}
		
		return "일정 등록 실패!";
	}
}
