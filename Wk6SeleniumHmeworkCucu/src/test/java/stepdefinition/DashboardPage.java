package stepdefinition;

import io.cucumber.java.en.And;

public class DashboardPage extends BaseStep{
	
	@And ("Click CRM link")
	public void clickCRM()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}

}
