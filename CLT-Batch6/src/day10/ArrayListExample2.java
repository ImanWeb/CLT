package day10;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		List refList = new ArrayList();
		refList.add("Charles");
		refList.add("Jerret");
//		refList.add("Jerret");
		
		System.out.println(refList);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter name");
		String name = sc.next();
		
		if (refList.contains(name)) {
			while (refList.contains(name)) {
				System.out.println("Name already exists");
				System.out.println("Please enter name");
				name = sc.next();
				while (!refList.contains(name)) {
					refList.add(name);
					System.out.println(refList);
					name = sc.next();
				}
			}
		} else {
			while (!refList.contains(name)) {
				refList.add(name);
				System.out.println(refList);
				name = sc.next();
				while (refList.contains(name)) {
					System.out.println("Name already exists");
					System.out.println("Please enter name");
					name = sc.next();
				}
			}
		}
		
//		if (refList.contains(name)) {
//			
//			do {
//				System.out.println("Name already exists");
//				System.out.println("Please enter name");
//				name = sc.next();
//			} while (!refList.contains(name));
//			
//		}
//		
//		do {
//			refList.add(name);
//			System.out.println(refList);
//			name = sc.next();
//		} while (refList.contains(name));
		
	}

}
