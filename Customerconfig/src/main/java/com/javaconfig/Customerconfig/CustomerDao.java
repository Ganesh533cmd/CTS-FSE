package com.javaconfig.Customerconfig;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {

	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers()throws SQLException;
	public List<Customer> getCustomerById(String uId) throws SQLException;

}

