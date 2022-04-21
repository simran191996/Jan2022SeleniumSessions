package seleniumsessions;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopup   {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window
		
		By linkedIn=By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
		By fB = By.xpath("//img[@alt='OrangeHRM on Facebook']");
		By twitter=By.xpath("//img[@alt='OrangeHRM on twitter']");
		By ytBy=By.xpath("//img[@alt='OrangeHRM on youtube']");
		
		
		getWindowTitle(linkedIn);
		getWindowTitle(fB);
		getWindowTitle(twitter);
		getWindowTitle(ytBy);
		
		driver.quit();

	}


	

	
	public static void getWindowTitle(By locator) {
		
		//click on child tab link
		doClick(locator);
		
	Set<String>handles=driver.getWindowHandles();
	Iterator<String> iter=handles.iterator();
	
	
	//get title of parent window
	String parentWin=iter.next();
	System.out.println(getWindowTitle1(parentWin));
	
	
	//capture title of child window
	
	String childWin=iter.next();
	System.out.println(getWindowTitle1(childWin));
	
	driver.close();
	driver.switchTo().window(parentWin);
	}
	
	
	
public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String getWindowTitle1(String WindowId) {
		
		driver.switchTo().window(WindowId);
		String winTitle=driver.getTitle();
		return winTitle;
	}
}
