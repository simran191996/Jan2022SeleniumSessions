package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionCount {

String name;
	
	@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void loginTest() {
		System.out.println("loginTest");
		int i = 9/0;
		ExpectedExceptionCount obj = null;
		obj.name = "tom";
	}
	
	
}

