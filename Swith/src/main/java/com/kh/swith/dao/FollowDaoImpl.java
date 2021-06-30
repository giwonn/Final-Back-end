package com.kh.swith.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.swith.dto.FollowDto;

@Repository
public class FollowDaoImpl implements FollowDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int addFollowing(FollowDto dto) {
		return 0;
	}

	@Override
	public int unfollowing(FollowDto dto) {
		return 0;
	}

	@Override
	public int removeFollower(int member_id) {
		return 0;
	}

	@Override
	public int followChk(FollowDto dto) {
		return 0;
	}

}
