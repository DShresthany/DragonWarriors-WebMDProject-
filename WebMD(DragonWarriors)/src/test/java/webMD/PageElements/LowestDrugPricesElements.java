package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LowestDrugPricesElements {
	@FindBy(xpath = "//a[@href='//www.webmd.com/rx']")
	public WebElement FindLowestDrugPriceLink;
	
	@FindBy(xpath = "//a[@href='https://www.webmd.com/rx/browse-drugs']")
	public WebElement ViewAllDrugsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Lipitor')]")
	public WebElement LipitorLink;
	
	@FindBy(xpath = "//div[contains(text(), ' Price and coupons')]")
	public WebElement drugsresult;
	
	
}
