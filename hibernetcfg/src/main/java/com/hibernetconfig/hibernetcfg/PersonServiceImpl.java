package com.hibernetconfig.hibernetcfg;

import java.io.IOException;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    private PersonDAO dao;
    {
    	dao=new PersonDAOImpl();
    }
	@Override
	public Person createPerson(Person person) {
		
		return dao.createPerson(person);
	}

	@Override
	public List<Person> getAllPersons() {
		return dao.getAllPersons();
	}

	@Override
	public Person getPersonByid(Integer id) {
		
		return dao.getPersonByid(id);
	}

	@Override
	public Person updatePerson(Integer id) throws IOException {
		return dao.updatePerson(id);
	}

	@Override
	public void deletePerson(Integer id) {
		 dao.deletePerson(id);
	}

}
