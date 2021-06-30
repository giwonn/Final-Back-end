package com.kh.swith.biz;

import java.util.List;

import com.kh.swith.dto.FollowDto;

public interface FollowBiz {
	
		//팔로잉 조회
		//public List<> searchFollowing(int member_id);
			
		//팔로워 조회
		//public List<> searchFollower(int member_id);
			
		//팔로잉 추가(내가 다른사람을 팔로우)
		public int addFollowing(FollowDto dto);
			
		//팔로잉 삭제
		public int unfollowing(FollowDto dto);
		
		//팔로워 삭제
		public int removeFollower(int member_id);
			
		//팔로우 유무 체크
		public int followChk(FollowDto dto);
	
	

}
