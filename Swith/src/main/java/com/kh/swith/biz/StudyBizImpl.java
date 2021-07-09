package com.kh.swith.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.swith.dao.StudyDao;
import com.kh.swith.dto.StudyDto;

@Service
public class StudyBizImpl implements StudyBiz{
	
	@Autowired
	private StudyDao dao;
	
	@Override
	public List<StudyDto> selectStudyList(Map<String, Float> map) {
		return dao.selectStudyList(map);
	}
	
	@Override
	public List<StudyDto> searchStudyList(String str){
		return dao.searchStudyList(str);
	}

	@Override
	public StudyDto selectOneStudy(int study_group_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertStudy(StudyDto dto) {
		// TODO Auto-generated method stub
		return dao.insertStudy(dto);
	}

	@Override
	public int updateStudy(StudyDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
