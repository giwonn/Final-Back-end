package com.kh.swith.calendar.biz;

import java.util.List;

import com.kh.swith.calendar.dto.CalendarDto;

public interface CalendarBiz {
	public List<CalendarDto> selectList();
	public CalendarDto selectOne(int calendar_id);
	public int insert(CalendarDto calendarDto);
	public int update(CalendarDto calendarDto);
	public int delete(int calendar_id);
}
