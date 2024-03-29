package practice;

class SingletonDemo {
	
	// static variable single_instance of type Singleton 
	private static SingletonDemo single_instance = null;
	
	// variable of type String
	public String s;
	
	// private constructor restricted to this class itself
	private SingletonDemo() {
		s = "Hello I am a string part of Singleton class";
	}
	
	// static method to create instance of Singleton class
	public static SingletonDemo getInstance() {
		if (single_instance == null) {
			single_instance = new SingletonDemo();
		}
		return single_instance;
	}

}

public class SingletonExample {
	
	public static void main(String[] args) {
		
		// instantiating Singleton class with variable x 
        SingletonDemo x = SingletonDemo.getInstance(); 
  
        // instantiating Singleton class with variable y 
        SingletonDemo y = SingletonDemo.getInstance(); 
  
        // instantiating Singleton class with variable z 
        SingletonDemo z = SingletonDemo.getInstance(); 
  
        // changing variable of instance x 
        x.s = (x.s).toUpperCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("\n");
        
        // changing variable of instance z 
        z.s = (z.s).toLowerCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s);
		
	}
	
}
