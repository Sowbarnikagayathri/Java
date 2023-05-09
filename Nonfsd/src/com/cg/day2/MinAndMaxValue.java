package com.cg.day2;


	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;

	public class MinAndMaxValue {
	public static void main(String[] args) {
		List<Integer>my=Arrays.asList(-11,2,3,4,5,6,7,7,0);
		
		//Minimum value
			long var=my.stream().min(Integer::compare).get();
			System.out.println(var);


	//Maximum value
			long var1=my.stream().max(Integer::compare).get();
			System.out.println(var1);
	}
	}


