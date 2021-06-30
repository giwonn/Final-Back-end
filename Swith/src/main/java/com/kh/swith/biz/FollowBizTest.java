package com.kh.swith.biz;

import java.util.List;

import com.kh.swith.dto.FollowDtoTest;

public interface FollowBizTest {

	// 팔로우 하기
	void follow(FollowDtoTest dto);
	// 언팔로우
	void unfollow(FollowDtoTest dto);
	// 팔로우 유무
	int isFollow(FollowDtoTest dto);
	// 팔로우 리스트 조회
	List<FollowDtoTest> selectActiveUserList(int activeUser);
	// 팔로워 리스트 조회
	List<FollowDtoTest> selectPassiveUserList(int passiveUser);

}
