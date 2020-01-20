package com.jdbcspring;

import java.util.List;
import java.sql.SQLException;

public interface CustomerService {
	
	public Customer1 createCustomer(Customer1 customer) throws SQLException;
	public List<Customer1> getAllCustomers1()throws SQLException;
	public List<Customer1> getAllCustomers();
	@Override
	int hashCode();

}
