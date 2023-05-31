package HRM.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HRM.Base3.TestBase;
import HRM.Pages1.LoginPage;

public class LoginPageTest extends TestBase
{

	LoginPage lp;

	@BeforeMethod
	public void launchApp() throws Throwable
	{
		lp = new LoginPage();

		invokeBrowser();

	}

	@Test
	public void pageTitleVerification()
	{
		//lp = new LoginPage();
		lp.validatePageTitle();
	}

	@Test
	public void loginTest()
	{
		//lp = new LoginPage();
		lp.Login(prop.getProperty("username"),prop.getProperty("password"));
		lp.verifyLogin();
	}

	@Test
	public void loginPageVerificationTest()
	{
		//lp = new LoginPage();
		lp.verifyLoginPage();
	}



	@AfterMethod
	public void closeApp()
	{
		tearDown();
	}
}
