package com.javaconfig.Customerconfig;

import java.util.List;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("dao")
public class CustomerDaoimpl implements CustomerDao {
   
			private JdbcTemplate jdbcTemplate;

			@Autowired
			public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
				this.jdbcTemplate = jdbcTemplate;
			}

			@Override
			public Customer createCustomer(Customer customer) throws SQLException {
				// TODO Auto-generated method stub
				String sql="insert into customer(uid,first_name,last_name,email) values(?,?,?,?)";
				jdbcTemplate.update(sql, 
						new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
				return customer;
			}

			public List<Customer> getAllCustomers1() throws SQLException {
				
				String query="select uid,first_name,last_name,email from customer";
				
				
				return jdbcTemplate.query(query, new CustomerRowMapper());
			}

			@Override
			public List<Customer> getCustomerById(String uId) throws SQLException {
				String query="select uid,first_name,last_name,email from customer where uid=?";
				return jdbcTemplate.query(query, new Object[] {uId},new CustomerRowMapper());
			}

			
			@Override
			public java.util.List<Customer> getAllCustomers() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			
}
