package practice;

public class Practice11 {
	
	int sum(int x, int y) {
		return (x + y);
	}
	
	int sum(int x, int y, int z) {
		return (x + y + z);
	}

	public static void main(String[] args) {
		
		Practice11 prac = new Practice11();
		System.out.println(prac.sum(2,5,8));

	}

}
