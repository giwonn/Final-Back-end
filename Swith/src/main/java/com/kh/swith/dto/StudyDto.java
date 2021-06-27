package com.kh.swith.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudyDto {
	private int studygroupid;
	private String studygroupname;
	private String studygroupdesc;
	private String studygroupoffline;
	private String studygrouploc;
	private String studygroupaddrid;
	private String studygroupaddr;
	private String studygrouppw;
	private int studyusercnt;
	
}
