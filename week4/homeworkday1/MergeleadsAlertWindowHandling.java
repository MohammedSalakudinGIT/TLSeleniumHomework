package week4.homeworkday1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeleadsAlertWindowHandling {
	
	public static void main(String args[]) throws InterruptedException
	
	{
		
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 	
		 * 6. Click on Merge Contacts using Xpath Locator
		 * 
		 * 7. Click on Widget of From Contact
		 * 
		 * 8. Click on First Resulting Contact
		 * 
		 * 9. Click on Widget of To Contact
		 * 
		 * 10. Click on Second Resulting Contact
		 * 
		 * 11. Click on Merge button using Xpath Locator
		 * 
		 * 12. Accept the Alert
		 * 
		 * 13. Verify the title of the page
		 */
		
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
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


