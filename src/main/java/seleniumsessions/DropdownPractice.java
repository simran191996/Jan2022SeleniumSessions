package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPractice {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		By Name= By.id("name");
		By Mobileno=By.id("phone");
		By email=By.xpath("//input[@id='email']");
		By pwd=By.xpath("//input[@id='password']");
		By address=By.id("address");
		List<WebElement>options =driver.findElements(By.xpath("//select[@class='custom-select']"));
		WebElement country=driver.findElement(By.xpath("//select[@class='custom-select']"));
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(Name, "Simran"); 
		eleUtil.doSendKeys(Mobileno, "95187");
		eleUtil.doSendKeys(email, "abc@gmail.com");
		eleUtil.doSendKeys(pwd, "xyz@897");
		eleUtil.doSendKeys(address, "Mumbai");
		
		Thread.sleep(3000);
//		Select select = new Select(country);
//		select.selectByIndex(1);
//				select.selectByVisibleText("Norway");
				
//		for (WebElement e:options) {
//			String str=e.getText();
//			System.out.println(str);
		//}
	
	//without using Select class
	
	
	for (WebElement e:options) {
	String str=e.getText();
		System.out.println(str);
		if(str.equals("Spain")) {
			e.click();
			break;
		}
	}
				
	}}


