package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class uniformMediumPOM {
	
private WebDriver driver; 
	
	public uniformMediumPOM(WebDriver driver) {
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
    
     @FindBy(xpath="//a[text()='Products']")
     private WebElement Products;
     
     public void clickProducts()
     {
    	 this.Products.click();
     }


     @FindBy(xpath="//input[@type='text']")
     private WebElement inputtext;
    
      public void setProductName(String pname) {
    	  this.inputtext.sendKeys(pname);
      }
      
      @FindBy(xpath="//i[@class='fa fa-search']")
      private WebElement button;
      
      public void clickButton()
      {
    	  this.button.click();
      }
      
      @FindBy(xpath="//input[@id='input-price']")
      private WebElement inputPrice;  
 
      public void setProductPrice(String pprice) {
    	  this.inputPrice.sendKeys(pprice);
      }
      
      @FindBy(xpath="//select[@id='input-status']")
      private WebElement inputStatus;
      
      public void setStatus(String status)
      {
    	  this.inputStatus.sendKeys(status);
      }
      
      @FindBy(xpath="//input[@id='input-model']")
      private WebElement inputModel;
      
      public void setModel(String model)
      {
    	  this.inputModel.sendKeys(model);
      }
      
      @FindBy(xpath="//input[@id='input-quantity']")
       private WebElement inputQuantity;
      
      public void setQuantity(String quantity)
      {
    	  this.inputQuantity.sendKeys("100");
    	  
      }
}
  