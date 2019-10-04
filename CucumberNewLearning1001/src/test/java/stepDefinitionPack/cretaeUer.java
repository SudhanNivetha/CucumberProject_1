package stepDefinitionPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/*added newly*/
public class cretaeUer {
	
	WebDriver driver;
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
