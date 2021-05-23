package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateLeadPage extends BaseStep{
	
	@And ("Type CompanyName as (.*)$")
	public void companyName(String companyname)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(companyname);
	}
	
	@And ("Type FirstName as (.*)$")
	public void FirstName(String firstname)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
	}
	
	@And ("Type LastName as (.*)$")
	public void LastName(String lastname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
	}
	
	@Then ("Click Create Lead button")
	public void clickCreateLeadButton()
	{
		driver.findElementByName("submitButton").click();;
	}

}
