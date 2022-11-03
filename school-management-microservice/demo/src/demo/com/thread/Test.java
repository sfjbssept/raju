package demo.com.thread;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	
	

	public static void main(String[] args) {
		
		int number = 10;
	int fact=	IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y);
	System.out.println(fact);
	
	Stream.iterate(new long[] { 1, 1 }, p -> new long[] { p[1], p[0] + p[1] })
    .limit(9)
    .forEach(p -> System.out.println(p[0]));
		
	}
	
	

}
