package lk.oshan.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSort {
	
	public static void main(String[] args) {
		
		//sort these map base on the mark and put it to list from highets to lowest
		//Get marks >60 into a list in descending order
		
		Integer passMark = 60;
		
		Map<String, Integer> students = new HashMap<>();
		students.put("Krish",100);
		students.put("Nuwan",90);
		students.put("Bhagya",60);
		students.put("Hasini",95);
		students.put("Suranga",65);
		students.put("Erandaka",55);
		
		//First way
		students.entrySet().stream()
			.filter(e1 -> e1.getValue()>= passMark)
			.sorted((e1,e2) -> -new Integer(e1.getValue() .compareTo(e2.getValue())))
			.collect(Collectors.toList())
			.stream().forEach(e -> System.out.println(e.getKey()));
		
		//New way
		List<String> strings = new ArrayList<>();
		students.entrySet().stream().filter(e -> e.getValue() >= passMark)
		.sorted((e1,e2) -> -e1.getValue().compareTo(e2.getValue()))
		.peek(s->strings.add(s.getKey()))
		.collect(Collectors.toList());
		System.out.println();
		
		
		//two list 
		//frist-  key in desc
		//second - all tghe vehicle asc except ship
		
		Map<Integer, String> vehicles = new HashMap<>();
		vehicles.put(10, "car");
		vehicles.put(50, "SUV");
		vehicles.put(20, "Jeep");
		vehicles.put(12, "Bus");
		vehicles.put(15, "Ship");
		vehicles.put(16, "Lorry");
		vehicles.put(4, "Cycle");
		
		List<Integer> keys = new ArrayList<>();
		List<String> names = new ArrayList<>();
		
		vehicles.entrySet().stream()
		.sorted((v1,v2) -> -v1.getKey().compareTo(v2.getKey()))
		.peek(s -> keys.add(s.getKey()))
//		.collect(Collectors.toList())
//		.stream()
		.sorted((v1,v2) -> v1.getValue().compareTo(v2.getValue()) )
		.filter(v1 -> v1.getValue() != "Ship")
		.peek(v -> names.add(v.getValue()))
		.collect(Collectors.toList());
		
		System.out.println(keys);
		System.out.println(names);
		
	}
	
}
