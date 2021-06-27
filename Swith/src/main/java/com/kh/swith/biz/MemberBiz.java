package com.kh.swith.biz;

import com.kh.swith.dto.MemberDto;

public interface MemberBiz {
	public String MemberSelect();
	public int MemberInsert(MemberDto memberDto);
}
