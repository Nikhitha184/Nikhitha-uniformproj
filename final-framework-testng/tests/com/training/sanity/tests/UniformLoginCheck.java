package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.pom.UniformloginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UniformLoginCheck {
	
	private WebDriver driver;
	private String baseUrl;
	
	private static Properties properties;
	private UniformloginPOM uniformloginPOM;
	//private ScreenShot screenShot;
	

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		uniformloginPOM=new UniformloginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
	}

	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}

	@Test(priority=1)
	public void validLoginTest() {
	uniformloginPOM.setName("admin");
	uniformloginPOM.setpassword("admin@123");
	uniformloginPOM.clickbutton();
	}
	
	@Test(priority=2)
	public void categoryClick() {
	uniformloginPOM.clickMenu();
	uniformloginPOM.clickCatalog();
	uniformloginPOM.clickCategories();
	}
	
	@Test(priority=3)
	public void deleteitem() {
	uniformloginPOM.clickCheckbox();
	uniformloginPOM.clickDeletebutton();
	}
	
}


  