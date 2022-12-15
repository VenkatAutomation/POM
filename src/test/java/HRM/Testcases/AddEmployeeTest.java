package HRM.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HRM.Base3.TestBase;
import HRM.Pages1.AddEmpPage;
import HRM.Pages1.HomePage;
import HRM.Pages1.LoginPage;

public class AddEmployeeTest extends TestBase
{

	HomePage hp;
	AddEmpPage aep;
	LoginPage lp;
	
	@BeforeTest
	public void launchApp() throws Throwable
	{
		
		invokeBrowser();	
	}
	
	@BeforeMethod
	public void login()
	{
		lp = new LoginPage();
		lp.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void verifyAddEmp()
	{
		aep = new AddEmpPage();
		aep.addEmployee(prop.getProperty("fname"), prop.getProperty("lname"));
	}
	
	@AfterMethod
	public void logout()
	{
		hp = new HomePage();
		hp.logoutTest();
	}
	
	@AfterTest
	public void closeApp()
	{
		tearDown();
	}
	
	
}
