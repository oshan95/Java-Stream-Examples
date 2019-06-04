package lk.oshan.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

	String name;
	LocalDate dateOfBirth;
	
	public Student(String name, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public static List<Student> getAllStudents(){
	List<Student> students = new ArrayList<>();
	students.add(new Student("Krish", LocalDate.of(2010, 12, 25)));
	students.add(new Student("Hasini", LocalDate.of(1965, 12, 25)));
	students.add(new Student("Bhagya", LocalDate.of(2010, 12, 25)));
	students.add(new Student("Nuwan", LocalDate.of(1965, 12, 25)));
	students.add(new Student("Suranga", LocalDate.of(2011, 12, 25)));
	students.add(new Student("Amal", LocalDate.of(1965, 12, 25)));
	students.add(new Student("Erandika", LocalDate.of(2010, 12, 25)));
	return students;
}

	@Override
	public String toString() {
		return name+" : "+dateOfBirth;
	}
	
}
