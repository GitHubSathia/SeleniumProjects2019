package SeleniumPackage;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImageClickCss {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String BaseUrl="https://www.facebook.com/login/identify?ctx=recover";
		driver.get(BaseUrl);
		//driver.findElement(By.cssSelector("i.fb_logo img sp_z3EmYTfbUVU sx_6a42ec")).click();
		driver.findElement(By.cssSelector("i[class=\"fb_logo img sp_z3EmYTfbUVU sx_6a42ec\"]")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
	}	
}
