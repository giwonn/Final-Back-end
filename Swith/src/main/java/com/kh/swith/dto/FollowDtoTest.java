package com.kh.swith.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FollowDtoTest {
	
	//팔로우 번호
	private int followNo;
	//팔로우걸은 유저
	private int activeUser;
	//팔로우 당한유저
	private int passiveUser;
	//팔로우 등록날짜
	private Date regDate;
	
	//등록된 유저 아이디, 프로필
	private String activateUserId;
	private String passiveUserId;
	private String profileName;

}
