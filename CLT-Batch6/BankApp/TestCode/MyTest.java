package TestCode;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import DevCode.Bank;
import DevCode.DBS;

public class MyTest {
	
	@BeforeClass
	public static void openConnection() {
		System.out.println("Checking connection");
	}
	
	@Before
	public void openBrowser() {
		System.out.println("Opening Browser");
	}
	
	@After
	public void closeBrowser() {
		System.out.println("Closing Browser");
	}
	
	@AfterClass
	public static void closeConnection() {
		System.out.println("Closing Connection");
	}
	
	@Test
	public void myTestCase1(){
		System.out.println("Enter login details");
		Bank refBank = new DBS();
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		String pw = sc.next();
		refBank.login(pin, pw);
	}
	
	@Test
	public void myTestCase2() {
		System.out.println("Enter amount to add");
		Bank refBank = new DBS();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		refBank.add(x, y);
		System.out.println(refBank.add(x, y));
		assertEquals(10, refBank.add(x, y));
	}

}
