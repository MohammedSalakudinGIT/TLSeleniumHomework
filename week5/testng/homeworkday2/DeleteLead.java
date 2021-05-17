package week5.testng.homeworkday2;

import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DeleteLead extends BaseTest{
	
	@Ignore()

	@Test()
	
	public void deleteLead() throws InterruptedException 
	{

		
		System.out.println("Starting Depends on Methods test - Delete Lead. Dependent on Create Lead");
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		        
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		
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
		 
	} 

}
