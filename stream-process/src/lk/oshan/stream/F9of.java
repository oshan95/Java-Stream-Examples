package lk.oshan.stream;

import java.util.stream.Stream;

public class F9of {
	
	public static void main(String[] args) {
		
		Stream.of(1,3,2,45,32,45,232131,12,14,5,65).sorted().forEach(System.out::println);
		
		Integer[] integers= {1,23,354,23,3,4,51,2,432,3432,42,3};
		Stream<Integer> stream = Stream.of(integers);
		stream.sorted().forEach(System.out::println);
		
	}
	
}
