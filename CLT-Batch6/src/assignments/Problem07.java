package assignments;

public class Problem07 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++)
        {
            int temp = i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(temp + " ");
                temp = temp + 1;
            }
            temp = temp - 2;
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(temp + " ");
                temp = temp - 1;
            }
            System.out.println();
        }

	}

}
