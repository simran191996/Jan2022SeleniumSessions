package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleXpath {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
		Thread.sleep(3000);
		
		
		driver
			.findElement
				(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']//span/b[contains(text(),'java')]"))
					.click();
		
//		driver
//		.findElement
//			(By.xpath("//ul[@class='G43f7e']// li[contains(.,'selenium')]"))
//				.click();
		
		
		
		//google search -- single xpath
		//automationpractice -- sugg list with for loop
		
	}

}

