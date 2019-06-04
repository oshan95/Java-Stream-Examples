package lk.oshan.stream;

import java.util.Comparator;
import java.util.Optional;

public class MinMax {
	public static void main(String[] args) {
	
		Optional<Employee> employee = Employee.getAllEmployees().stream()
				.min(Comparator.comparing(Employee::getMarks));
		
		System.out.println(employee.get());
	}
}
