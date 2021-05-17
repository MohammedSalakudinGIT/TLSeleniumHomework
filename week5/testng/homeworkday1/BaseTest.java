package week5.testng.homeworkday1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	ChromeDriver driver;
	
	@BeforeMethod()
	public void userLogin() throws InterruptedException 
	{
		
		System.out.println("Executing Before method");
	
		WebDriverManager.chromedriver().setup();
	
		driver =new ChromeDriver(); 
	
		driver.get("http://leaftaps.com/opentaps");
	
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String loggeduser=driver.findElementByTagName("h2").getText();
		System.out.println(loggeduser);
		
		Thread.sleep(1000);
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		System.out.println("Executed Before method successfully");


	}
		
		@AfterMethod()
		
		public void userLogout() throws InterruptedException 
		{
			
			System.out.println("Executing After method");
		
			driver.close();
			
			System.out.println("Executed After method successfully");

		}

		
	} 


