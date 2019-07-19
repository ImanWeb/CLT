package assignments;

import java.util.Arrays;
import java.util.List;

public class Problem09 {

	public static void main(String[] args) {
		
		String[] alphabet = new String[]{"A", "B", "C", "D", "E"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);
        
        if(list.contains("C")){
            System.out.println("C is available");
        }

	}

}
