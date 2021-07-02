package com.kh.swith.dao;

import java.util.List;
import java.util.Map;

import com.kh.swith.dto.StudyDto;


public interface StudyDao {
	public String NAMESPACE = "swith.studymapper.";
	public List<StudyDto> selectStudyList();
	public StudyDto selectOneStudy(int study_group_id);
	public List<StudyDto> selectMyStudyList(String memberemail);
	public int insertStudy(StudyDto dto);
	public int insertStudyMember(Map paramMap);	
	public int updateStudy(StudyDto dto);
}