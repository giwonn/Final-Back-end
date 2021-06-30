package com.kh.swith.dao;

import com.kh.swith.dto.MemberDto;

public interface MemberDao {
	public String MemberSelect(String email);
	public int MemberInsert(MemberDto memberDto);
}
