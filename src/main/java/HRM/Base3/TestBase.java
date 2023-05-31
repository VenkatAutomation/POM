package HRM.Base3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;

	public static Properties prop;

	public static void invokeBrowser() throws Throwable 
	{
		prop = new Properties();

		FileInputStream fi = new FileInputStream("C:\\Users\\SPURGE\\eclipse-workspace\\OrangrHRM_POM\\src\\main\\java\\HRM\\Config2\\config.properties");

		prop.load(fi);

		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) 
		{
			System.setProperty("WebDriver.chrome.driver", "chromedriver.exe"); 
			driver =new ChromeDriver(); 
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));

		} else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("WebDriver.chrome.driver", "geckodriver.exe"); 
			driver =new FirefoxDriver(); 
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}

	public static void tearDown() 
	{
		driver.quit();
	}

}
