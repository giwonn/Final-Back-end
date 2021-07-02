package com.kh.swith.biz;

import java.util.List;

import com.kh.swith.dto.StudyDto;


public interface StudyBiz {
	public List<StudyDto> selectStudyList();
	public StudyDto selectOneStudy(int study_group_id);
	public int insertStudy(StudyDto dto, String memberemail);
	public int updateStudy(StudyDto dto);
}
