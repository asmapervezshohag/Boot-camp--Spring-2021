package expediaFightSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaFlightSearchPage {
	WebDriver driver;
	// Enter partial text on leaving from city or airport field
	@FindBy(xpath="//button[@aria-label='Leaving from']")
	WebElement leavingrFromField;
	
	
	//Pick leaving from City or airport from the auto-suggestion dropdown 
	@FindBy(xpath="//strong[contains(text(),'Dhaka (DAC - Shahjalal Intl.)')]")
	WebElement leavingrFromTheCity;
	
	//Enter partial text on going to city or airport
	@FindBy(xpath="//button[@aria-label='Going to']")
	WebElement goingToField; 
	
	
	//Pick going to City or airport from the auto-suggestion dropdown 
	@FindBy(xpath="//strong[contains(text(),'New York (JFK - John F. Kennedy Intl.)')]")
	WebElement goingToCity;
	
	// Click on the departing date field
	@FindBy(xpath="//button[@id='d1-btn']")
	WebElement dateField;
	
	// Pick departing date
		@FindBy(xpath="//button[@aria-label='Jun 18, 2021']")
		WebElement departingDate;
	
	
	// Pick returning date
	  @FindBy(xpath="//button[@aria-label='Jul 3, 2021']")
		WebElement returningDate;
	
		// Click on done button in the date section
	@FindBy(xpath="//span[contains(text(),'Done')]")
	WebElement doneButtonOnTheDateTable;
	
	
	
	// click to open the field for passengers class selection dropdown
	@FindBy(xpath="//a[@aria-label='Preferred flight class Economy']")
	WebElement classSelectionTab;
	
	
	//Select travel class
	
	@FindBy(xpath="//span[text()='First class']")
	WebElement passengersClass;
	
	
	//Click on the search button
	@FindBy(xpath="//button[text()='Search']")
	WebElement searchButton;
	
	public ExpediaFlightSearchPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterleavingrFromField(String partialtext) {
		leavingrFromField.sendKeys(partialtext);
		
	}
public void clickleavingrFromTheCity () {
	leavingrFromTheCity.click();
		
	}
public void entergoingToField(String text) {
	goingToField.sendKeys(text);
}
public void clickgoingToCity() {
	goingToCity.click();
}
public void clickdateField () {
	dateField.click();
	
}
public void clickdepartingDate() {
	departingDate.click();
}
public void clickreturningDate() {
	 returningDate.click();
}
public void clickdoneButtonOnTheDateTable() {
	doneButtonOnTheDateTable.click();
}
public void clickclassSelectionTab() {
	classSelectionTab.click();
	
}public void selectpassengersClass() {
	passengersClass.click();
}
public void clicksearchButton () {
	searchButton.click();
}
}
