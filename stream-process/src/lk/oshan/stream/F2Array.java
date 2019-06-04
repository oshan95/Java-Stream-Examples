package lk.oshan.stream;

public class F2Array {

	public static void main(String[] args) {
		
		Employee[] employees=Employee.getAllEmployees()
				.stream()
				.toArray(Employee[]::new);
		
	}
	
	
}
