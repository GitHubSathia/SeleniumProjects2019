package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
public static void main(String args[])
{
	System.setProperty("webdriver.firefox.marionette", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	Select CountryDropdown=new Select(driver.findElement(By.name("country")));
	CountryDropdown.selectByVisibleText("ANGOLA");
	
	//Selecting Items in a Multiple SELECT elements
	driver.get("http://jsbin.com/osebed/2");
	Select fruits=new Select(driver.findElement(By.id("fruits")));
	if(fruits.isMultiple())
	{
		fruits.selectByIndex(0);
		fruits.selectByIndex(1);
	}
	
	driver.close();
}
}
