package week5.testng.homeworkday1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class EditLead extends BaseTest{
	
	@Ignore()
	@Test()
	
	public void editLead() throws InterruptedException
	
	{
		
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
