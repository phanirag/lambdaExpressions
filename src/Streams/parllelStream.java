package Streams;

import java.util.ArrayList;
import java.util.List;

public class parllelStream {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		for(int i= 0;i<=100;i++ ){
			values.add(i);
		}
		//values.forEach(System.out::println); 
		//values.stream().forEach(System.out::println); // here we are using only one thread to use multiple threads or cores 
		values.parallelStream().forEach(System.out::println); // JVM will use multiple threads which make perofrmace better
	}

}
