package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.pom.UniformMediumPOM3;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UniformMedium3{
	
	private WebDriver driver;
	private String baseUrl;
	
	private static Properties properties;
	private UniformMediumPOM3 UniformMediumPOM3;
	//private ScreenShot screenShot;
	

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		UniformMediumPOM3 =new UniformMediumPOM3(driver);
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
		UniformMediumPOM3.setName("admin");
		UniformMediumPOM3.setpassword("admin@123");
		UniformMediumPOM3.clickbutton();
	}
   
	@Test(priority=2)
	public void ProductsClick() {
		UniformMediumPOM3.clickMenu();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		UniformMediumPOM3.clickCatalog();
		UniformMediumPOM3.clickCategories();
		UniformMediumPOM3.clickEdit();
		UniformMediumPOM3.clickDataTab();
		UniformMediumPOM3.setStatus("Disabled");
		UniformMediumPOM3.clickSave();
	}
}
