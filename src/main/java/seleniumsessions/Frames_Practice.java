package seleniumsessions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Practice {

	public static void main(String[] args) throws InterruptedException {
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");

			
		driver.switchTo().frame("globalSqa");
		
		String header=driver.findElement(By.xpath("//div/h1[contains(text(),'Trainings')]")).getText();
		System.out.println(header);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);


}

}
