package stepdefinition;

import io.cucumber.java.en.And;

public class FindLeadPage extends BaseStep{
	
	@And ("Click on phone number tab")
	public void clickPhoneNoTab()
	{
		driver.findElementByXPath("//span[text()='Phone']").click();
	}
	
	@And ("Type Phone number on search box as (.*)$")
	public void typePhoneNo(String phonenumber) throws InterruptedException
	{		
		driver.findElementByName("phoneNumber").click();
		driver.findElementByName("phoneNumber").sendKeys(phonenumber);
	}
	
	@And ("Click on Find Leads button")
	public void clickFindLeadsButton() throws InterruptedException
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
	}
	
	@And ("Click on first lead record from search result")
	public void clickFirstLeadSearchResult()
	{
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}

}
