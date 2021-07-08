package com.kh.swith.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kh.swith.biz.StudyMemberBiz;
import com.kh.swith.dto.StudyMemberDto;

@RestController
@RequestMapping(path="/groupstudy")
public class StudyMemberController {
	private static final Logger logger = LoggerFactory.getLogger(StudyMemberController.class);
	
	@Autowired
	private StudyMemberBiz studymemberbiz;
	
	
	@RequestMapping(value="groupStudygetCount.do", method = RequestMethod.POST)
	@ResponseBody
	public int groupStudygetCount(@RequestBody String study_group_id) {
		logger.info("[GroupStudyController] groupStudygetCount.do");
		
		System.out.println("groupStudygetCount : " + study_group_id);
		
		int res = studymemberbiz.selectMemberCount(Integer.parseInt(study_group_id));
		
		return res;
	}
	
	
	@RequestMapping(value="groupStudySelectRole.do", method = RequestMethod.POST)
	@ResponseBody
	public String selectRole(@RequestBody StudyMemberDto dto) {
		
		logger.info("[GroupStudyController] groupStudySelectRole.do");
		
		System.out.println(dto.getMember_email());
		System.out.println(dto.getStudy_group_id());
		String res = studymemberbiz.selectRole(dto);
		System.out.println("role : " + res);
		
		return res;
	}
	
	@RequestMapping(value="groupStudygetList.do", method = RequestMethod.POST)
	@ResponseBody
	public List<StudyMemberDto> studyGetList(@RequestBody String studyId){
		
		logger.info("[GroupStudyController] groupStudygetList.do");
		
		System.out.println("스터디 번호 : " + studyId);
		
		return studymemberbiz.studyGetList(studyId);
	}
}
