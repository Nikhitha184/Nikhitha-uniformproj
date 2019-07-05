package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniformloginPOM {
	
private WebDriver driver; 
	
	public UniformloginPOM(WebDriver driver) {
		this.driver = driver; 
		//Action act=new Action();
		
		PageFactory.initElements(driver, this);
		//
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName; 
	
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit; 
		/*public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);*/
		
		public void setName(String sname) {
			this.userName.sendKeys(sname);
	
			}
	
		public void setpassword(String pwd) {
			this.password.sendKeys(pwd);
	
			}
     
		public void clickbutton() {
			this.submit.click();
			
		}
     @FindBy(xpath="//i[@class='fa fa-indent fa-lg']")
     private WebElement Menu;

     public void clickMenu()
   {
	   this.Menu.click();
    }
     
     @FindBy(xpath="//span[text()='Catalog']")
 	private WebElement Catalog;
 	
 	public void clickCatalog()
 	{
 		this.Catalog.click();
 	}
 	
 	@FindBy(xpath="//a[text()='Categories']")
 	private WebElement Categories;
 	
 	public void clickCategories()
 	{
 		this.Categories.click();
 	}

 	
 	@FindBy(xpath="(//input[@type='checkbox'])[3]")
 	private WebElement Checkbox;
 	
 	public void clickCheckbox()
 	{
 		this.Checkbox.click();
 	}

 	@FindBy(xpath="//i[@class='fa fa-trash-o']")
 	private WebElement Deletebutton;
 	 
 	public void clickDeletebutton()
 	{
 		this.Deletebutton.click();
 		driver.switchTo().alert().accept();
 	}
}

 	
   
