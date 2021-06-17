package com.kh.swith.calendar.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.swith.calendar.dao.CalendarDao;
import com.kh.swith.calendar.dto.CalendarDto;

@Service
public class CalendarBizImpl implements CalendarBiz {

	@Autowired
	private CalendarDao dao;
	
	@Override
	public List<CalendarDto> selectList() {
		return dao.selectList();
	}

	@Override
	public CalendarDto selectOne(int calendar_id) {
		return dao.selectOne(calendar_id);
	}

	@Override
	public int insert(CalendarDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(CalendarDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int calendar_id) {
		return dao.delete(calendar_id);
	}

}
