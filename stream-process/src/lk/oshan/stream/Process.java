package lk.oshan.stream;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Process {
	
	public static void main(String[] args) {
		
	
		System.out.println("Multiply everyones marks by 2 : ");
		List<Employee> employees = Employee.getAllEmployees().stream().map(e -> new Employee(e.getMarks()*2,e.getName())).collect(Collectors.toList());	
		System.out.println(employees);
		System.out.println();
		
		

		System.out.println("Get the count of employees that contains"+ " i " + " in name");
		Long count = Employee.getAllEmployees().stream()
				.filter(e-> e.getName().contains("i"))
				.count();
		System.out.println(count);
		System.out.println();
		

		System.out.println("Multiply marks by 3 and contains"+ " i" +" in name : ");
		List<Employee> employees2 = Employee.getAllEmployees().stream()
				.filter(e-> e.getName().contains("i"))
				.map(e -> new Employee(e.getMarks()*3,e.getName()))
				.collect(Collectors.toList());
		System.out.println(employees2);
		System.out.println();
		
		System.out.println("Students whose age is greater than 18 : ");
		List<Student> students = Student.getAllStudents().stream()
				.filter(e-> LocalDate.now().getYear() - e.getDateOfBirth().getYear()>18)
				.map(e-> new Student(e.getName(),e.getDateOfBirth()))
				.collect(Collectors.toList());
		System.out.println("Today date : "+ LocalDate.now());
		System.out.println(students);
		System.out.println();
		
		
		System.out.println("Multiply marks by 3 and contains"+ " i" +" in name, and sort names : ");
		List<Employee> employees3 = Employee.getAllEmployees().stream()
				.filter(e-> e.getName().contains("i"))
				.map(e -> new Employee(e.getMarks()*3,e.getName()))
				.collect(Collectors.toList());
		System.out.println(employees3);
		System.out.println();
		
	}
}
