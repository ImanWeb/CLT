package day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DevCode2 {
	
	// 1. handle NullPointerException (pointing null)
	// 2. handle NumberFormatException (BufferedReader)
	// 3. handle InputMismatchException (Scanner)
	
	static void logic() throws IOException {		
		
		// handle NullPointerException (pointing null)
		try {
			String s = null;
			s.equals("Hello");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught");
		}
		
		// handle NumberFormatException (BufferedReader)
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number: ");
			int number = Integer.parseInt(br.readLine());
			System.out.println(number);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException caught");
		}
		
		// handle InputMismatchException (Scanner)
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number (for input mismatch): ");
			int number2 = sc.nextInt();
			System.out.println(number2);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException caught");
		}
		
	}

}
