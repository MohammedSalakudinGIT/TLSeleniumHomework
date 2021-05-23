package stepdefinition;

import io.cucumber.java.en.And;

public class EditLeadPage extends BaseStep{
	
	@And ("Type updated company name as (.*)$")
	public void updatedCompanyName(String updatedcompanyname)
	{
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(updatedcompanyname);
		System.out.println("Updated company name provided successfully");
	}
	
	@And ("Click on Update button")
	public void clickUpdateButton()
	{
		driver.findElementByName("submitButton").click();
	}
	
}
