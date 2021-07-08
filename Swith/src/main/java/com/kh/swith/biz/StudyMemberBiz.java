package com.kh.swith.biz;

import java.util.List;

import com.kh.swith.dto.StudyMemberDto;

public interface StudyMemberBiz {
	
	public int selectMemberCount(int study_group_id);
	public String selectRole(StudyMemberDto dto);
	public List<StudyMemberDto> studyGetList(int studyId);
	

}
