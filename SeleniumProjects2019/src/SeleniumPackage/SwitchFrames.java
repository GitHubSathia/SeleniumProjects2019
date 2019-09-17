package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SwitchFrames {

		public static void main(String args[])
		{
			System.setProperty("webdriver.firefox.marionette", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.get("http://demo.guru99.com/selenium/deprecated.html");
			driver.switchTo().frame("classFrame");
			driver.findElement(By.linkText("Deprecated")).click();
			String currentPage=driver.getCurrentUrl();
			System.out.println(currentPage);
			driver.close();
		}
}
