package com.example.demo;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleAutomation {

	public static void main(String[] args) throws Exception{
		  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
		driver.get("http://www.google.com");
		Thread.sleep(  1000 * 2 );
		
		//driver.findElement(By.xpath("//*[@id=\"registerButton\"]")).sendKeys("");;
		driver.findElement(By.id("loginButton")).click();
		

	}

}
