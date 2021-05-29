package homeDepotAccountCreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
WebDriver driver;
//Click on the My Account link
@FindBy(xpath="//*[text()='My Account']")
WebElement myAccountButton;
// click on Register button from the dropdown
@FindBy(xpath="//*[text()='Register']")
WebElement registerButton;
 

public SigninPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver,this);
	
}
public void clickOnMyAccountButton()  {
	myAccountButton.click();
	
}
public void clickOnRegisterButton() throws InterruptedException {
	Thread.sleep(2000);
	registerButton.click();
}
}
