package com.kh.swith.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.swith.dao.MemberDao;
import com.kh.swith.dto.MemberDto;

@Service
public class MemberBizImpl implements MemberBiz {
	
	@Autowired
	private MemberDao memberDao;

	@Override
	public String MemberSelect(String email) {
		return memberDao.MemberSelect(email);
	}

	@Override
	public int MemberInsert(MemberDto memberDto) {
		return memberDao.MemberInsert(memberDto);
	}

	@Override
	public int updateProfile(MemberDto memberDto) {
		return memberDao.updateProfile(memberDto);
	}
	
	
}
