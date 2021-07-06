package com.kh.swith.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.swith.dto.StudyMemberDto;

@Repository
public class StudyMemberDaoImpl implements StudyMemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public String selectRole(StudyMemberDto dto) {
		String role = null;
		try {
			role = sqlSession.selectOne("swith.studymembermapper.selectOne", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return role;
	}

}
