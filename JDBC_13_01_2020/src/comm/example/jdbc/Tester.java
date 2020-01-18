package comm.example.jdbc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Tester {
	private EmployeeService service;

	public static void main(String[] args) throws SQLException, Exception {

		Tester tester = new Tester();
		tester.service = new EmployeeServiceImpl();
		List<Employee> list = tester.service.getAllEmployees();
		System.err.format("%-5s %-15s %-15s %s\n", "ID", "FIRST_NAME", "LAST_NAME", "SALARY");
		list.forEach(e -> {
			// System.out.println(e.getEmployeeId()+" "+e.getFirstName()+"
			// "+e.getLastName()+" "+e.getSalary());
			System.out.format("%-5s %-15s %-15s %s\n", e.getEmployeeId(), e.getFirstName(), e.getLastName(),
					e.getSalary());
		});

		

	}
}
