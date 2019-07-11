package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.pom.uniformMediumPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class uniformMedium{
	
	private WebDriver driver;
	private String baseUrl;
	
	private static Properties properties;
	private uniformMediumPOM uniformMediumPOM;
	//private ScreenShot screenShot;
	

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		uniformMediumPOM =new uniformMediumPOM(driver);
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
		uniformMediumPOM.setName("admin");
		uniformMediumPOM.setpassword("admin@123");
		uniformMediumPOM.clickbutton();
	}
   
	@Test(priority=2)
	public void ProductsClick() {
		uniformMediumPOM.clickMenu();
		uniformMediumPOM.clickCatalog();
		uniformMediumPOM.clickProducts();
		uniformMediumPOM.setProductName("Blazer Girls(7-8)");
		uniformMediumPOM.clickButton();
		uniformMediumPOM.setProductPrice("3000.0000");
		uniformMediumPOM.clickButton();
		uniformMediumPOM.setStatus("Enabled");
		uniformMediumPOM.clickButton();
		uniformMediumPOM.setModel("BLG-112");
		uniformMediumPOM.clickButton();
		uniformMediumPOM.setQuantity("100");
		uniformMediumPOM.clickButton();
		}
      }
	


