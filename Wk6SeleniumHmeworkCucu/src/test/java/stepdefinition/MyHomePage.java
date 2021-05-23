package stepdefinition;

import io.cucumber.java.en.And;

public class MyHomePage extends BaseStep{
	
	@And ("Click Leads tab")
	public void clickLeadsTab()
	{
		driver.findElementByLinkText("Leads").click();
	}

}
