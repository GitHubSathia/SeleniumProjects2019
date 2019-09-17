package SeleniumPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class HandlingWindowObjectsFileUpload {
	
	WebDriver Obj;
	@Test
	public void zamzar() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		Obj=new FirefoxDriver();
		//WebDriverWait wait = new WebDriverWait(Obj, 20);
		Obj.manage().window().maximize();
		Obj.get("http://www.zamzar.com");
		//Obj.findElement(By.linkText("Choose Files...")).click();
		WebElement element=Obj.findElement(By.xpath("//input[@id='inputFile']"));
		//((JavascriptExecutor)Obj).executeScript("window.scrollTo(0,"+element.getLocation().x+")");
		((JavascriptExecutor) Obj).executeScript("arguments[0].click();", element);
		//element.click();
		//wait.until(ExpectedConditions.visibilityOf(Obj.findElement(By.xpath("//button[@id='inputFileButton']"))));
		//Obj.findElement(By.xpath("//button[@id='inputFileButton']")).click();
		Runtime.getRuntime().exec("C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\SeleniumWorkSpace\\FileUpload.exe");
	}

}
