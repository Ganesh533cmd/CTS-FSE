import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private LocalDate doj;
	private int age;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, LocalDate doj, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		Object department;
		System.out.format("%-15s %-30s %-30s %-20s %-10s %-10s\n",id,name,department,new SimpleDateFormat("MM/dd/yyyy").format(),age,salary);
		return "";
	}
	
	public int compareTo(Employee e)
	{
		if(salary==e.salary)
			return 0;
		else if(salary>e.salary)
			return 1;
		else
			return -1;	
	
	
	
}
	public Employee getDateOfJoining() {
		// TODO Auto-generated method stub
		return null;
	}
