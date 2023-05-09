package com.cg.day2;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Set;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	public class duplicateArrayAndDeleteIt {
		public static void main(String[] args) {
			
		
		
		ArrayList<Integer> numbersList
		= new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		 
		Set<Integer> setWithoutDuplicates = numbersList.stream()
		.collect(Collectors.toSet());
		long count=setWithoutDuplicates.stream().count();
		 
		System.out.println(setWithoutDuplicates);
		System.out.println(count);
		
		}
	}


