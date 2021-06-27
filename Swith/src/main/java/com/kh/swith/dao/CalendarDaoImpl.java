package com.kh.swith.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.swith.dto.CalendarDto;

@Repository
public class CalendarDaoImpl implements CalendarDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<CalendarDto> calendarSelectList() {
		List<CalendarDto> list = new ArrayList<CalendarDto>();
		try {
			list = sqlSession.selectList("swith.calendarmapper.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public CalendarDto calendarSelectOne(int calendar_id) {
		return null;
	}

	@Override
	public int calendarInsert(CalendarDto calendarDto) {
		int res = 0;
		
		try {
			res = sqlSession.insert("swith.calendarmapper.insert", calendarDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int calendarUpdate(CalendarDto calendarDto) {
		return 0;
	}

	@Override
	public int calendarDelete(int calendar_id) {
		return 0;
	}

}
