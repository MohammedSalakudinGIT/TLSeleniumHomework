package week3.homeworkday2.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {
	
	public static void main(String args[]) throws InterruptedException {
		
//		Set the system property and Launch the URL
		
//		Click the 'sort on date' checkbox
		
//		clear and type in the from station text field
		
//		clear and type in the to station text field
		
//		Add a java sleep for 2 seconds
		
//		Store all the train names in a list
		
//		Get the size of it
		
//		Add the list into a new Set
		
//		And print the size of it

	    
		
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
		
		int listsize=traintable.size();
		
        Set<String> trainset = new HashSet<String>();	
        
        for(int i=0;i<=listsize-1;i++)
        	trainset.add(traintable.get(i).getText());	
        
        System.out.println("Set data are below");
        System.out.println(trainset);
        
        int setsize=trainset.size();
        System.out.println("Size of trainset is" + setsize);

	}
		
	}

