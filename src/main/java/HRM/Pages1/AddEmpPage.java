package HRM.Pages1;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HRM.Base3.TestBase;

public class AddEmpPage extends TestBase
{
 
	public static Properties prop;
	
	@FindBy(linkText="Admin")
	WebElement adminlnk;
	
	@FindBy(linkText="PIM")
	WebElement pimlnk;
	
	@FindBy(linkText="Employee List")
	WebElement EmpLlnk;
	
	@FindBy(linkText="Add Employee")
	WebElement Addmplnk;
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement fname1;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lname1;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement btnsave;
	
	@FindBy(xpath="//input[@id='personal_txtEmployeeId']")
	WebElement idsearch;
	
	@FindBy(xpath="//input[@id='empsearch_id']")
	WebElement empidsearch;
	
	@FindBy(xpath="//input[@id='searchBtn']")
	WebElement searchbtn;
	
	@FindBy(xpath="//a[@id='welcome']")
	WebElement logoutbtn;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logoutbtn1;
	
	@FindBy(xpath="//table[@id='resultTable']")
	WebElement table;
	
	public boolean addEmployee(String fname, String lname)
	{
		
		PageFactory.initElements(driver, this);
		
		prop = new Properties();
		
		pimlnk.click();
		Addmplnk.click();
		fname1.sendKeys((fname));
		lname1.sendKeys((lname));
		String empid = driver.findElement(By.xpath("//input[@id='employeeId']")).getAttribute("value");
		btnsave.click();
		
		EmpLlnk.click();
		empidsearch.sendKeys(empid);
		searchbtn.click();
		
		
		List<WebElement> rows,cols;
		
		rows = table.findElements(By.tagName("tr"));
		
		
			cols = rows.get(1).findElements(By.tagName("td"));
			
			
			if (cols.equals(empid))
			{
			      return true;	
			} else 
			{
				 return false;
			}
				
			
			
	}
	
	
}
	
	
	

