package com.kh.swith.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.swith.dao.TodoMyDao;
import com.kh.swith.dto.TodoMyDto;


@Service
public class TodoMyBizImpl implements TodoMyBiz{
	
	@Autowired
	private TodoMyDao dao;
	
	@Override
	public int uploadMyTodo(TodoMyDto dto, String useremail) {
		return dao.insertMyTodo(dto, useremail);
	}

	@Override
	public TodoMyDto selectMyTodoList(String useremail) {
		return dao.selectMyTodoList(useremail);
	}

	@Override
	public int updateMyTodo(TodoMyDto dto, String useremail) {
		return dao.updateMyTodo(dto, useremail);
	}

	@Override
	public int deleteMyTodo(int myTodoId) {
		return dao.deleteMyTodo(myTodoId);
	}

}
