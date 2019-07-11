package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniformMediumPOM3 {
	
private WebDriver driver; 
	
	public UniformMediumPOM3(WebDriver driver) {
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
 	
 	//@FindBy(xpath="//a[href='http://uniformm1.upskills.in/admin/index.php?route=catalog/category/edit&token=djjsMPhOFzi9Qw5vlD9fxhYt5S1prGL7&category_id=367']")
    
 	@FindBy(xpath="//i[@class='fa fa-pencil']")
 	private WebElement clickEdit;
 	
 	public void clickEdit()
 	{
 		this.clickEdit.click();
 	}
 	
 	@FindBy(xpath="//a[@href='#tab-data\']")
 	private WebElement clickDataTab;
 	
 	public void clickDataTab()
 	{
 		this.clickDataTab.click();
 	}
 	
 	@FindBy(xpath="//select[@id='input-status']")
 	private WebElement setStatus;
 	
 	public void setStatus(String pstatus)
 	{
 		this.setStatus.sendKeys(pstatus);
 	}
 	
 	@FindBy(xpath="//button[@type='submit']")
 	private WebElement clickSave;
 	
 	public void clickSave()
 	{
 		this.clickSave.click();
 	}
 	}
 	
 


