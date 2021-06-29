package com.kh.swith.dto;

import java.util.Date;

public class PaymentDto {
	
	private String paymentid;
	private int memberid;
	private int paymentprice;
	private Date paymentdate;
	private String paymentcontent;
	private String paymentkinds;
	// 아래는 날짜 제한 검색용
	private Date firstdate;
	private Date lastdate;
	
}
