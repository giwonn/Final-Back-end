package com.kh.swith.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kh.swith.biz.FollowBiz;
import com.kh.swith.dto.FollowDto;

@Controller
public class FollowController {
	private static final Logger logger = LoggerFactory.getLogger(FollowController.class);
	
	@Autowired
	private FollowBiz followBiz;
	
	
	//public FollowDto addFollowing();
}
