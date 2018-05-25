package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.WebDriver;

public class LoginPage
{
	WebDriver driver;
	Reusable res;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		res = new Reusable(driver);
	}
	
	private void setEmail(String email)
	{
		res.typedata(LocatorRepository.emailid, email);
	}
	
	private void clickNext1()
	{
		res.click(LocatorRepository.nextbtn1);
	}
	
	private void setpassword(String password)
	{
		res.typedata(LocatorRepository.password, password);
	}
	
	private void clickNext2()
	{
		res.click(LocatorRepository.nextbtn2);
	}
	
	public String invalidLogin(String email, String password)
	{
		setEmail(email);
		clickNext1();
		res.waitForElement(LocatorRepository.nextbtn2);
		setpassword(password);
		clickNext2();
		res.waitForElement(LocatorRepository.errr1);
		return res.getelmentText(LocatorRepository.errr1);		
	}
	
	public String validLogin(String email, String password,String title)
	{
		setEmail(email);
		clickNext1();
		res.waitForElement(LocatorRepository.nextbtn2);		
		setpassword(password);
		clickNext2();
		res.waitForTitle(title);
		return res.gettitle();	
	}
	
}
