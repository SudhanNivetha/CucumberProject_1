package stepDefinitionPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
//import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class LoginStepDefinition {
		
	WebDriver driver;
		
		@Given("User is already on Login Page")
		public void user_already_on_login_page()
		{
			System.setProperty("webdriver.chrome.driver","C:/Users/User/Desktop/New folder/chromedriver.exe");
			String url="https://www.facebook.com";
			driver=new ChromeDriver();
			driver.get(url);		
			System.out.println("Browser Opened"); 
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		
		@When("title of login page is facebook")
		
		public void title_login_pages()
		{  
			String title=driver.getTitle();
			System.out.println(title);
		}
		
		@Then("^User enters username and password")
		public void enter_user_pass(DataTable cred)
		{
			List<List<String>>aa=cred.raw();			
			driver.findElement(By.name("email")).sendKeys(aa.get(0).get(0));
			driver.findElement(By.name("pass")).sendKeys(aa.get(0).get(1));
			}
		
		@Then("user clicks on LogIn button")
		public void user_clicks_logIn_Button()
		{
			driver.findElement(By.xpath("//*[@type='submit']")).click();					
		}
		
		@And("user is on home page")
		public void user_home_page()
		{
			System.out.println("Logged on to home page");
			String title=driver.getTitle();
			System.out.println("Title Bar:"+title);
			Assert.assertEquals("(2) Facebook", title);
			driver.quit();
		}
			
		
		
	
	}


