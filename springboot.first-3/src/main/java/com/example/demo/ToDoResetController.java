package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ToDo;
import com.example.demo.ToDoService;
@RestController
@RequestMapping("/todos")
public class ToDoResetController {

	private ToDoService toDoService;
	@Autowired
	public ToDoResetController(ToDoService toDoService) {
		super();
		this.toDoService = toDoService;
	}

	@GetMapping("/")
	public List<ToDo> getAllToDos()
	{
		return toDoService.getAllToDos();
	}

}
