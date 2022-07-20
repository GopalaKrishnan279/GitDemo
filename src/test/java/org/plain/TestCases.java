package org.plain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
private void tc(String browserName) {
	WebDriver driver;
	
	if(browserName.startsWith("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	else if(browserName.startsWith("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	else {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}