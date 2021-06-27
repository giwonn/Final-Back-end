package com.kh.swith.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.swith.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public String MemberSelect() {
		
		String res = "";
		
		try {
			res = "email";
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int MemberInsert(MemberDto memberDto) {
		
		int res = 0;
		
		try {
			res = sqlSession.insert("",memberDto);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
