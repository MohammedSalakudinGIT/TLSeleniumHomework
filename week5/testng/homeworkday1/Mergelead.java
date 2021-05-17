package week5.testng.homeworkday1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Mergelead extends BaseTest{
	
	@Test(threadPoolSize=2000)
	
	public void mergeLead() throws InterruptedException
	
	{
		System.out.println("Starting Timeout test - Merge Lead");

		
				driver.findElement(By.linkText("Contacts")).click();
				
				driver.findElement(By.linkText("Merge Contacts")).click();
				
				driver.findElementByXPath("//table[@name='ComboBox_partyIdFrom']/following-sibling::a").click();
				
				Thread.sleep(2000);
				
				Set<String>allwindowhandles=driver.getWindowHandles();
				
				List<String> windowslist=new ArrayList<String>(allwindowhandles);
				
				String firstwindow=windowslist.get(1);
				
				driver.switchTo().window(firstwindow);

				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();

				Thread.sleep(2000);
				
				String parentwindow=windowslist.get(0);
			
				driver.switchTo().window(parentwindow);
		
				driver.findElementByXPath("//table[@name='ComboBox_partyIdTo']/following-sibling::a").click();
				
				Thread.sleep(2000);
				
				Set<String>allwindowhandles2=driver.getWindowHandles();
				
				List<String> windowslist2=new ArrayList<String>(allwindowhandles2);
				
				String firstwindow2=windowslist2.get(1);
				
				driver.switchTo().window(firstwindow2);
				
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]").click();

				Thread.sleep(2000);
				
				String parentwindow2=windowslist.get(0);
				
				driver.switchTo().window(parentwindow2);
				
				Thread.sleep(2000);

				driver.findElement(By.linkText("Merge")).click();
				
				Alert alert = driver.switchTo().alert();
				
				alert.accept();
				
				Thread.sleep(1000);
				
				String text=driver.findElementById("sectionHeaderTitle_contacts").getText();
				
				if(text.equals("View Contact"))
				{
					System.out.println("Test Passed");
				}
				else
				{
					System.out.println("Test Failed");

				}
				
	
	}
	
	
	
	}


