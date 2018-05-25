package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.WebDriver;

public class ComposePage extends HomePage
{

	public ComposePage(WebDriver driver) 
	{
		super(driver);		
	}

	public void composemaildata(String to, String sub, String body)
	{
		int count=0;
		while(count<3)
		{
			try
			{
				Thread.sleep(5000);
				res.typedata(LocatorRepository.tofield1, to);
				Thread.sleep(5000);
				res.typedata(LocatorRepository.subfield, sub);
				Thread.sleep(5000);
				res.typedata(LocatorRepository.msgbodyfield, body);
				Thread.sleep(5000);
				res.click(LocatorRepository.sendlink);
				count=count+3;
				Thread.sleep(5000);
			}
			catch (Exception e) 
			{
				System.out.println("exception occured in compose email data" );
				count=count+1; continue;
			}
		}
	}
}
