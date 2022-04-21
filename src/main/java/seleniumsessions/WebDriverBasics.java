package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//Lauch Chrome
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
