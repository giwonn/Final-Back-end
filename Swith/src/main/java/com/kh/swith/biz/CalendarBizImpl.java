package com.kh.swith.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.swith.dao.CalendarDao;
import com.kh.swith.dto.CalendarDto;

@Service
public class CalendarBizImpl implements CalendarBiz {

	@Autowired
	private CalendarDao calendarDao;
	
	@Override
	public List<CalendarDto> calendarSelectList() {
		return calendarDao.calendarSelectList();
	}

	@Override
	public CalendarDto calendarSelectOne(int calendar_id) {
		return calendarDao.calendarSelectOne(calendar_id);
	}

	@Override
	public int calendarInsert(CalendarDto calendarDto) {
		return calendarDao.calendarInsert(calendarDto);
	}

	@Override
	public int calendarUpdate(CalendarDto calendarDto) {
		return calendarDao.calendarUpdate(calendarDto);
	}

	@Override
	public int calendarDelete(int calendar_id) {
		return calendarDao.calendarDelete(calendar_id);
	}

}
