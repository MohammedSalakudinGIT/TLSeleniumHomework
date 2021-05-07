package week3.homeworkday2.selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MapErail {
	
	public static void main(String args[]) throws InterruptedException {
//		1) Set the property
//		2) Initiate ChromeDriver class
//		3) Launch the URL - https://erail.in/
//		4) Maximize the browser
//		5) Add implicityWait
//		6) Clear and type in the from station
//		7) Clear and type in the to station
//		8) Uncheck the 'Sort on Date' checkbox	
//		9) Declare a Map
//		10) Store the table in a web element
//		11) Get all the rows and store it in a List
//		12) Iterate the rows and store all the columns in a List
//		13) Check and get the values that start with 'S'
//	    14) If the condition satisfies add it into the map as key & value
//		15) Print those values by iterating the map

	    
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://erail.in");

		Thread.sleep(2000);
		driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		driver.findElementByXPath("//input[@title='Type SOURCE station code or name']").click();
		driver.findElementByXPath("//input[@title='Type SOURCE station code or name']").clear();
		driver.findElementByXPath("//input[@title='Type SOURCE station code or name']").sendKeys("New Delhi");

		driver.findElementByXPath("//input[@title='Enter DESTINATION station code or name']").click();
		driver.findElementByXPath("//input[@title='Enter DESTINATION station code or name']").clear();
		driver.findElementByXPath("//input[@title='Enter DESTINATION station code or name']").sendKeys("Lucknow");
			
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
			
		Map<String, String> etrain = new HashMap<String, String>();

		WebElement traintable = driver.findElementByXPath("//table[@class = 'DataTable TrainList TrainListHeader']");
			
	    List<WebElement> rows = traintable.findElements(By.tagName("tr"));
	    
	    List<WebElement> column = traintable.findElements(By.tagName("td"));
	    String value = null;
	    
	    for (int j=0; j<column.size(); j++){
            value=column.get(j).getText();
            System.out.println(value);
            
        }
	    
        if (value.startsWith("S")){
        	
        	etrain.put(value, value);
     
        }
        
        System.out.println(etrain);
        
     
		
	}

}
