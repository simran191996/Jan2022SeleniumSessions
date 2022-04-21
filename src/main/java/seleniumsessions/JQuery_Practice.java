package seleniumsessions;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuery_Practice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
		
		
		//selectChoice(choices, "choice 6","choice 6 1");
	}
		
//		public static void selectChoice(By locator, String... value) {
//			List<WebElement> choiceList = driver.findElements(locator);
//			for (WebElement e:choiceList) {
//			e.click();
//			}


}
		
//}
