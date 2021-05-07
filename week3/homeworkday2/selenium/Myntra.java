package week3.homeworkday2.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	
	public static void main(String args[]) throws InterruptedException {
		
		/*	1) Open https://www.myntra.com/
			2) Mouse over on WOMEN 
			3) Click Jackets & Coats
			4) Find the total count of item 
			5) Validate the sum of categories count matches
			6) Check Coats
			7) Click + More option under BRAND	
			8) Type MANGO and click checkbox
			9) Close the pop-up x
			10) Confirm all the Coats are of brand MANGO
			11) Sort by Better Discount
			12) Find the price of first displayed item
			13) Mouse over on size of the first item
			14) Click on WishList 
			15)close browser*/
		
		WebDriverManager.chromedriver().setup();	
		
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Women']"))).perform();
		driver.findElement(By.xpath("//li//a[text()='Jackets & Coats']")).click();
		String finalcount = driver.findElement(By.xpath("//span[@class='title-count']")).getText().replaceAll("\\D+", "");
		String count1=driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText().replaceAll("\\D+", "");
		String count2=driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText().replaceAll("\\D+", "");
	
		int totalcount=Integer.parseInt(finalcount);
		int countone=Integer.parseInt(count1);
		int counttwo=Integer.parseInt(count2);
		
		if(totalcount==countone+counttwo)
		{
			System.out.println("Count is matched");
		}else
		{
			System.out.println("Count not matched");
		}
		
	driver.findElementByXPath("//span[@class='categories-num']//following-sibling::div)[2]").click();
	Thread.sleep(2000);
	driver.findElementByXPath("//div[@class='vertical-filters-filters brand-container']//div[@class='brand-more']").click();
	driver.findElementByXPath("//input[@class='FilterDirectory-searchInput']").sendKeys("MANGO");
	driver.findElementByXPath("//span[@class='FilterDirectory-count']/following-sibling::div[1]").click();
	Thread.sleep(2000);
	driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();


	int totalcoats=driver.findElements(By.xpath("//h3[@class='product-brand']")).size();
	
	for(int i=0;i<=totalcoats-1;i++)
	{
		String coatmodel=driver.findElement(By.xpath("//h3[@class='product-brand']")).getText();
		if(coatmodel.equalsIgnoreCase("MANGO"))
		{
			System.out.println("All the brands are based on MANGO");
		}else
		{
			System.out.println("All the brands are not based on MANGO");
		}
	}

	
	driver.findElementByXPath("//span[@class='myntraweb-sprite sort-downArrow sprites-downArrow']").click();
	Thread.sleep(2000);
	driver.findElementByXPath("(//label[@class='sort-label'])[3]").click();
	driver.findElementByXPath("//span[@class='product-discountedPrice']").getText();
	action.moveToElement(driver.findElement(By.xpath("(//li[@class='product-base']/a)[1]"))).perform();
	driver.findElementByXPath("(//span[@class='myntraweb-sprite product-notWishlistedIcon sprites-notWishlisted'])[1]").click();
	driver.close();

	}

}
