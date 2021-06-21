package com.kh.swith.calendar.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.swith.calendar.biz.CalendarBiz;
import com.kh.swith.calendar.dto.CalendarDto;

@Controller
public class CalendarController {
	private static final Logger logger = LoggerFactory.getLogger(CalendarController.class);

	@Autowired
	private CalendarBiz calendarBiz;
	
	@RequestMapping(value = "calendar.do", method = RequestMethod.POST)
	@ResponseBody
	public String test(HttpSession session, @RequestBody CalendarDto calendarDto) {
		logger.info("[Controller] calendar.do");
		System.out.println(calendarDto.getCalendar_id());
		
		return calendarDto.getCalendar_id()+"";
	}
	
	@RequestMapping(value = "selectlist.do", method = RequestMethod.GET)
	@ResponseBody
	public List<CalendarDto> selectList() {
		logger.info("[Controller] selectlist.do");
		
		return calendarBiz.selectList();
	}
	
	@RequestMapping(value = "insert.do", method = RequestMethod.POST)
	@ResponseBody
	public String insert(HttpSession session, @RequestBody CalendarDto calendarDto) {
		logger.info("[Controller] insert.do");
		
		if (calendarBiz.insert(calendarDto) > 0) {
			return "일정 등록 성공!";
		}
		
		return "일정 등록 실패!";
	}
}
