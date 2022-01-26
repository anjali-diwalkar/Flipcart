package Cucumbermap;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login 
{
	@Given("^user open \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	public void user_open_browser_with_exe(String arg1, String arg2) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation software support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	   
	}

	@Given("^user open url as\"([^\"]*)\"$")
	public void user_open_url_as(String arg1) throws Throwable {
	    
	}

	@When("^user click on cancel button$")
	public void user_click_on_cancel_button() throws Throwable {
	    
	}

	@When("^user move on login dropdown$")
	public void user_move_on_login_dropdown() throws Throwable {
	    
	}

	@When("^user click on my profile$")
	public void user_click_on_my_profile() throws Throwable {
	    
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	   
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	    
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    
	}

	@Then("^application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable {
	   
	}



}
