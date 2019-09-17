package SeleniumPackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCert {
	public static void main(String args[]) throws InterruptedException
	{
		//WebDriver driver;
		//Djavax.net.ssl.trustStoreType=WINDOWS-ROOT;
		/*System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		ProfilesIni prof = new ProfilesIni();			
		FirefoxProfile ffProfile= prof.getProfile ("myProfile");
		ffProfile.setAcceptUntrustedCertificates(true);
		ffProfile.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver=new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();       
		handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions options = new ChromeOptions();
		options.merge(handlSSLErr);
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver();
		
		String homepage="https://www.zlti.com";
		HttpsURLConnection huc = null;
		String url="";
		int respCode=200;
		driver.get(homepage);
		driver.manage().window().maximize();
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		for(WebElement eachlink:alllinks)
		{
			 url=eachlink.getAttribute("href");
			System.out.println(url);
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
			}
			if(!url.startsWith(homepage))
			{
				System.out.println("URL belongs to another domain, skipping it.");
				 continue;
			}
			try {

					huc = (HttpsURLConnection)(new URL(url).openConnection());
                
					huc.setRequestMethod("HEAD");
                
					huc.connect();
                
					respCode = huc.getResponseCode();
					System.out.println(respCode);
					
					if(respCode >= 400){
	                    System.out.println(url+" is a broken link");
	                }
	                else{
	                    System.out.println(url+" is a valid link");
	                }
				
						
				}catch (MalformedURLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
						
			
		}
		
		driver.quit();
		
	}
}
