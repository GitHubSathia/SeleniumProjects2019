package SeleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;




public class Action {

	public static void main(String args[])
	{
		
		//https://stackoverflow.com/questions/47504392/timed-out-waiting-45-seconds-for-firefox-to-start
		//webdriver.firefox.marionette throwing timeout by 45 secs error after upgrading from firefox 47 to firefox 64
		
		System.setProperty("webdriver.gecko.driver","C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		
		
		WebElement Home_Link= driver.findElement(By.linkText("Home"));
		WebElement td_HomeLink=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]")); 
		//WebElement td_HomeLink=driver.findElement(By.xpath("tr.mouseOut:nth-child(1) > td:nth-child(2)"));
		Actions Builder=new Actions(driver);
		 
	     String Bgcolor=td_HomeLink.getAttribute("bgcolor");
	    System.out.println("Backgroung Color befeore hover "+ Bgcolor);
	    Builder.moveToElement(Home_Link).build().perform();
	    Bgcolor=td_HomeLink.getAttribute("bgcolor");
	    System.out.println("Backgroung Color after hover "+ Bgcolor);
	    driver.close();
	}
}
