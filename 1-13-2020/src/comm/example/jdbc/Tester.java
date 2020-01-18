package comm.example.jdbc;

import java.sql.SQLException;
import java.util.List;

public class Tester {
	private EmployeeService service;

	public static void main(String[] args) throws SQLException {

		Tester tester = new Tester();
		tester.service = new EmployeeServiceImpl();
		List<Employee> list=tester.service.getAllEmployees();
		System.out.format("%-10s %-15s %-10s %-10s \n","ID","FIRST_NAME","LAST_NAME","SALARY");
		System.out.println("--------------------------------------------");
		list.forEach(e->{
			System.out.format("%-10s %-15s %-10s %-10s \n",e.getEmployeeId(),e.getFirstName(),e.getLastName(),e.getSalary());
		});

	}

}