package expediaFightSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaHomePage {
WebDriver driver;	
	
	
     // the flights tab
	@FindBy(xpath="(//a[@class='uitk-tab-anchor'])[2]")
	WebElement fightTab;
	
	public ExpediaHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
public void clickFightTab() {
	fightTab.click();
}
	
	

}
