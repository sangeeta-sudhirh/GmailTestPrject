
package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest 
{
	public WebDriver driver;
	public WebDriver selectBrowser(String browsername, String url)
	{
		browsername=browsername.toLowerCase();
		switch(browsername)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
			driver= new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "drivers//IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			break;
		default : System.out.println("invalid browser");  System.exit(0);break;
		}
		driver.get(url);		
		return driver;
	}
}
