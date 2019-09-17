package SeleniumPackage;
import java.sql.DriverAction;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GetWebPageLinksSathia {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String undertCons="Webpage Under Construction";
		String baseUrl="http://demo.guru99.com/test/newtours/";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get(baseUrl);
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		//List<WebElement> allLinks=driver.findElements(By.xpath("//li/ul/li/a"));
		int i=0;
		String underCons="Under Construction";
		String[] link=new String[allLinks.size()];
		for(WebElement e:allLinks)
		{
			link[i]=e.getAttribute("textContent").trim();
			System.out.println(i+"="+link[i]);
			i++;
		}
		
	
		/*Actions builder=new Actions(driver);
		WebElement element=driver.findElement(By.linkText("Selenium"));
		builder.moveToElement(element).click().build().perform();
			driver.findElement(By.linkText("Flash Movie Demo")).click();*/

		
		int j=0;
		
		//extract the link texts of each link element and test each link
		for(String t:link) {
			
			if(j>3 && j<23)
			{
				Actions builder=new Actions(driver);
				WebElement element=driver.findElement(By.linkText("Selenium"));
				builder.moveToElement(element).click().build().perform();
					driver.findElement(By.linkText(t)).click();
				
			}else if(j>42 && j<45)
			{
				String newt=t.substring(0, t.indexOf(' '));
				driver.findElement(By.partialLinkText(newt)).click();
			}
			
			else
			{
				driver.findElement(By.linkText(t)).click();
			}
	
			String content=driver.getTitle();
			System.out.println(content);
			
			if(content.contains(underCons))
			{
				System.out.println(t + "  Under Construction");
			}else
			{
				System.out.println(t + "  is Working");
			}
			driver.navigate().back();
			j++;
		
		}
				
				
				
				
				
			
			
		
		
		
		driver.quit();
		}


}


