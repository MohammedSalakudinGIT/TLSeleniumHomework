package week5.testng.homeworkday1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseTest{
	
	@Test()
	
	public void createNewLead()
	{
		
	System.out.println("Starting Create Lead");

	
	driver.findElementByLinkText("Create Lead").click();
	
	driver.findElementById("createLeadForm_companyName");
	
	driver.findElementById("createLeadForm_companyName").sendKeys("RNTBCI");  //Company name
	
	driver.findElementById("createLeadForm_firstName").sendKeys("Mohammed"); //First name
	
	driver.findElementById("createLeadForm_lastName").sendKeys("S"); //Last name
	
	WebElement sourcedropdown=driver.findElementByName("dataSourceId"); //Source drop down
	
	Select sourceoption=new Select(sourcedropdown);
	
	sourceoption.selectByVisibleText("Partner");
	
	WebElement marketingdropdown=driver.findElementById("createLeadForm_marketingCampaignId"); //Marketing campaign drop down

	Select marketingoption=new Select(marketingdropdown);

	marketingoption.selectByVisibleText("Automobile");
	
	driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Sala"); //Local first name
	
	driver.findElementById("createLeadForm_lastNameLocal").sendKeys("S"); //Local last name

	driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr"); //Salutation
	
	driver.findElementById("createLeadForm_birthDate").sendKeys("08/14/1989"); //DOB

	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("AM"); //Title

	driver.findElementById("createLeadForm_departmentName").sendKeys("ACM"); //Department

	driver.findElementById("createLeadForm_annualRevenue").sendKeys("50000"); //Annual Revenue

	WebElement industrydropdown=driver.findElementById("createLeadForm_industryEnumId"); //Industry drop down

	Select industryoption=new Select(industrydropdown);

	industryoption.selectByVisibleText("Computer Software");
	
	driver.findElementById("createLeadForm_numberEmployees").sendKeys("10000"); //Annual Revenue

	WebElement ownershipdropdown=driver.findElementById("createLeadForm_ownershipEnumId"); //Ownership drop down

	Select ownershipoption=new Select(ownershipdropdown);

	ownershipoption.selectByVisibleText("Partnership");
	
	driver.findElementById("createLeadForm_sicCode").sendKeys("50"); //SIC code
	
	driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Test"); //SIC code

	driver.findElementById("createLeadForm_description").sendKeys("Car manufacturing"); //Description

	driver.findElementById("createLeadForm_importantNote").sendKeys("Twenty thousand orders"); //Important note

	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890"); //Phone number

	driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("300021"); //Area code

	driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Sal"); //Person to Ask for
	
	driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044"); //Extension

	driver.findElementById("createLeadForm_primaryEmail").sendKeys("sal@test.com"); //Email
	
	driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.saltest.com"); //Web address

	driver.findElementById("createLeadForm_generalToName").sendKeys("Sal"); //To Name

	driver.findElementById("createLeadForm_generalAttnName").sendKeys("Sala"); //Attention Name

	driver.findElementById("createLeadForm_generalAddress1").sendKeys("No 24, 2nd street"); //Address Line1

	driver.findElementById("createLeadForm_generalAddress2").sendKeys("USA"); //Address Line2

	driver.findElementById("createLeadForm_generalCity").sendKeys("NY"); //City

	WebElement statedropdown=driver.findElementById("createLeadForm_generalStateProvinceGeoId"); //State drop down

	Select stateoption=new Select(statedropdown);

	stateoption.selectByVisibleText("Maryland");
	
	driver.findElementById("createLeadForm_generalPostalCode").sendKeys("300218"); //Postal code

	driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("211"); //Postal code extension

	driver.findElementByName("submitButton").click();//Create Lead
	
	driver.findElementByLinkText("Duplicate Lead").click(); //Duplicate Lead

	driver.findElementById("createLeadForm_companyName").clear();
	
	driver.findElementById("createLeadForm_companyName").sendKeys("RenaultNissan"); //providing new company name
			
	driver.findElementByName("submitButton").click();//Resubmitting updated details
	
	String newcompanyname = driver.findElementById("viewLead_companyName_sp").getText();
		
	if(newcompanyname.contains("RenaultNissan")) { //comparing new company availability
		System.out.println("Testcase Passed");
	} else {
		System.err.println("Testcase failed");
	}
	

	}
	
}
