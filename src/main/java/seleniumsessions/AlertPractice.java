package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {

public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		
		//if alert is not there: NoAlertPresentException: no such alert
		
		Alert alert = driver.switchTo().alert(); //JS popup, confirmation, prompt
		
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("hey");
		
		//alert.sendKeys("testing");
		
		alert.accept();//click on ok button
		
		
		String txt=driver.findElement(By.id("result")).getText();
		System.out.println(txt);
		
		//alert.dismiss(); //click on cancel button
		
		
		
		//JS 
	}

}

