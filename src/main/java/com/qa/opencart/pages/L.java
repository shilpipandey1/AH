package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class L {

		private static WebDriver driver;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");
			WebDriver driver = new ChromeDriver();
		    driver = new ChromeDriver();
			driver.get("http://www.google.com");

	}

}
