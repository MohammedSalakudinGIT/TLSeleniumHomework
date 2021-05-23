package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LeadsPage extends BaseStep{
	
	@When ("Click on Create Lead link")
	public void clickCreateLeadLink()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And ("Click on Find Lead link")
	public void clickFreateLeadLink()
	{
		driver.findElementByLinkText("Find Leads").click();
	}
	

}
