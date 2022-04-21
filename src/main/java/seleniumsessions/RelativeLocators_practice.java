package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators_practice {

	public static void main(String[] args) {

		// sel 4.x
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		WebElement ele = driver.findElement(By.xpath("//label[@class='radio-inline'][2]"));
		driver.findElement(with(By.tagName("label")).toLeftOf(ele)).click();

		WebElement elem = driver.findElement(By.xpath("//a/b[contains(text(),'Privacy Policy')]"));

		driver.findElement(with(By.tagName("input")).toRightOf(elem)).click();

	}
}
