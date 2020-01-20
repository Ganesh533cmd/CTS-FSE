package com.jdbcspring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CRM implements RowMapper<Customer1> {

	
		@Override
		public Customer1 mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Customer1 customer=new Customer1();
			customer.setUid(rs.getString("uid"));
			customer.setFirstName(rs.getString("first_name"));
			customer.setLastName(rs.getString("last_name"));
			customer.setEmail(rs.getString("email"));
			return customer;
	}

}
