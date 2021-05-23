package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends BaseStep{
	
	@Then ("Verify Lead is created")
	public void verifyViewLead()
	{
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("Test passed. View Lead screen displayed successfully");
		}			
	}
	
	@And ("Click on Edit button")
	public void clickEditButton()
	{
		driver.findElementByLinkText("Edit").click();
	}
	

}
