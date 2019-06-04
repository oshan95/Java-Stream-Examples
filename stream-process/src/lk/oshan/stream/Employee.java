package lk.oshan.stream;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	Integer marks;
	String name;

	public Employee(Integer marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(90, "krish"));
		employees.add(new Employee(92, "hasini"));
		employees.add(new Employee(80, "bhagya"));
		employees.add(new Employee(88, "nuwan"));
		employees.add(new Employee(70, "suranga"));
		employees.add(new Employee(50, "amal"));
		employees.add(new Employee(40, "erandika"));
		return employees;
	}
	
	@Override
	public String toString() {
		return name+" : "+marks;
	}

}
