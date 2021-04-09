package com.mpokket_assesment.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
public class BaseClass {
public Fileutility file=new Fileutility();
	public WebDriver driver;
	@BeforeClass
	public void configBeforeClass() throws Throwable {
		/* launch the Browser*/
		/*read Common Data*/
		String url= file.readdatafrompropfile("url");
		
			 driver = new ChromeDriver();
		 driver.get(url);
		
	}
	
	@AfterClass
	public void configAfterClass() {
		driver.close();
	}
	
	
}
