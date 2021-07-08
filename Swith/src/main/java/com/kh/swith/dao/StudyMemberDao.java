package com.kh.swith.dao;

import java.util.List;

import com.kh.swith.dto.StudyMemberDto;

public interface StudyMemberDao {
	
	public String selectRole(StudyMemberDto dto);
	public List<StudyMemberDto> studyGetList(int studyId);

}
