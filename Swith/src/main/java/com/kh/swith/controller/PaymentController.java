package com.kh.swith.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kh.swith.biz.PaymentBiz;
import com.kh.swith.dto.PaymentDto;
import com.kh.swith.test.controller.TestController;

/* 결제 기능 */
@RestController
@RequestMapping(path="/payment")
public class PaymentController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private PaymentBiz biz;

	@RequestMapping(value="selectList.do", method = RequestMethod.POST)
	@ResponseBody
	public List<PaymentDto> selectList(HttpSession session, @RequestBody int memberid) {
		logger.info("[PaymentController] selectList.do");
		return new ArrayList<>(biz.selectList(memberid));
	}
	
	@RequestMapping(value="selectOne.do", method = RequestMethod.POST)
	@ResponseBody
	public PaymentDto selectOne(HttpSession session, @RequestBody String paymentid) {
		logger.info("[PaymentController] selectOne.do");
		return biz.selectOne(paymentid);
	}
	
	@RequestMapping(value="insert.do", method = RequestMethod.POST)
	@ResponseBody
	public String insert(HttpSession session, @RequestBody PaymentDto dto) {
		logger.info("[PaymentController] insert.do");
		return (biz.insert(dto) > 0) ? "success" : "false";
	}
	
	@RequestMapping(value="refund.do", method = RequestMethod.POST, produces="application/json; charset=utf8")
	@ResponseBody
	public String refund(HttpSession session, @RequestBody String paymentid) {
		logger.info("[PaymentController] refund.do");
		return (biz.refund(paymentid) > 0) ? "success" : "false";
	}
	
	@RequestMapping(value="selectListPeriod.do", method = RequestMethod.POST)
	@ResponseBody
	public List<PaymentDto> selectListPeriod(HttpSession session, @RequestBody PaymentDto dto) {
		logger.info("[PaymentController] selectListPeriod.do");
		return new ArrayList<>(biz.selectListPeriod(dto));
	}

	
}
