package com.kh.swith.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.swith.dto.TodoMyDto;

@Repository
public class TodoMyDaoImpl implements TodoMyDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insertMyTodo(TodoMyDto dto, String useremail) {
		return sqlSession.insert("");
	}

	@Override
	public TodoMyDto selectMyTodoList(String useremail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMyTodo(TodoMyDto dto, String useremail) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMyTodo(int myTodoId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
