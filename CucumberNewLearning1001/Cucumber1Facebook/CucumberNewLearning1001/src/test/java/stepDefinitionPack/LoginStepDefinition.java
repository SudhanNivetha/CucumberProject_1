package stepDefinitionPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
//import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





import cucumber.api.DataTable;
import cucumber.api.PendingException;
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
			/*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("junpyojandidogs@gmail.com");
			driver.findElement(By.xpath(" //*[@id='pass']")).sendKeys("Knivetha@16]");*/
			List<List<String>>aa=cred.raw();			
			driver.findElement(By.name("email")).sendKeys(aa.get(0).get(0));
			driver.findElement(By.name("pass")).sendKeys(aa.get(0).get(1));
		}
		
		@Then("user clicks on LogIn button")
		public void user_clicks_logIn_Button()
		{
			//driver.findElement(By.xpath(" //*[@type='submit']"));
			WebElement we=driver.findElement(By.xpath(" //*[@type='submit']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style', '(background: green; border: 2px solid red;');",we);
			js.executeScript("arguments[0].click();",we);
			
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
		
		
		
		
		
		
		
		
		
		@Given("User is already on Create new account Page")
		public void user_is_on_login_page()
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

		@Then("^User enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void User_enters(String firstname, String lastname, String mnumber, String npassword) throws Throwable {
			/*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("junpyojandidogs@gmail.com");
			driver.findElement(By.xpath(" //*[@id='pass']")).sendKeys("Knivetha@16]");*/
			/*if(driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"))==null)
			{
				driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
			}
			else*/
			{
			driver.findElement(By.name("firstname")).sendKeys(firstname);
			driver.findElement(By.name("lastname")).sendKeys(lastname);
			driver.findElement(By.name("reg_email__")).sendKeys(mnumber);
			driver.findElement(By.name("reg_passwd__")).sendKeys(npassword);
			}
			
			
		}
		@Then("^user selects \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void user_selects(String day, String month, String year) throws Throwable 
		{
			Select sday=new Select(driver.findElement(By.name("birthday_day")));
			sday.selectByValue(day);
			Select smonth=new Select(driver.findElement(By.name("birthday_month")));
			smonth.selectByVisibleText(month);
			Select syear=new Select(driver.findElement(By.name("birthday_year")));
			syear.selectByValue(year);
			WebElement we=driver.findElement(By.id("u_0_6"));
			we.click();
			
		}
		@And("^user click on register button$")
		public void user_click_on_register_button() throws Throwable
		{
			driver.findElement(By.name("websubmit")).click();
		//	driver.quit();
			 
			
		}
		
	}


