package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class AjaxcallHandling {
	
	String URL ="http://demo.guru99.com/test/ajax.html";
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(URL);
			}
	@Test
	public void ajaxCall() {
		By container=By.xpath("//div[@class='container']");
		wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(container));
		WebElement noTextElement=driver.findElement(By.className("radiobutton"));
		String textBeforeAjaxCall=noTextElement.getText().trim();
		driver.findElement(By.id("yes")).click();
		driver.findElement(By.id("buttoncheck")).click();
		WebElement TextElement=driver.findElement(By.className("radiobutton"));
		wait.until(ExpectedConditions.visibilityOf(TextElement));
		String textAfterAjaxCall=TextElement.getText().trim();
		Assert.assertNotEquals(textBeforeAjaxCall, textAfterAjaxCall);
		String expectedText = "Radio button is checked and it's value is Yes";
		Assert.assertEquals(expectedText, textAfterAjaxCall);
		
	}

}
