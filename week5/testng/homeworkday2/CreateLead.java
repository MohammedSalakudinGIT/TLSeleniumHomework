package week5.testng.homeworkday2;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseTest {
	
	
	//Here we are reading data from excel and passing data to data provider
	
@DataProvider(name="CreateLeadTestData")

public Object[][] fetchData() throws InvalidFormatException, IOException
{
	
	String [][] data=DataProviderExcelRead.readExcel("CreateLead");
	
	return data;

}
	
	@Test(dataProvider="CreateLeadTestData",invocationCount=3) //Need to add invocation count
	
	public void createNewLead(String companyname,String firstname,String lastname,String postalcode) {

		System.out.println("Starting Create Lead");
	
		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName");

		driver.findElementById("createLeadForm_companyName").sendKeys(companyname); // Company name

		driver.findElementById("createLeadForm_firstName").sendKeys(firstname); // First name

		driver.findElementById("createLeadForm_lastName").sendKeys(lastname); // Last name

		driver.findElementById("createLeadForm_generalPostalCode").sendKeys(postalcode); // Postal code

		driver.findElementByName("submitButton").click();// Create Lead

	}
}
