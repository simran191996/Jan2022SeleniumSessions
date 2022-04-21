package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericUtlity {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	                WebDriverManager.chromedriver().setup();
	                driver=new ChromeDriver();
	                driver.get("https://www.google.com/");


	                
	                By textField= By.name("q");


	                By suggestList= By.xpath("//ul[@role='listbox']//li");
	                
	                doSendkeys(textField,"naveen automation labs");
	                List<String> suggestionList=getSuggestionList(suggestList);


	                System.out.println(suggestionList);


	                driver.close();
	                
	      }

	public static List<WebElement> getElements(By locator){
	//getElements()
	                return driver.findElements(locator);
	                
	        }               

	public static WebElement getElement(By locator) {                                //getElement()
	                return driver.findElement(locator);
	                
	                }       

	public static void doSendkeys(By locator, String value) {                //doSendKeys()
	                
	                getElement(locator).sendKeys(value);
	        }               

	public static List<String> getSuggestionList(By locator)
	        {
	//getSuggestionList
	                List<WebElement> suggestOptionsList= getElements(locator);
	                List<String> suggestionList= new ArrayList<String>();
	                
	                for(WebElement e: suggestOptionsList) {
	                        
	                        String txt=e.getText();
	                        System.out.println(txt);
	                        suggestionList.add(txt);
	                        
	                }
	                return suggestionList;                
	        }
