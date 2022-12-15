package HRM.Testcases;

import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HRM.Base3.TestBase;
import HRM.Pages1.HomePage;
import HRM.Pages1.LoginPage;

public class HomePageTest extends TestBase
{
Properties prop;
LoginPage lp;
HomePage hp;
	@BeforeTest
	public void launchApp() throws Throwable
	{
		lp = new LoginPage();
		invokeBrowser();
		
	}
	
	@BeforeMethod
	public void login()
	{
		
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void adminModuleVerifyTest()
	{
		hp = new HomePage();
		lp.Login(prop.getProperty("username"),prop.getProperty("password"));
		lp.verifyLogin();
	    hp.isAdminModuleDisplayed();
	}
	
	@Test
	public void pimlinkVerifyTest()
	{
		lp.Login(prop.getProperty("username"),prop.getProperty("password"));
		lp.verifyLogin();
	    hp.isPIMLinkDisplayed();
	}
	
	@AfterMethod
	public void verifyLogoutTest()
	{
//		lp.Login(prop.getProperty("username"),prop.getProperty("password"));
//		lp.verifyLogin();
		hp.logoutTest();
	}
	
	@AfterTest
	public void closeApp()
	{
		tearDown();
	}
	
	
	
}
