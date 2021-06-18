package com.kh.swith.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.swith.biz.StudyBiz;
import com.kh.swith.dto.StudyDto;
import com.kh.swith.test.controller.TestController;

/**
 * Study Group Controller
 * 
 *  
 *  
 */

@Controller
public class StudyController {
	private static final Logger logger = LoggerFactory.getLogger(StudyController.class);
	
	@Autowired
	private StudyBiz biz;
	
	@RequestMapping(value="study/list.do", method=RequestMethod.GET)
	@ResponseBody
	public List<StudyDto> selectStudyList(){
		List<StudyDto> res = new ArrayList<StudyDto>();
		
		res = biz.selectStudyList();
		
		return res ;
	}
	
	@RequestMapping(value="study.do", method=RequestMethod.POST )
	@ResponseBody
	public Map<String, String> insertStudy(@RequestBody StudyDto dto){
		Map resMap = new HashMap<String, String>();
		
		// TODO: 실패 성공시 HTTP 통신 코드 넣는 법 알아서 설정해놓기 
		System.out.println(
				"study group name = " + dto.getStudygroupname()
				+"study group desc = " + dto.getStudygroupdesc()
				+"study group offline = " + dto.getStudygroupoffline()
				+"arrdid = " + dto.getStudygroupaddrid()
				+"addr = " + dto.getStudygroupaddr()
				+"studygrouppw = " + dto.getStudygrouppw());
		
		int res = biz.insertStudy(dto);
		
		resMap.put("success", res > 0 ? "true" : "false");
		System.out.println(res);
		return resMap;
	}
}