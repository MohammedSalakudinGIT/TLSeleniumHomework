package week4.homeworkday1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaJavascript {
	
	public static void main(String args[]) throws InterruptedException
	
	{
		
		/*
1) Go to https://www.nykaa.com/
2) Mouseover on Brands and Mouseover on Popular
3) Click L'Oreal Paris
4) Go to the newly opened window and check the title contains L'Oreal Paris
5) Click sort By and select customer top rated
6) Click Category and click Shampoo
7) check whether the Filter is applied with Shampoo
8) Click on L'Oreal Paris Colour Protect Shampoo
9) GO to the new window and select size as 175ml
10) Print the MRP of the product
11) Click on ADD to BAG
12) Go to Shopping Bag 
13) Print the Grand Total amount
14) Click Proceed
15) Click on Continue as Guest
16) Check if this grand total is the same in step 13
17) Close all windows
		 */
		
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.nykaa.com");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
				
				Actions action=new Actions(driver);
				
				action.moveToElement(driver.findElement(By.xpath("//li[@class='menu-dropdown-icon']/a"))).perform(); //Brands
				
				action.moveToElement(driver.findElement(By.xpath("//div[@class='BrandsCategoryHeading']//a[1]"))).perform(); //Popular
				
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//div[@id='brandCont_Popular']/ul[1]/li[5]/a[1]/img[1]")).click(); //L'Oreal Paris
				
				
				Set<String>allwindowhandles=driver.getWindowHandles();
				
				List<String> tablist=new ArrayList<String>(allwindowhandles);
			
				String zerotab=tablist.get(0);

				String firsttab=tablist.get(1);
				
				driver.switchTo().window(firsttab);
				
				JavascriptExecutor jscript=(JavascriptExecutor)driver; //scroll down
				
				jscript.executeScript("window.scrollBy(0,400)");				
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//span[text()='Sort By : ']")).click();
				driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='pull-right filter-options-toggle']")).click();
				driver.findElement(By.xpath("//div[@class='filter-options-toggle']")).click();
				driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
				driver.findElement(By.xpath("//div[@class='control__indicator']")).click();
				
				String shampoocheck = driver.findElement(By.xpath("//div[@id='sortComponent']/div[1]/div[1]/ul[1]/li[1]")).getText();
				if(shampoocheck.contains("Shampoo")) {
					System.out.println("Success. Shampoo found");
				}
				else
				{
					System.out.println("Failure. Shampoo not found");

				}
				

				allwindowhandles=driver.getWindowHandles();

				tablist=new ArrayList<String>(allwindowhandles);
				
				String secondtab=tablist.get(2);
				
				driver.switchTo().window(secondtab);
			
				driver.findElement(By.xpath("//span[text()='175ml']")).click();
				driver.findElement(By.xpath("//span[@class='post-card__content-price-offer']"));
				String MRP = driver.findElement(By.xpath("//span[text()='MRP:']")).getText();
				System.out.println(MRP);
				String rate = driver.findElement(By.xpath("//span[@class='post-card__content-price-offer']")).getText();
				System.out.println(rate);
				driver.findElement(By.xpath("//button[text()='ADD TO BAG']")).click();
				driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
				String grandTotal = driver.findElement(By.xpath("//div[text()='Grand Total:']")).getText();
				System.out.println(grandTotal);
				
				driver.findElement(By.xpath("//*[@id='headerWpr']/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/button/span")).click();//Proceed
				driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();//Continue as guest
				
				String total = driver.findElement(By.xpath("//div[text()='Grand Total']/following::span")).getText();
				
				if(total==grandTotal) {
					System.out.println("Price amount matching");
				}
				
				 driver.close();
				 driver.switchTo().window(firsttab);
				 driver.close();
				 driver.switchTo().window(zerotab);
				 driver.close();

						
	
	}
	
	
	
	}


