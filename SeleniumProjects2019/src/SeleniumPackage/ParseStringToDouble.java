package SeleniumPackage;

import java.text.NumberFormat;
import java.text.ParseException;
import org.openqa.selenium.By;

public class ParseStringToDouble {
	public static void main(String args[]) throws ParseException
	{
		
	
	String max="222,223.125";
	double m=0;
	Number num=NumberFormat.getNumberInstance().parse(max);
	System.out.println(num);
	max=num.toString();
	System.out.println(max);
	m=Double.parseDouble(max);
	System.out.println(m);
	
	
	/*NumberFormat f=NumberFormat.getNumberInstance();
	Number num=f.parse(max);
	System.out.println(num);
	max=num.toString();
	System.out.println(max);
	m=Double.parseDouble(max);
	System.out.println(m);*/
	
	
}
}

