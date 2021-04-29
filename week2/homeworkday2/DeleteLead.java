package week2.homeworkday2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	
	/*Delete Lead:
	1	Launch the browser
	2	Enter the username
	3	Enter the password
	4	Click Login
	5	Click crm/sfa link
	6	Click Leads link
	7	Click Find leads
	8	Click on Phone
	9	Enter phone number
	10	Click find leads button
	11	Capture lead ID of First Resulting lead
	12	Click First Resulting lead
	13	Click Delete
	14	Click Find leads
	15	Enter captured lead ID
	16	Click find leads button
	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	18	Close the browser (Do not log out)*/
	
	public static void main(String[] args) throws InterruptedException 
	{
	
			WebDriverManager.chromedriver().setup();
	
		ChromeDriver driver =new ChromeDriver(); 
	
		driver.get("http://leaftaps.com/opentaps");
	
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String text =driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		        
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("1324");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
		
		String firstlead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys(firstlead);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		 String norecords = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		 
		 if(norecords.contains("No records to display")) {
			 System.out.println("Delete success. Lead record not available");
		 }
		 else
		 {
			 System.out.println("Lead record available. Delete failed");
		 }
		 
		 driver.close();
	} 

}
