package com.cg.day5;

import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
	}

}
