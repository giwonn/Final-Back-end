package com.kh.swith.biz;

import java.util.List;

import com.kh.swith.dto.StudyMemberDto;

public interface StudyMemberBiz {
	
	public String selectRole(StudyMemberDto dto);
	public List<StudyMemberDto> studyGetList(int studyId);
	public int StudySignIn(StudyMemberDto dto);
	public int StudySignOut(StudyMemberDto dto);
	public int StudySignJoin(StudyMemberDto dto);
}
