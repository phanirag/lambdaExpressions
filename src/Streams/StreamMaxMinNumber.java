package Streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMaxMinNumber {

	public static void main(String[] args) {

			Integer maxNumber = Stream.of(1,2,3,4,5,7,22,23)
									  .max(Comparator.comparing(Integer::valueOf))
									  .get();
			Integer minNumber = Stream.of(1,2,3,4,5,7,22,23)
					  .min(Comparator.comparing(Integer::valueOf))
					  .get();
			
			System.out.println("Max is " + maxNumber);
			System.out.println("Min is " + minNumber);
	}

}
