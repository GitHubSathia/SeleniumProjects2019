package SeleniumPackage;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
public class FindingBrokenLinks {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Djavax.net.ssl.trustStoreType=WINDOWS-ROOT;
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//String homepage="http://demo.guru99.com/test/newtours/";
		String homepage="https://www.cognizant.com/";
		HttpURLConnection huc = null;
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

					huc = (HttpURLConnection)(new URL(url).openConnection());
                
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
