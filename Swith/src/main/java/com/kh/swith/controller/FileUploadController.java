package com.kh.swith.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.kh.swith.dto.MediaUtils;

 @Controller
public class FileUploadController {
	private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

	// 파일 업로드 처리
	@RequestMapping(value = "/image.do", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(HttpServletRequest request, MultipartFile file) throws Exception {

		String originalFileName = file.getOriginalFilename();
		byte[] fileData = file.getBytes(); // ======= ????
		
		System.out.println("asdf");
		
		// ========= 1. 파일명 중복 방지 처리 ========= 
		String uuidFileName = getUuidFileName(originalFileName);
		
		// ========= 업로드 경로설정 ========= //
		String rootPath = getRootPath(originalFileName, request);
		
		// ========= 경로가 없으면 하나 만들어준다. =========  
		File storage = new File(rootPath);
		if(!storage.exists()) {
			System.out.println("경로에 폴더가 없어서 하나 만들어줍니다... ");
			storage.mkdirs();
		}
		
		// ========= 이미지 파일 사이즈 체크 ========= //  
		BufferedImage image = ImageIO.read(file.getInputStream());
		Integer width = image.getWidth();
		Integer height = image.getHeight();
		
		System.out.println("width = "+ width + "height = " + height);
		
		// ========= 서버에 파일 저장 ========= // 
		File target = new File(rootPath,uuidFileName); // 파일 객체 생성
		
		FileCopyUtils.copy(fileData, target); // 이게 뭘까????????????????
		
		
		ImageIO.write(image, MediaUtils.getFormatName(uuidFileName), target);
		
		
		// 
		return rootPath + uuidFileName;
	}

	private static String getUuidFileName(String originalFileName) {
		return UUID.randomUUID().toString() + "_" + originalFileName;
	}

	public static String getRootPath(String fileName, HttpServletRequest request) {
		String rootPath = "/resources/upload";
		MediaType mediaType = MediaUtils.getMediaType(fileName);

		if (mediaType != null)
			return request.getSession().getServletContext().getRealPath(rootPath + "/images");

		return request.getSession().getServletContext().getRealPath(rootPath + "/files");
	}
	
	public static void imageResize(String orgFilePath, String fileName) {
		
	}
}
