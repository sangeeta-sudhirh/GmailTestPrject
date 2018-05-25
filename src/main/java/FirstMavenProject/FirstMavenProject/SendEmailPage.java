package FirstMavenProject.FirstMavenProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendEmailPage extends HomePage
{

	public SendEmailPage(WebDriver driver) {
		super(driver);
	}

	public void findsentEmail(String title)
	{
		WebElement tble=null;
		int count=0;
		while(count<3)
		{
			try
			{
				res.waitForElement(LocatorRepository.sentemailtable);
				tble= driver.findElement(LocatorRepository.sentemailtable);
				count=count+3;
			}
			catch (Exception e) 
			{
				System.out.println("exception occured in sent email table " );
				count=count+1; continue;
			}
		}		
		List<WebElement> row =tble.findElements(By.tagName("tr"));
		for(int i=0; i<row.size();i++)
		{
			List<WebElement> col=row.get(i).findElements(By.tagName("td"));
			for(int j=0; j<col.size();j++)
			{
				String text=col.get(j).getText();
				if(text.contains(title))
				{
					col.get(j).click(); break;
				}
			}
		}
	}

	public String getEmailTitle()
	{
		res.waitForElement(LocatorRepository.emailtitle);
		return res.getelmentText(LocatorRepository.emailtitle);
	}
}
