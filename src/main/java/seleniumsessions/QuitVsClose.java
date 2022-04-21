package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//Launch Chrome
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		
		//reinitialize the driver
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		 title=driver.getTitle();
		System.out.println(title);
	}

}
