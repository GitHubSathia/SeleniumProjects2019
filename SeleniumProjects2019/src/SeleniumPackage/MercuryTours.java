package SeleniumPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;;
public class MercuryTours {

	public static void main(String args[])
	{
		
		// declaration and instantiation of objects/variables
		//Firefox Driver launch
		//System.setProperty("webdriver.firefox.marionette", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		//chromedriver launch
		//System.setProperty("webdriver.chrome.driver","C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//IE Driver launch
		System.setProperty("webdriver.ie.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		String baseUrl="http://demo.guru99.com/test/newtours/";
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle=" ";
		
		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);
		
		//maximize the browser
		driver.manage().window().maximize();
		
		 // get the actual value of the title
		actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		/* compare the actual title of the page with the expected one and print
        the result as "Passed" or "Failed" */
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("Test Failed");
		}
		
		//close Fire fox
		driver.close();
		
	}
}
