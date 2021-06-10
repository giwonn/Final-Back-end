package com.kh.swith.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//@EnableWebMvc
//public class WebConfig implements WebMvcConfigurer {
//	@Bean
//	public WebMvcConfigurer webMvcConfigurer() {
//		System.out.println("하이~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**")
//						.allowedOrigins("http://localhost:3000/")
//						.allowedMethods(HttpMethod.GET.name())
//						.allowCredentials(true).maxAge(3600);
//			}
//		};
//	}
//
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		System.out.println("하이2");
//		registry.addMapping("/**");
//	}
//}