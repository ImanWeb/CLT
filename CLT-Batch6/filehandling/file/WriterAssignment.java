package file;

import java.io.*;
import java.util.Scanner;

public class WriterAssignment {

	public static void main(String[] args) throws IOException {
		
		int wordCount = 0;
			
		// Receive user input for the file name
		System.out.println("Enter File Name: ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();
			
		// Creating the object for the file name
		File f = new File(fileName);
		boolean exists = f.exists();
		System.out.println(exists);
		
		if (exists == true) {
			System.out.println("File exists");
		} else { // Create file if it doesn't exist
			System.out.println("File does not exists");
			f.createNewFile();
		}
		
		// Receive user input for file content
		System.out.println("Enter text to the file: ");
		sc = new Scanner(System.in);
		
		String fileContent = sc.nextLine();
		
		try (FileWriter fw = new FileWriter(fileName)) {
			
			fw.write(fileContent);
		}
		
		catch (IOException e) {
			System.out.println("No text entered");
		}
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String sentence = br.readLine();
		
		while (sentence != null) {
			String[] count = sentence.split(" ");
			for (String temp : count) {
				wordCount++;
			}
			sentence = br.readLine();
		}
		
		 System.out.println("Number of words: " + wordCount);	// Printing the number of words
	     System.out.println("Writing successful");
		
	}

}
