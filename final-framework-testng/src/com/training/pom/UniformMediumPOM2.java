package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniformMediumPOM2 {
	
private WebDriver driver; 
	
	public UniformMediumPOM2 (WebDriver driver) {
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
     
     @FindBy(xpath="//i[@class='fa fa-plus']")
      private WebElement addButton;
     
     public void clickAddButton()
     {
    	 this.addButton.click();
     }
     
     @FindBy(xpath="//input[@id='input-name1']")
     private WebElement productName;
     
     public void enterProductName(String productName)
     {
    	 this.productName.sendKeys(productName);
     }
     
     
     @FindBy(xpath="//input[@id='input-meta-title1']")
     private WebElement metaTagName;
     
     public void enterMetaTagName(String metaTagName)
     {
    	 this.metaTagName.sendKeys(metaTagName);
     }
     
     @FindBy(xpath="//a[@href='#tab-data']")
     private WebElement dataTab;
     
     public void clickData()
     {
    	 this.dataTab.click();
     }
     
     @FindBy(xpath="//input[@id='input-model']")
     private WebElement enterModel;
     
     public void enterModel(String modelName)
     {
    	 this.enterModel.sendKeys(modelName);
     }
     
     @FindBy(xpath="//input[@id='input-price']")
     private WebElement enterPrice;
     
     public void enterPrice(String pprice)
     {
    	 this.enterPrice.sendKeys(pprice);
     }
     
     @FindBy(xpath="//input[@id='input-quantity']")   
     private WebElement enterQuantity;
     
     public void enterQuantity(String pquantity)
     {
    	 this.enterQuantity.sendKeys(pquantity);
     }
     
     @FindBy(xpath="//a[@href='#tab-links']")
     private WebElement clickLinks;
     
     public void clickLinks() 
     {
    	 this.clickLinks.click();
     }
     
     @FindBy(xpath="//input[@id='input-category']")
     private WebElement clickCategory;
     
     public void clickCategory()
     {
    	 this.clickCategory.click();
    	 this.clickCategory.sendKeys();
     }
    
     @FindBy(xpath="//input[@id='input-category']")
     private WebElement enterCategory;
     
     public void enterCategory(String ecategory)
     {
    	 this.enterCategory.sendKeys(ecategory);
     }
     
     @FindBy(xpath="//i[@class='fa fa-save']")
     private WebElement clickSave;
     
     public void clickSave()
     {
    	 this.clickSave.click();
     }
     }
     
     

     
     		
    

     