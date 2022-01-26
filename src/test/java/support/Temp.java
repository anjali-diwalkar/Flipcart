package support;

import org.openqa.selenium.chrome.ChromeDriver;

public class Temp 

{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation software support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

}
