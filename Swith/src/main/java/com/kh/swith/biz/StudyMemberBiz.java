package com.kh.swith.biz;

import java.util.List;

import com.kh.swith.dto.StudyMemberDto;

public interface StudyMemberBiz {
	
	public String selectRole(StudyMemberDto dto);
	public List<StudyMemberDto> studyGetList(String studyId);
	
}
