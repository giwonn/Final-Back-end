package com.kh.swith.biz;

import org.springframework.stereotype.Service;

import com.kh.swith.dto.TodoMyDto;


public interface TodoMyBiz {
	public int uploadMyTodo (TodoMyDto dto, String useremail);
	public TodoMyDto selectMyTodoList(String useremail);
	public int updateMyTodo (TodoMyDto dto, String useremail);
	public int deleteMyTodo(int myTodoId);
}
