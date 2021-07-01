package com.kh.swith.biz;

import java.util.List;
import java.util.Map;

import com.kh.swith.dto.StudyDto;


public interface StudyBiz {
	public List<StudyDto> selectStudyList(Map<String, Float> map);
	public StudyDto selectOneStudy(int study_group_id);
	public int insertStudy(StudyDto dto);
	public int updateStudy(StudyDto dto);
}
