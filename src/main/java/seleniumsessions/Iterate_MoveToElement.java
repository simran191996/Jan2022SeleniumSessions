package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Iterate_MoveToElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/?nc=logo");
		
		
		WebElement SBC=driver.findElement(By.xpath("//li[@class='dropdown full-wid hvr-drop']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(SBC).perform();
		Thread.sleep(3000);
		
		
		List<WebElement>menu1=driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
		for(WebElement e:menu1) {
			ac.moveToElement(e).perform();
			System.out.println(e.getText());
		}
		
//		List<WebElement>menu2=driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
//		for(WebElement e1:menu1) {
//			ac.moveToElement(e1).perform();
//			System.out.println(e1.getText());
//		}
		
		
		By parentMenu=By.xpath("//li[@class='dropdown full-wid hvr-drop']");
}
}