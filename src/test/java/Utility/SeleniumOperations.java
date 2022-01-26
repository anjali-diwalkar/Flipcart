package Utility;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
	public static WebDriver driver = null;
// browser launch
	public static void browserLaunch(Object[]inputparameters)
	{
		String strBrowserName=(String)inputparameters[0];
		String WebDriverExepath = (String)inputparameters[1];
		
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", WebDriverExepath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (strBrowserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", WebDriverExepath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
//open application
		public static void openApplication(Object[]inputparameters)
		{
			String strurl = (String) inputparameters[0];
			driver.get(strurl);
		}	
//click on element
		public static void clickonelement(Object[]inputparameters)
		{
			String xpath =(String)inputparameters[0];
			driver.findElement(By.xpath(xpath)).click();
		}
//move to element
		public static void movetoelement(Object[]inputparameters)
		{
			String xpath=(String)inputparameters[0];
			Actions act=new Actions(driver);
			WebElement element=driver.findElement(By.xpath(xpath));
			act.moveToElement(element).build().perform();
		}
//Send keys  method	
		public static void sendkeys(Object[]inputparameters)
		{
			String xpath=(String)inputparameters[0];
			String data=(String)inputparameters[1];
			driver.findElement(By.xpath(xpath)).sendKeys(data);
		}
				
		
public static void main(String[]args)
{
//Browser launch
	Object[]input=new Object[2];
	input[0]="chrome";
	input[1]="D:\\Automation software support\\chromedriver.exe";
	browserLaunch(input);
	
//open application
	Object[]input1= new Object[1];
	input1[0]=("https://www.flipkart.com/");
	openApplication(input1);

//click on element
	Object[]input2=new Object[1];
	input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	//input2[0]="//*[@ class='_2MlkI1']";
	clickonelement(input2);
//move to element
	Object[]input3= new Object[1];
	input3[0]="(//*[@class='_1_3w1N'])";
	movetoelement(input3);
//click on profile
	 Object[]input4=new Object[1]; 
	 input4[0]="//*[text()='My Profile']";
	 clickonelement(input4);
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//enter user name
	 Object[]input5=new Object[2];
	 input5[0]="//*[@type='text'][@class='_2IX_2- VJZDxU']";
	 input5[1]="9370006246";
	 sendkeys(input5);
//enter password	 
	 Object[]input6=new Object[2];
	 input6[0]="//*[@type='password']";
	 input6[1]="avd@32";
	 sendkeys(input6);
//click on login 
	 Object[]input7=new Object[1];
	 input7[0]="//*[@type='submit'][@class='_2KpZ6l _2HKlqd _3AWRsL']";
	 clickonelement(input7);
//click on electronics
	 Object[]input8=new Object[1];
	 input8[0]="//*[@class='_2I9KP_ _2WDRax']";
	 clickonelement(input8);
			
}

}