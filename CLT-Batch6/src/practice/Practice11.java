package practice;

public class Practice11 {
	
	int sum(int x, int y) {
		return (x + y);
	}
	
	int sum(int x, int y, int z) {
		return (x + y + z);
	}
	
	int add() {
		int a = 10;
		int b = 8;
		int c = a + b;
		return c;
		
	}
	
	void addWithPrint() {
		int a = 2;
		int b = 4;
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		Practice11 prac = new Practice11();
		System.out.println(prac.sum(2,5,8));
		System.out.println(prac.add());
		prac.addWithPrint();

	}

}
