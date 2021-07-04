package com.kh.swith.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.swith.biz.TodoMyBiz;
import com.kh.swith.dto.TodoMyDto;

@Controller
public class TodoMyController {
	private static final Logger logger = LoggerFactory.getLogger(TodoMyController.class);
	
	@Autowired
	private TodoMyBiz biz;
	
	@RequestMapping(value="/mytodo.do", method=RequestMethod.POST)
	@ResponseBody
	public Map insertMyTodo (TodoMyDto dto, @RequestHeader("Email") String email) {
		int res = 0;
		Map map = new HashMap();
		res = biz.uploadMyTodo(dto, email);
		
		if(res > 0) {
			map.put("success", "true");
			map.put("todo", dto);
		}else {
			map.put("success" , "false");
		}
		return map;
	}
}
