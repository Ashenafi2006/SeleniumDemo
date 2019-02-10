package com.Qeproj;

import java.lang.util;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import org.openqa.selenium.WebElement;

public class LaunchChrome {
	public static void main(String [] args) throws InterruptedException{
		/*Key is methods that chromedriver recognize, 
		 and the location of chromedriver on your computer
		 */
		        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
		        WebDriver driver = new ChromeDriver();
		        driver.get("http://www.google.com");
		        driver.findElement(By.id("lst-ib")).click();
		        driver.findElement(By.id("lst-ib")).sendKeys("css selectors chrome plugin");
		        Thread.sleep(3000);
		        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		        System.out.println(driver.getTitle());
		        System.out.println("I got the title of the searched page");
		        Assert.assertEquals("css selectors chrome plugin - Google Search", driver.getTitle());
		        Thread.sleep(3000);
		        driver.findElement(By.linkText("Copy Css Selector - Chrome Web Store")).click(); 
		        System.out.println(driver.getTitle());
		        Assert.assertEquals("Chrome Web Store - Extensions", driver.getTitle());
		        driver.close();
		        System.out.println("Browser closed");
		        
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
}
