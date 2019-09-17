package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioBtnAndCheckbox {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String BaseUrl="http://demo.guru99.com/test/radio.html";
		driver.get(BaseUrl);
		WebElement RadioOption1=driver.findElement(By.id("vfb-7-1"));
		WebElement RadioOption2=driver.findElement(By.id("vfb-7-2"));
		WebElement RadioOption3=driver.findElement(By.id("vfb-7-3"));
		WebElement ChkBox1=driver.findElement(By.id("vfb-6-0"));
		WebElement ChkBox2=driver.findElement(By.id("vfb-6-1"));
		WebElement ChkBox3=driver.findElement(By.id("vfb-6-2"));
		RadioOption1.click();
		for(int i=0;i<3;i++)
		{
			ChkBox1.click();
			System.out.println("CheckBox Status "+ChkBox1.isSelected());
		}
		driver.close();
		
	}

}
