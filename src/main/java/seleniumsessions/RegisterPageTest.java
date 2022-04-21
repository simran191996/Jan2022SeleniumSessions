package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		System.out.println(brUtil.getPageUrl());

		By email = By.id("input-email");
		By Register = By.id("//*[@id='column-right']/div/a[2]");
		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By Telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By confirmpwd = By.id("input-confirm");
	
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(FirstName, "Simran");
		eleUtil.doSendKeys(LastName, "input-lastname");
		eleUtil.doSendKeys(email, "sim@gmail.com");
		eleUtil.doSendKeys(Telephone, "7854234907");
		eleUtil.doSendKeys(pwd, "abc");
		eleUtil.doSendKeys(pwd, "abc");
		
		brUtil.quitBrowser();
	}

}
