package file;

import java.io.*;

public class Reader2 {

	public static void main(String[] args) throws IOException {
		
		FileReader frRef = null;
		
		try {
			
			// Get data from this file using a file reader
			FileReader fr = new FileReader("sample2.txt");
										  // "c://nikhil.txt"
			
			// To store the contents read via File Reader
			BufferedReader br = new BufferedReader(fr);
			
			//Read br and store a line in 'data', print data
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}
		
		catch (IOException e) {
			System.out.println("Sorry!! File not found.");
		}
		
		finally {
			frRef.close();
		}

	}

}
