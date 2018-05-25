package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.WebDriver;

public class HomePage 
{
	WebDriver driver;
	Reusable res;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		res = new Reusable(driver);
	}

	public void composeEmail()
	{
		int count=0;
		while(count<3)
		{
			try
			{
				res.click(LocatorRepository.componselink);
				res.waitForElement(LocatorRepository.sendlink);
				count=count+3;
			}
			catch (Exception e) 
			{
				System.out.println("exception occured in compose email " );
				count=count+1; continue;
			}
		}


	}

	public void sentEmail()
	{
		int count=0;
		while(count<3)
		{
			try
			{
				res.click(LocatorRepository.sentemaillink);
				res.waitForTitle("Sent");
				count=count+3;
			}
			catch (Exception e) 
			{
				System.out.println("exception occured in sent email " );
				count=count+1; continue;
			}
		}
	}

	public void draftEmail()
	{
		res.click(LocatorRepository.draftllink);
	}
}
