package lk.oshan.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
//		List<Employee> employees = new ArrayList<>();
//		employees.add(new Employee(90, "Krish"));
//		employees.add(new Employee(92, "Hasini"));
//		employees.add(new Employee(80, "Bhagya"));
//		employees.add(new Employee(88, "Nuwan"));
//		employees.add(new Employee(70, "Suranga"));
//		employees.add(new Employee(50, "Amal"));
//		employees.add(new Employee(40, "Erandika"));
		
	//	List<Employee> employees
		
		List<Employee> employees2 = Employee.getAllEmployees().stream().filter(e->e.getName().length()>5).collect(Collectors.toList());
		
		//System.out.println(employees2);
	
		
	}
	
}
