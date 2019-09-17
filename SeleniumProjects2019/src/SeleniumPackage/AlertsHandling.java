package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AlertsHandling {
		public static void main(String args[]) throws InterruptedException
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("http://demo.guru99.com/test/delete_customer.php");
				WebElement CustId=driver.findElement(By.name("cusid"));
				CustId.sendKeys("12345");
				WebElement SubmitBtn=driver.findElement(By.name("submit"));
				SubmitBtn.click();
				String AlertTxt=driver.switchTo().alert().getText();
				System.out.println(AlertTxt);
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
				Alert alert1=driver.switchTo().alert();
				String AlertTxt1=alert1.getText();
				System.out.println(AlertTxt1);
				alert1.accept();
				driver.close();
			}
	
}
