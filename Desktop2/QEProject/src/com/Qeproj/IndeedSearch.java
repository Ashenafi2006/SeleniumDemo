package com.Qeproj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class IndeedSearch {
	public static void main(String [] args) throws InterruptedException{
		/*Key is methods that chromedriver recognize, 
		 and the location of chromedriver on your computer
		 */
		        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
		        WebDriver driver = new ChromeDriver();
		        driver.get("http://www.indeed.com");
		        driver.findElement(By.id("what")).click();
		        driver.findElement(By.id("what")).sendKeys("QE engineer");
		        Thread.sleep(3000);
		        driver.findElement(By.id("what")).sendKeys(Keys.ENTER);
		        System.out.println(driver.getTitle());
		        System.out.println("I got the title of the indeed search");
		        Assert.assertEquals("Qe Engineer Jobs, Employment in San Jose, CA | Indeed.com", driver.getTitle());
		        Thread.sleep(3000);
		        driver.findElement(By.linkText("Full Stack Application Engineer")).click(); 
		        System.out.println(driver.getTitle());
		        Assert.assertEquals("Qe Engineer Jobs", driver.getTitle());
		        driver.close();
		        System.out.println("Browser closed");  
		    }
	
}

/*
 * Launch Indeed
 * Search for QE engineer position
 * Click the third position
 * close browser
 * 
 * Launch browser, goto google 
 * search for css selector
 * click one selector and 
 * get the title.
 */
