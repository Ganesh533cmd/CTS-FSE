package com.jdbcspring;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao2 {

	public Customer1 createCustomer(Customer1 customer) throws SQLException;
	public List<Customer1> getAllCustomers()throws SQLException;
    public List<Customer1> getCustomerById(String uId) throws SQLException;
	List<Customer1> getCustomer1ById(String uId) throws SQLException;
   
}