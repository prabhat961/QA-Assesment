package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage {

	public homePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//img[@src='/img/logo.png']")
	WebElement homePageLogo;
	
	@FindBy(xpath = "//img[@alt='Swagger logo']")
	WebElement swaggerLogo;
	
		
	public void getTitleTest() {
		driver.getTitle();
	}
	
	
	public boolean homePgeLogoTest() {
		return homePageLogo.isDisplayed();
	}
	
	
	public boolean swaggerLogoPresent() {
		return swaggerLogo.isDisplayed();
	}
	
	
}
