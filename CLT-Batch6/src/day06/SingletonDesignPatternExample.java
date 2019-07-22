package day06;

// DBConnection Class would be an example of a Singleton Class
class SingletonClass {
	
	private static SingletonClass ref; // starts at null. Once object is created, it will be pointed to some memory allocation
	
	SingletonClass() { // private constructor
		System.out.println("Hello");
	}
	
	public static SingletonClass getMethod() {
		if (ref == null) {
			ref = new SingletonClass(); // object is created
		}
		
		return ref;
	}
}

public class SingletonDesignPatternExample {

	public static void main(String[] args) {
		
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		SingletonClass.getMethod();

	}

}
