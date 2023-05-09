package com.cg.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
	public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter some text:");
        try {
            String userInput = reader.readLine();
            System.out.println("User entered: " + userInput);
        } catch (IOException e) {
            System.err.println("Error reading user input!");
        }
    }

}
