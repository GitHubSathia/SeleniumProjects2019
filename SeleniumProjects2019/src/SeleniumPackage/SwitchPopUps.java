package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SwitchPopUps {

	public static void main(String args[])
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		String AlertMsg=driver.switchTo().alert().getText();
		System.out.println(AlertMsg);
		driver.switchTo().alert().accept();
		driver.close();
		
	}
}
