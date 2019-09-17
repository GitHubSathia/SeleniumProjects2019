package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumFormWebElement {
		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String baseUrl="http://demo.guru99.com/test/login.html";
			driver.get(baseUrl);
			WebElement Email=driver.findElement(By.id("email"));
			Email.sendKeys("abc@gmail.com");
			WebElement Password=driver.findElement(By.id("passwd"));
			Password.sendKeys("abc");
			Email.clear();
			Password.clear();
			Email.sendKeys("abc@gmail.com");
			Password.sendKeys("abc");
			WebElement BtnSignIn=driver.findElement(By.id("SubmitLogin"));
			BtnSignIn.submit();
			driver.close();
			
		}
	
	
}
