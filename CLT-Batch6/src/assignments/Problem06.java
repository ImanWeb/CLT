package assignments;

public class Problem06 {

	public static void main(String[] args) {
		
		System.out.println("*");
		int i, j, k=2;
        for(i=0; i<4; i++)
        {
            for(j=0; j<k; j++)
            {
                System.out.print("* ");
            }
            k = k + 2;
            System.out.println();
        }

	}

}
