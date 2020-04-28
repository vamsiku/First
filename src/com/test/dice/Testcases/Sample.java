package com.test.dice.Testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		
		WebDriverManager.chromedriver().version("2.41").setup();
    	
		driver = new ChromeDriver();
    	
    	driver.get("https://www.spicejet.com");
    	driver.manage().window().maximize();
    	
		
	}
	
	@Test
	public void print()
	{
		System.out.println("HI");
	}
	@BeforeMethod
	public void view()
	{
		System.out.println("sample");
		
	}
	@Test
	public void s()
	{
		System.out.println("right");
	}

	@AfterMethod

	public void AM()
	{
		System.out.println("AM");
	}


	
	
	
	
	
		
		

	
}
