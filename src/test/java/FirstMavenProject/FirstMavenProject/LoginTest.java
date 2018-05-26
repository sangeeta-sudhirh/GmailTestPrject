package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		BaseTest basetest = new BaseTest();
		driver=basetest.selectBrowser(Constantss.browsername, Constantss.url);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	@Test(description="invalid login")
	public void test1()
	{
		LoginPage loginpage = new LoginPage(driver);
		String err=loginpage.invalidLogin(Constantss.eamil, Constantss.pwd+1);
		Assert.assertTrue(err.contains("Wrong password"));
	}
	
	@Test(description="duplicate invalid login")
	public void test3()
	{
		LoginPage loginpage = new LoginPage(driver);
		String err=loginpage.invalidLogin(Constantss.eamil, Constantss.pwd+1);
		Assert.assertTrue(err.contains("Wrong password"));
	}
	@Test(description="valid login")
	public void test2()
	{
		LoginPage loginpage = new LoginPage(driver);
		String title=loginpage.validLogin(Constantss.eamil, Constantss.pwd,Constantss.title);
		Assert.assertTrue(title.contains(Constantss.title));
	}
}
