package stepDefinitionPack;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/*added newly now*/
public class maplogin 
{
	WebDriver driver;
	
	@Given("User is on Login Page")
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
	
	@When("title1 of login page is facebook")
	public void title1_login_pages()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Then("^User enters username1 and password1")
	public void enter_user_pass(DataTable cred) throws InterruptedException
	{
		 for(Map <String,String>aa:cred.asMaps(String.class, String.class))
		{
		driver.findElement(By.name("email")).sendKeys(aa.get("username1"));
		driver.findElement(By.name("pass")).sendKeys(aa.get("password1"));
		Thread.sleep(5000);
		}
		}
	
	@Then("clicks on LogIn button")
	public void clicks_logIn_Button() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@type='submit']")).click();	
		Thread.sleep(5000);
	}	
	@And("user is at home page")
	public void user_at_home_page()
	{
		System.out.println("Logged on to home page");
		String title1=driver.getTitle();
		System.out.println("Title Bar:"+title1);
		Assert.assertEquals("(2) Facebook", title1);
		driver.quit();
	}
		

}
