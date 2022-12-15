package HRM.Pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HRM.Base3.TestBase;

public class HomePage extends TestBase
{

	@FindBy(linkText="Admin")
	WebElement adminlnk;
	
	@FindBy(linkText="PIM")
	WebElement pimlnk;
	
	@FindBy(xpath="//a[@id='welcome']")
	WebElement logoutbtn;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logoutbtn1;
	
	
	public void logoutTest()
	{
		PageFactory.initElements(driver, this);
		logoutbtn.click();
		logoutbtn1.click();
	}



public boolean isAdminModuleDisplayed()
{
	PageFactory.initElements(driver, this);
	
	if(adminlnk.isDisplayed())
	{
		return true;
	}else
	{
		return false;
	}
	
}


public boolean isPIMLinkDisplayed()
{
	PageFactory.initElements(driver, this);
	
	if (pimlnk.isDisplayed()) 
	{
	return true;	
	} else 
	{
    return false;
	}
	
	}

}