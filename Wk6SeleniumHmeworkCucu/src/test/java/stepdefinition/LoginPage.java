package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseStep{
	
	
	@Given ("Launch Chrome Browser")
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait= new WebDriverWait(driver, 10);
	}
	
	@When ("Load URL {string}")
	public void loadURL(String url)
	{
		driver.get(url);
	}
	
	@And ("Type Username as {string}")
	public void typeUserName(String username)
	{
		driver.findElementById("username").sendKeys(username);
	}
	
	@And ("Type Password as {string}")
	public void typePassword(String password)
	{
		driver.findElementById("password").sendKeys(password);
	}
	
	@And ("Click Login Button")
	public void login()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And ("Verify Login is successful")
	public void loginSucess()
	{
		String loggeduser=driver.findElementByTagName("h2").getText();
		if(loggeduser.contains("Demo Sales Manager"))
		{
			System.out.println("Login test success");
		}else
		{
			System.out.println("Login test failed");
		}
	}

	
	
	

}
