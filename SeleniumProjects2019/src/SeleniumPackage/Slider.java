package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys(" kids clothing");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(5000);
		Actions builder=new Actions(driver);
		WebElement slider=driver.findElement(By.xpath("//div[@class='_3aQU3C']"));
		builder.clickAndHold(slider).moveByOffset(95, 0).release().build().perform();
		Thread.sleep(5000);
		
		
	}

}
