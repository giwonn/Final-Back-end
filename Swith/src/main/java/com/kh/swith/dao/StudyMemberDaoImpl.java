package com.kh.swith.dao;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<StudyMemberDto> studyGetList(int studyId) {
		List<StudyMemberDto> list = new ArrayList<StudyMemberDto>();
		
		try {
			list = sqlSession.selectList("swith.studymembermapper.getList", studyId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("listlistlist : " + list);
		
		return list;
	}

	@Override
	public int StudySignIn(StudyMemberDto dto) {
		int res = 0;
		
		System.out.println("이메일 " + dto.getEmail());
		System.out.println("스터디아이디 " + dto.getStudyId());
		try {
			res = sqlSession.insert("swith.studymembermapper.studySignIn",dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int StudySignOut(StudyMemberDto dto) {
		int res = 0;
		
		System.out.println("이메일 " + dto.getEmail());
		System.out.println("스터디아이디 " + dto.getStudyId());
		try {
			res = sqlSession.delete("swith.studymembermapper.studySignOut",dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int StudySignJoin(StudyMemberDto dto) {
		int res = 0;
		
		try {

		} catch (Exception e) {

		}
		return res;
	}

}
