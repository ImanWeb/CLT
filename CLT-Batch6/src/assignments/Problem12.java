package assignments;

public class Problem12 {

	public static void main(String[] args) {
		
		int arr[] = { 11, 28, 58, 82, 6, 50, 19, 24, 5, 78, 76, 71};
		
		int largest = arr[0];
		int secondLargest = arr[0];
		int smallest = arr[0];
		int secondSmallest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} 
			
			else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
			
			else if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
 
			} 
			
			else if (arr[i] < secondSmallest) {
				secondSmallest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
		System.out.println("\nSecond smallest number is:" + secondSmallest);

	}

}
