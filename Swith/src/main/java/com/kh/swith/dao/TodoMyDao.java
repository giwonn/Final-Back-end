package com.kh.swith.dao;

import com.kh.swith.dto.TodoMyDto;

public interface TodoMyDao {
	public String NAMESPACE = "swith.todolist-my-mapper.";
	public int insertMyTodo (TodoMyDto dto, String useremail);
	public TodoMyDto selectMyTodoList(String useremail);
	public int updateMyTodo (TodoMyDto dto, String useremail);
	public int deleteMyTodo(int myTodoId);
}
