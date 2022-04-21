package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverPractice {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/?nc=logo");
		
		By parentMenu=By.xpath("//li[@class='dropdown full-wid hvr-drop']");
		By childMenu=By.linkText("Fruits & Vegetables");
		By subChildMenu=By.linkText("Herbs & Seasonings");
		By subChildMenu1=By.linkText("Cucumber & Capsicum");
		//By menu3=By.linkText("Vegetables");
		
	selectSubMenu(parentMenu, childMenu);
	selectSubMenu(parentMenu, childMenu, subChildMenu);
	selectSubMenu1(parentMenu, childMenu, subChildMenu, subChildMenu1);
		

}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectSubMenu(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		getElement(childMenu).click();
	}

	public static void selectSubMenu(By parentMenu, By childMenu, By subChildMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(childMenu)).perform();
		Thread.sleep(2000);
		getElement(subChildMenu).click();
	}

	
	public static void selectSubMenu1(By parentMenu, By childMenu, By subChildMenu,By subChildMenu1) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(childMenu)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(childMenu)).perform();
		Thread.sleep(2000);
		getElement(subChildMenu).click();
	}
}
