package com.kh.swith.calendar.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CalendarDto {
	
	private int calendar_id;
	private int member_id;
	private int study_group_id;
	private String title;
	private Date start_date;
	private Date end_date;
	private String description;

}
