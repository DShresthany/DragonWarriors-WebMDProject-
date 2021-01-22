package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBoxElements {
	
	@FindBy (xpath= "//input[@id='global-nav-search']")
	public WebElement SearchLink;

	@FindBy (xpath= "//*[@id=\"global-nav-search\"]")
	public WebElement searchBox;
	
	@FindBy (xpath= "//*[@id=\"global-nav-search-form\"]/button")
	public WebElement searchBtn;
	

}
