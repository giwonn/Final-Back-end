package com.kh.swith.calendar.dto;

import java.util.Date;

public class CalendarDto {
	
	private int calendar_id;
	private int member_id;
	private int study_group_id;
	private String title;
	private Date start_date;
	private Date end_date;
	private String description;
	
	public int getCalendar_id() {
		return calendar_id;
	}
	public void setCalendar_id(int calendar_id) {
		this.calendar_id = calendar_id;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public int getStudy_group_id() {
		return study_group_id;
	}
	public void setStudy_group_id(int study_group_id) {
		this.study_group_id = study_group_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public CalendarDto() {
	}
	public CalendarDto(int calendar_id, int member_id, int study_group_id, String title, Date start_date, Date end_date,
			String description) {
		this.calendar_id = calendar_id;
		this.member_id = member_id;
		this.study_group_id = study_group_id;
		this.title = title;
		this.start_date = start_date;
		this.end_date = end_date;
		this.description = description;
	}
	
	

}
