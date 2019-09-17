package SeleniumPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Desiredcapabilities {

			public static void main(String args[])
			{
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				  
				capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				
				System.setProperty("webdriver.ie.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
				WebDriver driver=new InternetExplorerDriver();
				driver.get("http://gmail.com");
				  
				 driver.quit();
				
			}
}
