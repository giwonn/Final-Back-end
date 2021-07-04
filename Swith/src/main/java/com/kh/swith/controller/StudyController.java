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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.swith.biz.StudyBiz;
import com.kh.swith.dto.StudyDto;

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
	
	@RequestMapping(value="studylist.do", method=RequestMethod.GET)
	@ResponseBody
	public List<StudyDto> selectStudyList(@RequestParam(value="lat") String lat, @RequestParam(value="lng") String lng, @RequestParam(value="dist") String dist){
		
//		System.out.println(lat + " dfdfd");
		
		Map map = new HashMap<String, Float>();
		map.put("lat", lat);
		map.put("lng", lng);
		map.put("dist", dist);
		
		return new ArrayList<StudyDto>(biz.selectStudyList(map));
	}
	
	@RequestMapping(value="study.do", method=RequestMethod.POST )
	@ResponseBody
	public Map<String, String> insertStudy(@RequestBody StudyDto dto,  @RequestHeader("Email") String usermail ){
		Map resMap = new HashMap<String, String>();
		
		//usermail의 값은 요청헤더에서 갖고오게 임시로 세팅하였다 유저의 여부 먼저 판단 하는 개념으로 가야함  
		String memberemail = usermail;
		dto.setStudygroupadmin(memberemail);
		
		int res = biz.insertStudy(dto, memberemail);
		System.out.println("id = "+ dto.getStudygroupid() + "email = " + usermail);  // 잘됨
		
		// study group id를 삽입후찾고 그 아이디를 이용해서 
		resMap.put("success", res > 0 ? "true" : "false");
	
		return resMap;
	}
	
	
	@RequestMapping(value="mystudy.do", method=RequestMethod.GET)
	@ResponseBody
	public List<StudyDto> selectMyStudyList(@RequestHeader("Email") String usermail){
		List<StudyDto> resList = new ArrayList<StudyDto>();
		
		resList = biz.selectMyStudyList(usermail);
		
		return resList;
	}
	
}
