package day10;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Customer {
	String name;
	Customer(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}

public class ArrayListExample3 {

	public static void main(String[] args) {
		
		List refList = new ArrayList();
		
		refList.add(new Customer("Charles"));
		refList.add(new Customer("Jerret"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		
		if (refList.contains(name)) {
			
			//refList.add(new Customer(name));
			System.out.println("Name already exists");
			System.out.println("Please enter name");
			name = sc.next();
			
		}
		else {
			refList.add(new Customer(name));
		}
		
		System.out.println(refList);
		
	}

}
