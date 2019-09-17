package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class JquerToolTipDynamicDivTag {

	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		driver.manage().window().maximize();
		String ExpectedToolTip="What's new in 3.2";
		WebElement downloadBtn=driver.findElement(By.linkText("Download now"));
		Actions builder=new Actions(driver);
		builder.clickAndHold().moveToElement(downloadBtn).build().perform();
		WebElement tooltip=driver.findElement(By.linkText("What's new in 3.2"));
		String ActualToolTip=tooltip.getText();
		
		if(ActualToolTip.equalsIgnoreCase(ExpectedToolTip))
		{
			System.out.println("Test Case Passed");
		}
		
		driver.close();
		
		
	}
	
}
