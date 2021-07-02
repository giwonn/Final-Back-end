package com.kh.swith.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.swith.dto.StudyDto;

@Repository
public class StudyDaoImpl implements StudyDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<StudyDto> selectStudyList() {
		List<StudyDto> resList = new ArrayList<StudyDto>();
		try {
			resList = sqlSession.selectList(NAMESPACE + "selectList");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resList;
	}

	@Override
	public StudyDto selectOneStudy(int study_group_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertStudy(StudyDto dto) {
		int res = 0;
		
		try {
			res = sqlSession.insert(NAMESPACE+"insert",dto);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int updateStudy(StudyDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<StudyDto> selectMyStudyList(String memberemail) {
		List<StudyDto> resultList = new ArrayList<StudyDto> ();
		
		try {
			resultList = sqlSession.selectList("selectListByUserEmail",memberemail);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}
	
	/**
	 * insert study member 
	 * studygroupid
	*memberemail
	*	role
	 * 
	 */
	@Override
	public int insertStudyMember(Map paramMap) {
		int res = 0;
		try {
			res = sqlSession.insert("insertStudyMember",paramMap);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
