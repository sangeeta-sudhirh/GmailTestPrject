package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable 
{
	WebDriver driver;
	WebDriverWait wait;
	Actions act;
	
	
	public Reusable(WebDriver driver)
	{
		this.driver=driver;
		act = new Actions(driver);
	}
	
	public void typedata(By locator, String text)
	{
		waitForElement(locator);
		driver.findElement(locator).sendKeys(text);
	}
	
	public void click(By locator)
	{
		waitForElement(locator);
		driver.findElement(locator).click();
	}
	
	public String getelmentText(By locator)
	{
		return driver.findElement(locator).getText();
	}
	
	public void waitForElement(By locator)
	{
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void waitForWebElement(WebElement element)
	{
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForTitle(String title)
	{
		wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public String gettitle()
	{
		return driver.getTitle();
	}
	
	public void typedataAction(By locator, String text)
	{
		act.sendKeys(driver.findElement(locator), text).perform();
	}
	
}
