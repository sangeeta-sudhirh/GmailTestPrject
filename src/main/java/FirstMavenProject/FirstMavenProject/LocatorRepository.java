package FirstMavenProject.FirstMavenProject;

import org.openqa.selenium.By;

public class LocatorRepository 
{
	// Login page
	public static final By emailid=By.xpath("//input[@type='email']");
	public static final By nextbtn1=By.id("identifierNext");
	public static final By password=By.xpath("//input[@type='password']");
	public static final By nextbtn2=By.id("passwordNext");
	public static final By errr1=By.xpath("//div[@jsname='B34EJ']");
	public static final By header2=By.xpath("//h1[text()='Welcome']");
	public static final By header1=By.id("headingSubtext");
	
	// home page
	public static final By componselink=By.xpath("//div[text()='COMPOSE']");
	public static final By sentemaillink=By.xpath("//a[@href='https://mail.google.com/mail/#sent']");
	public static final By draftllink=By.xpath("//div[text()='Drafts']");
	
	public static final By sendlink=By.xpath("//div[text()='Send']");
	//public static final By tofield=By.xpath("//form[@enctype='multipart/form-data']/div[1]");
	public static final By tofield1=By.name("to");
	public static final By subfield=By.name("subjectbox");
	public static final By msgbodyfield=By.xpath("//div[@aria-label='Message Body']");
	
	
	public static final By sentemailtable=By.xpath("//div[@role='main']/div[3]/div[1]/div[1]/table[1]");
	
	public static final By emailtitle = By.xpath("//table[@role='presentation']/tr[1]/td[1]/div[2]/div[1]/div[2]/div[1]/h2[1]");
}
