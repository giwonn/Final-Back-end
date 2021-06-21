package com.kh.swith.calendar.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.swith.calendar.dto.CalendarDto;

@Repository
public class CalendarDaoImpl implements CalendarDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<CalendarDto> selectList() {
		List<CalendarDto> list = new ArrayList<CalendarDto>();
		try {
			list = sqlSession.selectList("swith.calendarmapper.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public CalendarDto selectOne(int calendar_id) {
		return null;
	}

	@Override
	public int insert(CalendarDto calendarDto) {
		return 0;
	}

	@Override
	public int update(CalendarDto calendarDto) {
		return 0;
	}

	@Override
	public int delete(int calendar_id) {
		return 0;
	}

}
