package lk.oshan.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class F1Sort {
	public static void main(String[] args) {
	
		List<Employee> sortedEmployees = Employee.getAllEmployees().stream()
				.sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		
		System.out.println(sortedEmployees);
		
		//Comparison method 1
		List<Employee> sortedEmployees2 = Employee.getAllEmployees().stream()
				.sorted(Comparator.comparing(Employee::getMarks))
				.collect(Collectors.toList());
		System.out.println(sortedEmployees2);
		
		//Comparison method 2
		List<Employee> sortedEmployees3 = Employee.getAllEmployees().stream()
				.sorted((e1,e2)-> e1.getMarks().compareTo(e2.getMarks()))
				.collect(Collectors.toList());
		System.out.println(sortedEmployees3);
		
		//sort names depends on the length of name
		List<Employee> sortedEmployees4 = Employee.getAllEmployees().stream()
				.sorted((e1,e2)-> new Integer(e1.getName().length()) .compareTo(e2.getName().length()))
				.collect(Collectors.toList());
		System.out.println(sortedEmployees4);
	
	//sort names depends on the length of name - reversed
	List<Employee> sortedEmployees5 = Employee.getAllEmployees().stream()
			.sorted((e1,e2)-> -new Integer(e1.getName().length()) .compareTo(e2.getName().length()))
			.collect(Collectors.toList());
	System.out.println(sortedEmployees5);
		
	}
	
}
