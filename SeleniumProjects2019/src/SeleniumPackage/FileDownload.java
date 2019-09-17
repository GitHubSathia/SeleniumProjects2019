package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
public class FileDownload {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		WebElement DownloadBtn=driver.findElement(By.id("messenger-download"));
		String FileSourceLocation=DownloadBtn.getAttribute("href");
		//String wgetCommand="cmd /c C:\\Wget\\wget.exe -P C:\\Users\\Prabhu\\Downloads --no-check-certificate" + FileSourceLocation;
		String wgetCommand="cmd /c C:\\Wget\\wget.exe -P C:\\Users\\Prabhu\\Downloads --no-check-certificate http://demo.guru99.com/selenium/msgr11us.exe";
		try {
	        Process exec = Runtime.getRuntime().exec(wgetCommand);
	        int exitVal = exec.waitFor();
	        System.out.println("Exit value: " + exitVal);
	        } catch (InterruptedException | IOException ex) {
	        System.out.println(ex.toString());
	        }
	        driver.close();
		
	}

}
