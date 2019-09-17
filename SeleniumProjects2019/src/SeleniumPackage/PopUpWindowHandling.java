package SeleniumPackage;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PopUpWindowHandling {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(" http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(5000);
		String Mainwindow=driver.getWindowHandle();
		Set<String> allbrwsr=driver.getWindowHandles();
		
		for(String eachbrwsr:allbrwsr)
		{
			if(!eachbrwsr.equalsIgnoreCase(Mainwindow))
			{
				driver.switchTo().window(eachbrwsr);
				driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
                driver.findElement(By.name("btnLogin")).click();
                String UserId=driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
                System.out.println(UserId);
                driver.close();
			}
		}
		
		/*Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			String ChildWindow=i1.next();
			if(!Mainwindow.equalsIgnoreCase(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
								driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				String UserId=driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
				System.out.println(UserId);
				driver.close();
			}
		}*/
		
		driver.switchTo().window(Mainwindow);
		
		
	}
	
	
}
