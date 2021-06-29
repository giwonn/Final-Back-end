package com.kh.swith.controller;
/* 결제 기능 */
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.swith.dao.PaymentDao;
import com.kh.swith.dto.PaymentDto;
import com.kh.swith.test.controller.TestController;

@Controller
public class PaymentController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	@Autowired
	private PaymentDao dao;
	
	@RequestMapping(value="paymentInsert.do", method = RequestMethod.POST)
	@ResponseBody
	public String savePaymentHistory(HttpSession session, @RequestBody PaymentDto dto) {
		
		
		return "test";
	}
	
}
