package com.kh.swith.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.kh.swith.dto.StudyDto;

public class SearchDaoImpl implements SearchDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<StudyDto> selectStudyList() {
		List<StudyDto> resList = new ArrayList<StudyDto>();
		try {
			resList = sqlSession.selectList(NAMESPACE + "selectList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resList;
	}

}
