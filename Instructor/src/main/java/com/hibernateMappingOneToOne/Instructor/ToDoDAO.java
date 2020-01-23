package com.hibernateMappingOneToOne.Instructor;

import java.io.IOException;
import java.util.List;

public interface ToDoDAO {
	public ToDo createToDo(ToDo todo);
	public List<ToDo> getAllPersons();
	public ToDo getToDoByid(Integer id);
	public ToDo updateToDo(Integer id) throws IOException;
	public void deleteToDo(Integer id);


	
}
