package lk.oshan.stream;

import java.util.Comparator;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
//		Employee.getAllEmployees().forEach(e->
//				System.out.println(e.getName())
//				);
		//Filer names which have letters five or more than five and sorting by name descennding and print using foreach
		
		Employee.getAllEmployees().stream()
			.filter(e-> e.getName().length()>=5)
			.map(e-> new Employee( e.getMarks(),e.getName().toUpperCase().charAt(0) +e.getName().substring(1)))
			.sorted(Comparator.comparing(Employee::getName).reversed())
			.forEach(e->
				System.out.println(e.getName())
			);
		
	}
}
