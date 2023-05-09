package com.cg.day2;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Map;
	import java.util.function.Function;
	import java.util.stream.Collectors;

	public class countOfRepeated {
		public static void main(String[] args) {
			
			// ArrayList with duplicate elements
			ArrayList<Integer> numbersList
			= new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
			 
			Map<Integer, Long> elementCountMap = numbersList.stream()
			.collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
			 
			System.out.println(elementCountMap);
		}

}
