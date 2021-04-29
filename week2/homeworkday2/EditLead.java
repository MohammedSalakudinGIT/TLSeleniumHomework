package week2.homeworkday2;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	/*Edit Lead:
		* 1	Launch the browser
			* 2	Enter the username
			* 3	Enter the password
			* 4	Click Login
			* 5	Click crm/sfa link
			* 6	Click Leads link
			* 7	Click Find leads
			* 8	Enter first name
			* 9	Click Find leads button
			* 10 Click on first resulting lead
			* 11 Verify title of the page
			* 12 Click Edit
			* 13 Change the company name
			* 14 Click Update
			* 15 Confirm the changed name appears
			* 16 Close the browser (Do not log out)*/
	
	public static void main(String args[]) throws InterruptedException
	
	{
		
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps");
	
	driver.manage().window().maximize();
	
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	driver.findElementById("password").sendKeys("crmsfa");
	
	driver.findElementByClassName("decorativeSubmit").click();
	
	String loggeduser=driver.findElementByTagName("h2").getText();
	System.out.println(loggeduser);
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Leads").click();
	
	driver.findElementByLinkText("Find Leads").click();
	
	Thread.sleep(1000);
	
	driver.findElementByName("firstName").click();
	
	driver.findElementByName("firstName").sendKeys("Mohammed");
	
	System.out.println("Firstname text passed successfully");

	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	Thread.sleep(1000);
	
	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

	String viewleadtitle=driver.findElementByXPath("//div[text()='View Lead']").getText();
	
	if(viewleadtitle.contains("View Lead")) { //checking duplicate lead screen title
		System.out.println("We are on View lead screen");
	} else {
		System.err.println("Sorry. We are not on View lead screen. Please check");
	}
	
	driver.findElementByLinkText("Edit").click();
	
	driver.findElementById("updateLeadForm_companyName").clear();

	driver.findElementById("updateLeadForm_companyName").sendKeys("RenaultNissan");

	driver.findElementByName("submitButton").click();
	
	String newcompanyname=driver.findElementById("viewLead_companyName_sp").getText();
	
	if(newcompanyname.contains("Renault")) { //checking duplicate lead screen title
		System.out.println("Test passed");
	} else {
		System.err.println("Test Failed");
	}

	driver.close();
	
	System.out.println("Edit lead test successfully completed");

	}
	
}
