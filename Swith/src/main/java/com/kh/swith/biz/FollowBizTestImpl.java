package com.kh.swith.biz;

import java.util.List;

import com.kh.swith.dao.FollowDaoTest;
import com.kh.swith.dto.FollowDtoTest;

public class FollowBizTestImpl implements FollowBizTest {
	
	private FollowDaoTest dao;

	@Override
	public void follow(FollowDtoTest dto) {

	}

	@Override
	public void unfollow(FollowDtoTest dto) {
		
	}

	@Override
	public int isFollow(FollowDtoTest dto) {
		return dao.isFollow(dto);
	}

	@Override
	public List<FollowDtoTest> selectActiveUserList(int activeUser) {
		return dao.selectActiveUserList(activeUser);
	}

	@Override
	public List<FollowDtoTest> selectPassiveUserList(int passiveUser) {
		return dao.selectPassiveUserList(passiveUser);
	}

}
