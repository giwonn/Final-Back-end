package com.kh.swith.dto;

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
public class StudyGroupMemberDto {
	
	private int study_group_member;
	private int study_group_id;
	private String member_email;
	private String role;

}
