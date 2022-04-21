package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	
	@BeforeSuite
	public void connectwithDB() {
		System.out.println("BS-connectWithDB");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BS-createUser");
	}
	
	@BeforeClass
	
	public void launchBrowser() {
		System.out.println("BS-launchBrowser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("LoginToApp");
	}
	
	@Test
	public void titleTest() {
		System.out.println("Page Title Test");
	}
	
	@Test
	public void headerTest() {
		System.out.println("Page Header Test");
	}
	
	@Test
	public void isUserLoggedInTest() {
		System.out.println("user is logged in");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM-Log out");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT-deleteUser");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS-disconnectWithDB");
	}
	
}
