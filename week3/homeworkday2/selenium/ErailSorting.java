package week3.homeworkday2.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSorting {
	
	public static void main(String args[]) throws InterruptedException {
		
//		Launch the browser
		
//		Launch the URL - https://erail.in/
		
//		Uncheck the check box - sort on date
		
//		clear and type in the source station 
		
//		clear and type in the destination station
		
//		Find all the train names using xpath and store it in a list
		
//		Use Java Collections sort to sort it and then print it

	    
		
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
		
		Thread.sleep(2000);
			
		List<WebElement> traintable = driver.findElementsByXPath("//table[@class = 'DataTable TrainList TrainListHeader']//td[2]");
				        
        List<String> list1= new ArrayList<String>();
        for (int i = 0; i < traintable.size(); i++) {
        	String trainlist =traintable.get(i).getText();
			
		}
        	Collections.sort(list1);
        	System.out.println(list1);
        
	}
		
	}

