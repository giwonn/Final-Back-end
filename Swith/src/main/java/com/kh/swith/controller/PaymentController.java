package com.kh.swith.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.swith.biz.PaymentBiz;
import com.kh.swith.dto.PaymentDto;
import com.kh.swith.test.controller.TestController;

/* 결제 기능 */
@Controller("/payment")
public class PaymentController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private PaymentBiz biz;

	
	@RequestMapping(value="refund.do", method = RequestMethod.POST, produces="application/json; charset=utf8")
	@ResponseBody
	public String refund(HttpSession session, @RequestBody String paymentid) {
		return (biz.refund(paymentid) > 0) ? "success" : "false";
	}
	
	@RequestMapping(value="selectListPeriod.do", method = RequestMethod.POST)
	@ResponseBody
	public List<PaymentDto> selectListPeriod(HttpSession session, @RequestBody PaymentDto dto) {
		return new ArrayList<>(biz.selectListPeriod(dto));
	}
	
	@RequestMapping(value="selectList.do", method = RequestMethod.POST)
	@ResponseBody
	public List<PaymentDto> selectList(HttpSession session, @RequestBody int memberid) {
		return new ArrayList<>(biz.selectList(memberid));
	}
	
	@RequestMapping(value="selectOne.do", method = RequestMethod.POST)
	@ResponseBody
	public PaymentDto selectOne(HttpSession session, @RequestBody String paymentid) {
		return biz.selectOne(paymentid);
	}
	
	@RequestMapping(value="insert.do", method = RequestMethod.POST)
	@ResponseBody
	public String insert(HttpSession session, @RequestBody PaymentDto dto) {
		return (biz.insert(dto) > 0) ? "success" : "false";
	}
	
}
