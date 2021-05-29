package homeDepotAccountCreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountWithPersonalInformation {
WebDriver driver;
// Enter email address on the email field.
@FindBy(id="email")
WebElement emailField;

//Enter password on the password field.
@FindBy(name="password")
WebElement passwordField;

//Enter zip code on the zip code field.
@FindBy(id="zipCode")
WebElement zipCodeField;

//Enter phone number on the phone field.
@FindBy(id="phone")
WebElement phoneNumberField;

// check keep me signed in check box.
@FindBy(xpath="(//label[@class='checkbox-btn__label-test u__text-align--left'])[1]")
WebElement keepMeSignedCheckBox;

//Check 'Verify my mobile number via text message or phone call' check box.
@FindBy(xpath="(//label[@class='checkbox-btn__label-test u__text-align--left'])[2]")
WebElement verifyMyMobileNumber;
//Check 'I am not a robot' check box.
//@FindBy(xpath="//span[@aria-labelledby='recaptcha-anchor-label']")
//WebElement notRobotCheckBox;

//Click 'Create an Account' button.
@FindBy(xpath="//span[text()='Create an Account']")
WebElement createAnAccount;
public CreateAnAccountWithPersonalInformation(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void enterEmailAddress (String email) {
	emailField.sendKeys(email);
}
public void enterPassword(String password) {
	passwordField.sendKeys(password);	
}
public void enterZipCode(String zipcode) {
	zipCodeField.sendKeys(zipcode);
	}
public void enterPhoneNumber (String phoneNumber) {
	phoneNumberField.sendKeys(phoneNumber);
}
public void checkKeepMeSignedCheckBox () {
	keepMeSignedCheckBox.click();
}
public void checkVerifyMyMobileNumberCheckBox () {
	verifyMyMobileNumber.click();
}
//public void checkIAmNotARobotCheckbox() {
//	notRobotCheckBox.click();	
//}
public void clickCreateAnAccountButton() {
	createAnAccount.click();
}
}
