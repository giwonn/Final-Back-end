package com.kh.swith.calendar.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.swith.calendar.dao.CalendarDao;
import com.kh.swith.calendar.dto.CalendarDto;

@Service
public class CalendarBizImpl implements CalendarBiz {

	@Autowired
	private CalendarDao calendarDao;
	
	@Override
	public List<CalendarDto> selectList() {
		return calendarDao.selectList();
	}

	@Override
	public CalendarDto selectOne(int calendar_id) {
		return calendarDao.selectOne(calendar_id);
	}

	@Override
	public int insert(CalendarDto calendarDto) {
		return calendarDao.insert(calendarDto);
	}

	@Override
	public int update(CalendarDto calendarDto) {
		return calendarDao.update(calendarDto);
	}

	@Override
	public int delete(int calendar_id) {
		return calendarDao.delete(calendar_id);
	}

}
