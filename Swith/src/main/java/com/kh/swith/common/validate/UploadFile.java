package com.kh.swith.common.validate;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UploadFile {
	private String name;
	private String desc;
	private MultipartFile mpfile;
	
}
