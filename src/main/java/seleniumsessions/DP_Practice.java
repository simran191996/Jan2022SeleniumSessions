package seleniumsessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DP_Practice {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://testautomationpractice.blogspot.com/");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		System.out.println(brUtil.getPageUrl());
		driver.manage().window().maximize();
		
		
		//WebElement name=driver.findElement(By.id("RESULT_TextField-1"));
		//name.sendKeys("Simran");
		//By FirstName= By.xpath("//input[@id='RESULT_TextField-1'and @class='text_field']");
//		By LastName=By.xpath("//input[@id='RESULT_TextField-2']");
//		By Phone= By.xpath("//input[@id='RESULT_TextField-3']");
//		By Country=By.xpath("//input[@id='RESULT_TextField-4']");
//		By City=By.xpath("//input[@id='RESULT_TextField-5']");
//		By Email=By.xpath("//input[@id='RESULT_TextField-6]");
By BestTime= By.xpath("//input[@id='RESULT_TextField-9']");
//	    
	    //By ContactTime=By.id("RESULT_RadioButton-9");
	    List<WebElement> choice=driver.findElements(By.xpath("//input[@id='RESULT_TextField-2']"));
		
		
//		ElementUtil e= new ElementUtil(driver);
//e.doSendKeys(FirstName, "anush");
////		e.doSendKeys(LastName, "Sharma");
////		e.doSendKeys(Phone, "897455");
////		e.doSendKeys(Country, "India");
////		e.doSendKeys(City, "PNQ");
////		e.doSendKeys(Email, "xyz@gmail.com");
		
		//Dropdowns
		Select select =new Select(driver.findElement(BestTime));
		Thread.sleep(3000);
		select.selectByValue("Afternoon");
		
		
		for (WebElement e1:choice) {
			String txt=e1.getText();
			System.out.println(txt);
		}
	
		brUtil.quitBrowser();
}
	
}
