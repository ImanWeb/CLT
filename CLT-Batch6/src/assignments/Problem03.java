package assignments;

public class Problem03 {

	public static void main(String[] args) {
		
		int alphabet = 65;
		for(int i = 1; i < 6; i++)
		{
		for(int j = 1; j <= i; j++)
		{
		System.out.print((char)alphabet + " ");
		}
		System.out.println();
		alphabet++;
		}

	}

}
