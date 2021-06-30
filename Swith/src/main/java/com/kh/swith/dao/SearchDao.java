package com.kh.swith.dao;

import java.util.List;

import com.kh.swith.dto.StudyDto;

public interface SearchDao {
	public String NAMESPACE = "swith.studymapper.";
	public List<StudyDto> selectStudyList();
}
