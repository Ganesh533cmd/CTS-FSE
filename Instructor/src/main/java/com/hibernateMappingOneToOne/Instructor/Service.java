package com.hibernateMappingOneToOne.Instructor;

import java.io.IOException;
import java.util.List;

public interface Service {

	public ToDo createToDo(ToDo todo);
	public List<ToDo> getAllPersons();
	public ToDo getToDoByid(Integer id);
	public ToDo updatePerson(Integer id) throws IOException;
	public void deletePerson(Integer id);

}
