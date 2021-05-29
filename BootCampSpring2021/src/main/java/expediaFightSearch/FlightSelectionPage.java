package expediaFightSearch;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSelectionPage {
	WebDriver driver;
	@FindBy(xpath="(//*[@data-test-id='offer-listing'][1]")
	WebElement selectingFlight;
	
@FindBy(xpath="//button[@aria-label='Select']")
WebElement selectButton;

public FlightSelectionPage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
public void clickSelectingFlightbox() throws InterruptedException {
	Thread.sleep(3000);
	selectingFlight.click();
	
	
}
public void selectButtonClick() throws InterruptedException {
	Thread.sleep(2000);
	 selectButton.click();
}


}
