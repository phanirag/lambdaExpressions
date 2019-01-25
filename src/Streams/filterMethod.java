package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterMethod {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("RSss","pls","ppo");
		List<String> result = list.stream().filter(s ->s.startsWith("p")).collect(Collectors.toList());
		System.out.println(result);
	}

}
