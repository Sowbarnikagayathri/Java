package com.cg.day2;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;

	public class Sorting {
	    public static void main(String[] args) {
	      
	        Integer[] arr = {5, 2, 8, 1, 9};

	        
	        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

	        Collections.sort(list);
	        for (int i = 0; i < list.size(); i++) {
	            System.out.print(list.get(i) + " ");
	        }
	    }
	}



