package com.kh.swith.biz;

import com.kh.swith.dto.MemberDto;

public interface MemberBiz {
	public String MemberSelect(String email);
	public int MemberInsert(MemberDto memberDto);
	
	public int updateProfile(MemberDto memberDto);
}
