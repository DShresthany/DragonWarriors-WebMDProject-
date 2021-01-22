package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QAElements {
	
	@FindBy(xpath = "//div[@class='global-nav-center-container']/ul[2]/li[1]")
	public WebElement Health;
	
	@FindBy(xpath = "//a[@href='https://www.webmd.com/a-to-z-guides/qa']")
	public WebElement QAlink;
	
	@FindBy(xpath = "//a[@href='/mental-health/eating-disorders/qa/default.htm']")
	public WebElement Topic;
	
	@FindBy(xpath = "//a[contains(text(),'What are the different types of eating disorders?')]")
	public WebElement Question;
	
	@FindBy(xpath = "//p[contains(text(),'ANSWER')]")
	public WebElement Answer;
	
	
	
}
