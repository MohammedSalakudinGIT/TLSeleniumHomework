package week2.homeworkday2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	/*
	 * //Pseudo Code
	 * 
	 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
	 * 
	 * 2. Enter UserName and Password Using Id Locator
	 * 
	 * 3. Click on Login Button using Class Locator
	 * 
	 * 4. Click on CRM/SFA Link
	 * 
	 * 5. Click on contacts Button
	 * 
	 * 6. Click on Create Contact
	 *  
	 * 7. Enter FirstName Field Using id Locator
	 * 
	 * 8. Enter LastName Field Using id Locator
	 * 
	 * 9. Enter FirstName(Local) Field Using id Locator
	 * 
	 * 10. Enter LastName(Local) Field Using id Locator
	 * 
	 * 11. Enter Department Field Using any Locator of Your Choice
	 * 
	 * 12. Enter Description Field Using any Locator of your choice 
	 * 
	 * 13. Enter your email in the E-mail address Field using the locator of your choice
	 * 
	 * 14. Select State/Province as NewYork Using Visible Text
	 * 
	 * 15. Click on Create Contact
	 * 
	 * 16. Click on edit button 
	 * 
	 * 17. Clear the Description Field using .clear
	 * 
	 * 18. Fill ImportantNote Field with Any text
	 * 
	 * 19. Click on update button using Xpath locator
	 * 
	 * 20. Get the Title of Resulting Page.
     */
	
	public static void main(String args[])
	{
		
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps");
	
	driver.manage().window().maximize();
	
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	driver.findElementById("password").sendKeys("crmsfa");
	
	driver.findElementByClassName("decorativeSubmit").click();
	
	String loggeduser=driver.findElementByTagName("h2").getText();
	System.out.println(loggeduser);
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Contacts").click();
	
	driver.findElementByLinkText("Create Contact").click();

	driver.findElementById("firstNameField").sendKeys("Salak");
	
	driver.findElementById("lastNameField").sendKeys("S");

	driver.findElementById("createContactForm_firstNameLocal").sendKeys("Sal");

	driver.findElementById("createContactForm_lastNameLocal").sendKeys("S");

	driver.findElementById("createContactForm_departmentName").sendKeys("IT");
	
	driver.findElementById("createContactForm_description").sendKeys("Information Technology");

	driver.findElementById("createContactForm_primaryEmail").sendKeys("test@gmail.com");

	WebElement stateprovince=driver.findElementByName("generalStateProvinceGeoId"); //stateprovince dropdown
	
	Select stateprovinceoption=new Select(stateprovince);
	
	stateprovinceoption.selectByVisibleText("New York");
	
	driver.findElementByName("submitButton").click();
	
	driver.findElementByLinkText("Edit").click();
	
	driver.findElementById("updateContactForm_generalProfTitle").sendKeys("Assistant Manager");

	driver.findElementById("updateContactForm_description").clear();

	driver.findElementById("updateContactForm_importantNote").sendKeys("Information Technology and science");
	
	driver.findElementByXPath("//input[@value='Update']").click();
	
	String title= driver.findElementById("viewContact_generalProfTitle_sp").getText();

	if(title.contains("Assistant Manager")) { //comparing title
		System.out.println("Testcase Passed");
	} else {
		System.err.println("Testcase failed");
	}
	

	}
	
}
