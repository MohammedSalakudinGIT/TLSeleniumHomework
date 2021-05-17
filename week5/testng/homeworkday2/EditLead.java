package week5.testng.homeworkday2;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseTest{
	
	@DataProvider(name="EditLeadTestData")

	public Object[][] fetchData() throws InvalidFormatException, IOException 
	{
		
		String [][] data=DataProviderExcelRead.readExcel("EditLead");
		
		return data;

	}
	
	
	@Test(dataProvider="EditLeadTestData")
	
	public void editLead(String firstname,String companyname) throws InterruptedException
	
	{
		
	driver.findElementByLinkText("Leads").click();
	
	driver.findElementByLinkText("Find Leads").click();
	
	Thread.sleep(1000);
	
	driver.findElementByName("firstName").click();
	
	driver.findElementByName("firstName").sendKeys(firstname);
	
	System.out.println("Firstname text passed successfully");

	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	Thread.sleep(1000);
	
	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	
	driver.findElementByLinkText("Edit").click();
	
	driver.findElementById("updateLeadForm_companyName").clear();

	driver.findElementById("updateLeadForm_companyName").sendKeys(companyname);

	driver.findElementByName("submitButton").click();
	
	System.out.println("Edit lead test successfully completed");

	}
	
}
