package com.hibernateMappingOneToOne.Image;

import java.util.ArrayList;
import java.util.List;

public class ToDoDAOImpl implements ToDoDAO {
	
	List<Todo> todoList=null;
	{
		ToDoDAO=new ArrayList<ToDoDAO>();
	}
	private Todo td;
	

	public Todo crtToDo(String todoName,String taskName) {
		Todo td1=new Todo(todoName);
		td1.setTaskDetail(new Task(taskName));
		return td1;	
		}

	public List<ToDoDAO> getAllToDos() {
		// TODO Auto-generated method stub
		return ToDoDAO;
	}

	@Override
	public ToDoDAO findId(String todoId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteToDo(String toDoId) {
		// TODO Auto-generated method stub

	}

	public void removeAllToDo() {
		// TODO Auto-generated method stub

	}

	public void updateToDo(String oid) {
		// TODO Auto-generated method stub

	}
 {

}
}