package com.kh.swith.biz;

import java.util.List;

import com.kh.swith.dto.CalendarDto;

public interface CalendarBiz {
	public List<CalendarDto> calendarSelectList();
	public CalendarDto calendarSelectOne(int calendar_id);
	public int calendarInsert(CalendarDto calendarDto);
	public int calendarUpdate(CalendarDto calendarDto);
	public int calendarDelete(int calendar_id);
}
