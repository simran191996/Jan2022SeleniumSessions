package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		By linkedIn=By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
		By fB = By.xpath("//img[@alt='OrangeHRM on Facebook']");
		By twitter=By.xpath("//img[@alt='OrangeHRM on twitter']");
		By ytBy=By.xpath("//img[@alt='OrangeHRM on youtube']");
		
		ElementUtil ele =new ElementUtil(driver);
		ele.doClick(linkedIn);
		ele.doClick(fB);
		ele.doClick(twitter);
		ele.doClick(ytBy);
		
		

		//To get all window handles
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		
		String parentWindowID=it.next();
		String YouTubeWindowID=it.next();
		String TwitterWindowID=it.next();
		String facebookwindowId=it.next();
		String linkedinwindowId=it.next();
		
		String LinkedInTitle=getChildTitle(linkedinwindowId);
		System.out.println("LinkedIntitle:"+LinkedInTitle);
		driver.close();
		
		
		String FBTitle=getChildTitle(facebookwindowId);
		System.out.println("Facebooktitle:"+facebookwindowId);
		driver.close();
		
		String TwitterTitle=getChildTitle(TwitterWindowID);
		System.out.println("Twittertitle:"+TwitterWindowID);
		driver.close();
		
		String YoutubeTitle=getChildTitle(YouTubeWindowID);
		System.out.println("Youtubetitle:"+YouTubeWindowID);
		driver.close();
		
		
		String parentTitle=getChildTitle(parentWindowID);
		System.out.println("Parenttitle:"+parentWindowID);
		driver.close();
		
		
	}
 public static String getChildTitle(String childwindowID) {
	 driver.switchTo().window(childwindowID);
	 String childwintitle=driver.getTitle();
	 return childwindowID;
	 
 }
}
