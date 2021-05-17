package week5.testng.homeworkday2;

import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DeleteLead extends BaseTest{
	
	@Test()
	
	public void deleteLead() throws InterruptedException 
	{

		
		System.out.println("Starting Delete Lead");
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		        
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Delete")).click();
		
		System.out.println("Delete Lead test completed");

		

		 
	} 

}
