package com.kh.swith.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.swith.dao.FollowDao;
import com.kh.swith.dto.FollowDto;

@Service
public class FollowBizImpl implements FollowBiz {
	
	@Autowired
	private FollowDao dao;

	@Override
	public int addFollowing(FollowDto dto) {
		return dao.addFollowing(dto);
	}

	@Override
	public int unfollowing(FollowDto dto) {
		return dao.unfollowing(dto);
	}

	@Override
	public int removeFollower(int member_id) {
		return dao.removeFollower(member_id);
	}

	@Override
	public int followChk(FollowDto dto) {
		return dao.followChk(dto);
	}

}
