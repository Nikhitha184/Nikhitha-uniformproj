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


import com.training.pom.UniformMediumPOM2;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UniformMedium2{
	
	private WebDriver driver;
	private String baseUrl;
	
	private static Properties properties;
	private UniformMediumPOM2 UniformMediumPOM2;
	//private ScreenShot screenShot;
	

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		UniformMediumPOM2 =new UniformMediumPOM2(driver);
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
		UniformMediumPOM2.setName("admin");
		UniformMediumPOM2.setpassword("admin@123");
		UniformMediumPOM2.clickbutton();
	}
   
	@Test(priority=2)
	public void ProductsClick() {
		UniformMediumPOM2.clickMenu();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		UniformMediumPOM2.clickCatalog();
		UniformMediumPOM2.clickProducts();
		UniformMediumPOM2.clickAddButton();
		UniformMediumPOM2.enterProductName("shirt");
		UniformMediumPOM2.enterMetaTagName("shirtForGirls");
		UniformMediumPOM2.clickData();
		UniformMediumPOM2.enterModel("SHG-010");
		UniformMediumPOM2.enterPrice("750");
		UniformMediumPOM2.enterQuantity("50");
		UniformMediumPOM2.clickLinks();
		UniformMediumPOM2.clickCategory();
		UniformMediumPOM2.enterCategory("Sports Uniform");
		UniformMediumPOM2.clickSave();
		
	}
}