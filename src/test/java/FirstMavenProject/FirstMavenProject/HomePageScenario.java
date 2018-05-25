package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageScenario 
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
	
	@Test(description="compose email - send")
	public void test1()
	{
		LoginPage loginpage = new LoginPage(driver);
		String title=loginpage.validLogin(Constantss.eamil, Constantss.pwd,Constantss.title);
		Assert.assertTrue(title.contains(Constantss.title));
		HomePage homepage = new HomePage(driver);
		homepage.composeEmail();
		ComposePage compose = new ComposePage(driver);
		compose.composemaildata(Constantss.to, Constantss.sub, Constantss.body);
		homepage.sentEmail();
		SendEmailPage sendemail= new SendEmailPage(driver);
		sendemail.findsentEmail(Constantss.sub);
		String t= sendemail.getEmailTitle();
		Assert.assertTrue(t.contains(Constantss.sub), "fail to find email");
	}
}
