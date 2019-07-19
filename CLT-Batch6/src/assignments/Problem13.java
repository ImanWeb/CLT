package assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Problem13 {

	public static void main(String[] args) {
		
		//Array with duplicate elements
        Integer[] numbers = new Integer[] {20, 20, 30, 40, 50, 50, 50};
         
        //This array has duplicate elements
        System.out.println( "Input array elements: " + Arrays.toString(numbers) );
         
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
         
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
        //Verify the array content
        System.out.println( "Elements after removing duplicates: " + Arrays.toString(numbersWithoutDuplicates) );
        
        //Print the length of the new array
        System.out.println( "New length of array: " + numbersWithoutDuplicates.length);

	}

}
