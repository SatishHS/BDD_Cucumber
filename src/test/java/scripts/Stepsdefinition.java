package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepsdefinition 
{
	public WebDriver driver;
	@Given("open the browser and enter the URL")
	public void open_the_browser_and_enter_the_url() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@When("enter the valid username and password")
	public void enter_the_valid_username_and_password() 
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
	   
	}

	@When("click on the login button")
	public void click_on_the_login_button() throws InterruptedException 
	{
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    Thread.sleep(5000);
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() 
	{
		String title = driver.getTitle();
		if(title.equals("actiTIME -  Enter Time-Track"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	    
	}

}
