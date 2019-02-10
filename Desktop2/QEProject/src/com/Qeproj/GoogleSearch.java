package com.Qeproj;
import java.lang.util;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import org.openqa.selenium.WebElement;


public class GoogleSearch  {
	
	public static void main(String [] args) {
		/*Key is methods that chromedriver recognize, 
		 and the location of chromedriver on your computer
		 */
		        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
		        WebDriver driver = new ChromeDriver();
		        driver.get("http://www.google.com");
		        driver.findElement(By.name("q")).click();
		        driver.findElement(By.name("q")).sendKeys("Barck Obama");
		        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		        //driver.findElement(By.linkText("Images")).click();
		        driver.findElement(By.xpath("//*[@id='rso']/div[4]/div/div/div/div[1]/a/h3")).click();
		        driver.close();
		    //XPath: //input[contains(@id, '_name')]
		      
		        
	}
		}
