package file;

import java.io.*;

public class Writer1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		
		try {
			
			boolean newFile = false;
			
			File f = new File("abcxyz.txt");
			System.out.println(f.exists()); // look for real file // false true
			
			newFile = f.createNewFile(); // maybe create a file
			System.out.println(newFile); // already there? // true false
			System.out.println(f.exists()); // look again  // false true
			
			fw = new FileWriter("abcxyz.txt");
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write("this is filewriter7 ");
			//br.flush();
			br.newLine();
			//br.flush();
			br.write("thank you");
			br.newLine();
			br.write("Java");
			br.newLine();
			br.write("SAP");
			br.newLine();
			br.write(".Net");
			br.close();
			
		}
		
		catch (Exception e) {
			System.out.println("error");
		}

	}

}
