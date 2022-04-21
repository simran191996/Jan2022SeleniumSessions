package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DifferentLocators {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		System.out.println(brUtil.getPageUrl());
		driver.manage().window().maximize();

		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");

		By email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By pwd = By.xpath("//*[@id='input-password']");
		By confirmpwd = By.id("input-confirm");
		By chckbox = By.xpath("//input[@type='checkbox']");
		By button = By.xpath("//input[@type='submit']");
		By txtvalidate = By.xpath("//*[@id='content']/h1");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(FirstName, "Siddhi");
		eleUtil.doSendKeys(LastName, "Kapoor");
		eleUtil.doSendKeys(email, "Kapoor@gmail.com");
		eleUtil.doSendKeys(Telephone, "5934");
		eleUtil.doSendKeys(pwd, "SD5892");
		eleUtil.doSendKeys(confirmpwd, "SD5892");
		eleUtil.doClick(chckbox);
		eleUtil.doClick(button);
		String txt = eleUtil.getText(txtvalidate);
		System.out.println(txt);
		
		Thread.sleep(3000);

		if (txt.contains("Your Account Has Been Created!")) {
			System.out.println("Account Created");
		} else {
			System.out.println("Account not created");
		}
		brUtil.quitBrowser();
	}
}
