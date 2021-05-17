package week5.testng.homeworkday2;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseTest{
	
	
	@DataProvider(name="DuplicateLeadTestData")

	public Object[][] fetchData() throws InvalidFormatException, IOException
	{
		
		String [][] data=DataProviderExcelRead.readExcel("DuplicateLead");
		
		return data;

	}
	
	
	@Test(dataProvider="DuplicateLeadTestData")
	
	public void duplicateLead(String companyname,String postalcode)
	{
		
	System.out.println("Starting Duplicate Lead");
	
	driver.findElementByLinkText("Leads").click();

	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
	
	driver.findElementByLinkText("Duplicate Lead").click(); //Duplicate Lead

	driver.findElementById("createLeadForm_companyName").clear();
	
	driver.findElementById("createLeadForm_companyName").sendKeys(companyname); //providing new company name
	
	driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys(postalcode); //providing new postal code
	
	driver.findElementByName("submitButton").click();//creating duplicate lead
	
	String newcompanyname = driver.findElementById("viewLead_companyName_sp").getText();
		
	if(newcompanyname.contains(companyname)) { //comparing new company availability
		System.out.println("Testcase Passed");
	} else {
		System.err.println("Testcase failed");
	}

	}
	
}
