package com.Qeproj;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TestNGDemo {
	
	public static void main(String[]args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://107.170.213.234/catalog/");
		String currentURL = driver.getCurrentUrl();
		System.out.println("currentURL is :");
		System.out.println(currentURL);
		Thread.sleep(5000);
		driver.close();
		
		
	}

	
		
	}
	
	
	
		
	
	

	/*@Test
	public void gettitle() {
		System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://107.170.213.234/catalog/");
		String CurrerntURL = "http://107.170.213.234/catalog/";
		System.out.println("This is Currenr URL:");
		Assert.assertEquals(CurrerntURL, "http://107.170.213.234/catalog/");
		String CurrentTitle = "iBusiness";
		System.out.println("This is Currenr Title:");
		Assert.assertEquals(CurrentTitle, "iBusiness");*/

		

		

		/*
		 * 1. Write a test automation to validate the number on hardware on the
		 * hardware page. 2. Validate the URL 3. Validate the Title
		 */

	


