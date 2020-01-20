package com.jdbcspring;

import java.util.List;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component("Dao2")

public class CustomerDaoimpl2 implements CustomerDao2 {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer1 createCustomer(Customer1 customer) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into customer(uid,first_name,last_name,email) values(?,?,?,?)";
		jdbcTemplate.update(sql, 
				new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer1> getAllCustomers() throws SQLException {
		
		String query="select uid,first_name,last_name,email from customer";
		
		
		return jdbcTemplate.query(query, new CustomerRowMapper());
	}

	@Override
	public List<Customer1> getCustomer1ById(String uId) throws SQLException {
		String query="select uid,first_name,last_name,email from customer where uid=?";
		return jdbcTemplate.query(query, new Object[] {uId},new CustomerRowMapper());
	}

	public int updateCustomerById(Customer1 customer) throws SQLException {
	
		return 0;
	}

}
