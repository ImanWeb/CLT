package practice;

public class Practice02 {

	public static void main(String[] args) {
		
		String animals[] = { "Cat", "Dog", "Rabbit", "Mouse" };
		
		try {
			String myString = animals[7];
			System.out.println(myString);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException caught");
		}

	}

}
