package HRM.Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HRM.Base3.TestBase;

public class LoginPage extends TestBase 
{
	//Page Factory Rep
	
	@FindBy(xpath="//input[contains(@id,'txtUsername')]")
	WebElement userid;
	
	@FindBy(xpath="//input[contains(@id,'txtPassword')]")
	WebElement pass;
	
    @FindBy(xpath="//input[contains(@id,'btnLogin')]")
    WebElement loginbtn;
    
    @FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
    WebElement fgtbtn;
    
    @FindBy(xpath="//div[contains(text(),'LOGIN Panel')]")
    WebElement img;
    
    
    
    public void Login(String uid,String pwd)
    {
    	PageFactory.initElements(driver, this);
    	
    	userid.sendKeys(uid);
    	pass.sendKeys(pwd);
    	loginbtn.click();
    }
    
    
    public boolean verifyLogin()
    {
    	if (driver.findElement(By.linkText("Admin")).isDisplayed())
    	{
			return true;
		} else 
		{
            return false;
		}
    	
    }
    
    
    public boolean verifyLoginPage()
    {
    	PageFactory.initElements(driver, this);
    	
    	if(img.isDisplayed())
    	{
    		return true;
    	}else
    	{
    		return false;
    	}
    }
    
    
    public boolean validatePageTitle()
    {
    	
    	String pgtite =driver.getTitle();
    	
    	String acttitle = "OrangeHRM";
    	
    	if (pgtite.equals(acttitle)) 
    	{
		 return true;	
		} else 
		{
         return false;
		}
    	
    }
    
  }
