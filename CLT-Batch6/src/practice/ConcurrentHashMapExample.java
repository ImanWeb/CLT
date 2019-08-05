package practice;

import java.util.concurrent.*;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		
		// Creates a new empty map with a default initial capacity (16), 
		// load factor (0.75) and concurrencyLevel (16)
		ConcurrentHashMap<String, Integer> people = new ConcurrentHashMap<String, Integer>();
		
	    people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Sam", 33);
	    
	    people.remove("Steve");
	    
	    people.putIfAbsent("David", 29);
	    
	    people.replace("John", 32, 44);
	    
	    System.out.println(people);

	}

}
