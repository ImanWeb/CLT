package DevCode;

public class DBS implements Bank {

	@Override
	public void login(int pin, String password) {
		
		System.out.println("Successful login");
		
	}

	@Override
	public int add(int x, int y) {
		
		int z = x + y;
		return z;
		
	}
	
}
