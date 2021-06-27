package com.kh.swith.dao;

import com.kh.swith.dto.MemberDto;

public interface MemberDao {
	public String MemberSelect();
	public int MemberInsert(MemberDto memberDto);
}
