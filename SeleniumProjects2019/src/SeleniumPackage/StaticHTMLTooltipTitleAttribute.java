package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class StaticHTMLTooltipTitleAttribute {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		String ExpectedToolTip="Github";
		//String ActualToolTip=driver.findElement(By.xpath("//svg[@class='icon' and @viewBox='0 0 25 25']")).getAttribute("title");
		String ActualToolTip=driver.findElement(By.className("github")).getAttribute("title");
		if(ActualToolTip.equalsIgnoreCase(ExpectedToolTip))
		{
			System.out.println("Test Case Passed");
		}
		
		driver.close();
		
		
	}
	
	
}
