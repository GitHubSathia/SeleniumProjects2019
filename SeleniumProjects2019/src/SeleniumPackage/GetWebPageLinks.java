package SeleniumPackage;
import java.sql.DriverAction;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GetWebPageLinks {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String underCons="Webpage Under Construction";
		String baseUrl="http://demo.guru99.com/test/newtours/";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get(baseUrl);
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		String[] link=new String[allLinks.size()];
		int i=0;
		
		//extract the link texts of each link element
		for(WebElement e:allLinks)
		{
			link[i]=e.getText();
			System.out.println(link[i]);
		        i++;
			
		}
		//test each link
		for(String t:link) {
			driver.findElement(By.linkText(t)).click();
			
			if(driver.getTitle().equalsIgnoreCase(underCons))
			{
				System.out.println(t + "Under Construction");
			}else
			{
				System.out.println(t + "is Working");
			}
			driver.navigate().back();
		
		}
		
		driver.quit();
		
		
	}

}
