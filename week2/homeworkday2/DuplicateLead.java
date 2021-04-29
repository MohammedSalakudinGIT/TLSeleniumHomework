package week2.homeworkday2;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	/*Duplicate Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)*/
	
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
	
	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	
	String companyname=driver.findElementById("viewLead_companyName_sp").getText();
	
	driver.findElementByLinkText("Duplicate Lead").click();

	String duplicateheader=driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
	
	if(duplicateheader.contains("Duplicate Lead")) { //checking duplicate lead screen title
		System.out.println("We are on Duplicate lead screen");
	} else {
		System.err.println("We are not on Duplicate lead screen");
	}
	
	driver.findElementByName("submitButton").click();
	
	if(companyname.contains("wipro")) { //checking duplicate lead screen title
		System.out.println("Test passed");
	} else {
		System.err.println("Test failed");
	}
	
	driver.close();
	
	System.out.println("Duplicate lead test successfully completed");

	
	}
	
}
