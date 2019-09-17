package SeleniumPackage;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DynamicWebTable {
	
	public static void main(String args[]) throws InterruptedException, ParseException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String max;
		double m=0,r=0;
		driver.get("https://money.rediff.com/gainers/bse/daily/groupb");
		List col=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th"));
		List row=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr"));
		System.out.println("Number of columns="+col.size());
		System.out.println("Number of rows="+row.size());
		String thirdrowtext=driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[3]")).getText();
		System.out.println(thirdrowtext);
		String ThirdRowSecondCell=driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[3]/td[2]")).getText();
		System.out.println(ThirdRowSecondCell);
		
		for(int i=1;i<row.size();i++)
		{
			max=driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
			System.out.println(max);
			NumberFormat f=NumberFormat.getNumberInstance();
			Number num=f.parse(max);
			System.out.println(num);
			max=num.toString();
			System.out.println(max);
			m=Double.parseDouble(max);
			System.out.println(m);
			if(m>r)
			{
				r=m;
			}
			
		}
		
		System.out.println("Maximum Price=" +r);
		
		for(int i=0;i<row.size();i++)
		{
			for(int j=0;j<col.size();j++)
			{
				String celltext=driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[" + (i+1)+ "]/td[" + (j+1)+ "]")).getText();
				System.out.println("Row["+i+"]Col["+j+"]="+celltext);
			}
			System.out.println("---------");
		}
		
		
		
		driver.close();
		
		
	}

}



