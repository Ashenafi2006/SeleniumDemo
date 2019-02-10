package com.Qeproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchFirefox {

	public static void main(String [] args){
		/*Key is methods that chromedriver recognize, 
		 and the location of chromedriver on your computer
		 */	
		///Users/ashenafieshete/Desktop2/QEProject/libs
				System.setProperty("webdriver.firefox.marionette", "./libs/geckodriver");
			//	DesiredCapabilities  cap = new DesiredCapabilities();
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.facebook.com");
				System.out.println(driver.getTitle());
				System.out.println("I got you the title Femi");
				//driver.quit();
				System.out.println("Browser closed");
				
				//webdriver.firefox.marionette
			}

}
