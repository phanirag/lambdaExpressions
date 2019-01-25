package Streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMaxMinChar {

	public static void main(String[] args) {

		String maxChar = Stream.of("H", "T", "D", "I", "J")
								 .max(Comparator.comparing(String::valueOf))
								 .get();
		String minChar = Stream.of("H", "T", "D", "I", "J")
				 .min(Comparator.comparing(String::valueOf))
				 .get();
		System.out.println("Max value is " + maxChar);
		System.out.println("Min value is " + minChar);
	}

}
