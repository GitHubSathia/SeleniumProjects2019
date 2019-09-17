package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FileUpload {
		public static void main(String args[])
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://demo.guru99.com/test/upload/");
			WebElement UploadFile=driver.findElement(By.id("uploadfile_0"));
			UploadFile.sendKeys("C:\\Prabhu\\Personal\\RiyaSchool\\riyaschoolLinks\\GoldenDoorK\\Homework\\Week10917\\Scan_20180917 (2).jpg");
			WebElement AcceptChkbox=driver.findElement(By.id("terms"));
			AcceptChkbox.click();
			WebElement Submit=driver.findElement(By.id("submitbutton"));
			Submit.click();
			//driver.close();
		}
	
}
