package com.hibernateMappingOneToOne.Instructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.TagAction;

import com.mysql.cj.Query;
import com.mysql.cj.Session;

public class ToDoDAOImpl implements ToDoDAO{

	private Session session;
	private TagAction transaction;
	private BufferedReader br;
	{
		session=HibernateUtil.getSession();
		transaction=session.getTransaction();
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	@Override
	public ToDo createToDo(ToDo todo) {
		try {
			transaction.begin();
			session.save(todo);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return todo;
	}

	public List<ToDo> getAllToDo() {
		Query query=((Object) session).createQuery("from ToDo");
		return query.list();
	}

	@Override
	public ToDo getToDoByid(Integer id) {
		ToDo todo=session.get(ToDo.class, id);
		if(todo==null)
		{
			System.out.println("not found");
		}
		return todo;
	}

	@Override
	public ToDo updateToDo(Integer id) throws IOException {
		ToDo p=session.get(ToDo.class, id);
		if(p!=null)
		{
			System.out.println("Name: ");
			String name=br.readLine();
			p.setFirstName(name);
			p.setDateOfBirth(LocalDate.now());
			transaction.begin();
			session.update(p);
			transaction.commit();
		}
		else {
			System.out.println("not found");
		}
		return p;
		return null;
	}

	@Override
	public void deleteToDo(Integer id) {
		ToDo p=session.get(ToDo.class, id);
		if(p!=null)
		{
			transaction.begin();
			session.delete(p);
			transaction.commit();
			System.out.println("deleted.");
		}
		else
		{
			System.out.println("not found");
		}
		
	}

	@Override
	public List<ToDo> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
