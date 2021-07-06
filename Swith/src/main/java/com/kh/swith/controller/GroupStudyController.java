package com.kh.swith.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/groupstudy")
public class GroupStudyController {
	private static final Logger logger = LoggerFactory.getLogger(GroupStudyController.class);
	
	@RequestMapping(value="groupStudySelectRole.do", method = RequestMethod.POST)
	@ResponseBody
	public String selectRole(@RequestBody HashMap<String, String> data) {
		
		logger.info("[GroupStudyController] groupStudySelectRole.do");
		
		System.out.println(data.get("email"));
		System.out.println(data.get("studyId"));
		String res = "";
		
		return res;
	}
}
