package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice09 { 
	
	// This practice shows how to sort primitive arrays and objects of wrapper classes
	
	public static void main(String[] args) {
		
		// Sorting int array
		int[] intArr = {6, 3, 12, 5, 11};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		// Sorting String array
		String[] stringArr = {"C", "B", "E", "A", "D"};
		Arrays.sort(stringArr);
		System.out.println(Arrays.toString(stringArr));
		
		// Sorting list of objects of wrapper classes
		List<String> stringList = new ArrayList<String>();
		stringList.add("bb");
		stringList.add("aa");
		stringList.add("dd");
		stringList.add("ee");
		stringList.add("cc");
		Collections.sort(stringList);
		for (String str : stringList) {
			System.out.print(str + " ");
		}

	}

}
