package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImpl  implements ToDoService {

	private ToDoDAO toDoDAO;
	
	@Autowired
	public ToDoServiceImpl(ToDoDAO toDoDAO) {
		super();
		this.toDoDAO = toDoDAO;
	}


	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return toDoDAO.getAllToDos();
	} 
	}
