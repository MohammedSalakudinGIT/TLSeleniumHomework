package week5.testng.homeworkday2;

import org.testng.annotations.Test;

public class DuplicateLead extends BaseTest{
	
	@Test()
	
	public void createNewLead()
	{
		
	System.out.println("Starting Duplicate Lead");

	driver.findElementByLinkText("Duplicate Lead").click(); //Duplicate Lead

	driver.findElementById("createLeadForm_companyName").clear();
	
	driver.findElementById("createLeadForm_companyName").sendKeys("BOA"); //providing new company name
			
	driver.findElementByName("submitButton").click();//Resubmitting updated details
	
	String newcompanyname = driver.findElementById("viewLead_companyName_sp").getText();
		
	if(newcompanyname.contains("BOA")) { //comparing new company availability
		System.out.println("Testcase Passed");
	} else {
		System.err.println("Testcase failed");
	}
	

	}
	
}
