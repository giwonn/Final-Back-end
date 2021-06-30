package com.kh.swith.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.swith.dao.SearchDao;
import com.kh.swith.dto.StudyDto;

@Service
public class SearchBizImpl implements SearchBiz{
	
	@Autowired
	private SearchDao dao;

	@Override
	public List<StudyDto> selectStudyList() {
		return dao.selectStudyList();
	}

}
