package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class FindElements {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl="http://demo.guru99.com/test/ajax.html";
		driver.get(baseUrl);
		List<WebElement> RadioBtns=driver.findElements(By.name("name"));
		System.out.println("Number of radio buttons="+RadioBtns.size());
		for(int i=0;i<RadioBtns.size();i++)
		{
			System.out.println("Radio Button Text is :"+  RadioBtns.get(i).getAttribute("value"));
		}
		driver.close();
		
	}

}
