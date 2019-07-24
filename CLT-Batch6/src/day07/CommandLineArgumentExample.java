package day07;

public class CommandLineArgumentExample {

	public static void main(String[] city) {
		
		String cityNames[] = city;
		
//		for (int i=0; i<4; i++) { // for loop
//			
//			System.out.println(cityNames[i]);
//			
//		}
		
		for (String i : cityNames) { // foreach loop
			
			System.out.println(i);
			
		}

	}

}
