package com.Qeproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
	
	// get Mercury Tours's Home page
	// Verify its Title
	//Print out the result of the comparison
	public static void main(String[]args){
		/*System.setProperty("webdriver.firefox.marionette","/Users/ashenafieshete/Desktop2/QEProject/libs");	
		WebDriver driver = new FirefoxDriver();
		*/
		System.setProperty("webdriver.chrome.drver","/Users/ashenafieshete/Desktop2/QEProject/libs");
		WebDriver driver = new ChromeDriver();
		String baseURl = "http://demo.guru99.com/selelium/newtoures/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		driver.get("baseURl");
		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(actualTitle)){
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
			driver.close();
				
		}
		
		
		
		
		
	}
	
	

}
