package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> sqr = number.stream().map(x ->x*x).collect(Collectors.toList());
		System.out.println(sqr.toString());
	}

}
