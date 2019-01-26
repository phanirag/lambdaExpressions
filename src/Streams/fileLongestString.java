package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class fileLongestString {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("hari","phani","phani","naresh","ahsdhasdha","ram");
		Optional<String> data = names.stream().reduce((v1,v2) -> v1.length() < v2.length() ? v1 :v2); // reduce
		Optional<String> data1 = names.stream().reduce((v1,v2) -> v1+" = "+v2 );
		data.ifPresent(System.out::println);
		System.out.println(data1);
		
		names.stream().distinct().forEach(System.out::println); // disctinct
		long count = names.stream().distinct().count(); //  distinct with count
		System.out.println("Count : "+count);

		names.parallelStream().forEach(System.out::println);
		
	}
}
