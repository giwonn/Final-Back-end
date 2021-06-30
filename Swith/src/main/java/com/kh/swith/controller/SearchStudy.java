package com.kh.swith.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.swith.biz.SearchBiz;
import com.kh.swith.dto.StudyDto;

@Controller
public class SearchStudy {
	private static final Logger logger = LoggerFactory.getLogger(SearchStudy.class);
	
	@Autowired
	private SearchBiz biz;
	
	@RequestMapping(value="searchstudy.do", method=RequestMethod.GET)
	@ResponseBody
	public List<StudyDto> selectStudyList(){
		List<StudyDto> res = new ArrayList<StudyDto>();
		
		res = biz.selectStudyList();
		
		return res;
	}
}
