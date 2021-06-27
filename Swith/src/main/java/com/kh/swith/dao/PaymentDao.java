package com.kh.swith.dao;

import java.util.Date;
import java.util.List;

import com.kh.swith.dto.PaymentDto;

public interface PaymentDao {
	public String NAMESPACE = "swith.paymentmapper.";
	public List<PaymentDto> selectList(int memberid);
	public List<PaymentDto> selectListPeriod(PaymentDto dto);
	public PaymentDto selectOne(String paymentid);
	public int insert(PaymentDto dto);
	public int refund(String peymentid);
}
