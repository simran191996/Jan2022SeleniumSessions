package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeCrm {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		System.out.println(brUtil.getPageUrl());
		driver.manage().window().maximize();

		
		By FName=By.id("Form_submitForm_Name");
		By Email=By.name("Email");
		By pno=By.id("Form_submitForm_Contact");

		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(FName, "Simran");
		eleUtil.doSendKeys(Email, "abt@gmail.com");
		eleUtil.doSendKeys(pno, "5689");

		brUtil.quitBrowser();
	}

}
