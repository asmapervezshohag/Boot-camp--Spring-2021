package Com.AutomationLearner.BootCampSpring2021;

import org.testng.annotations.Test;

import expediaFightSearch.TravelersInformationPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class PassengersTicketBookingForm {
	WebDriver driver;
  @Test
  public void PositivSecnarioTest () throws InterruptedException {
	  TravelersInformationPage TIP=new TravelersInformationPage(driver);
	  TIP.enterFirstName("John");
	  TIP.enterMiddleName("Adam");
	  TIP.enterLastName("Silver");
	  TIP.selecCountry();
	  Thread.sleep(2000);
	  TIP.enterPhoneNumber("354563738");
	  TIP.clickSMSConfirmationCheckBox();
	  Thread.sleep(2000);
	  TIP.selectPassengerPassport();
	  TIP.clickPassengersgender();
	  Thread.sleep(2000);
	  TIP.enterdobMonth();
	  Thread.sleep(2000);
	  TIP.enterdobDay();
	  Thread.sleep(1000);
	  TIP.enterdobYear();
	  Thread.sleep(2000);
	  TIP.clickNoProtectionCheckBox();
	  Thread.sleep(1000);
	  TIP.cardholderName("John A. Silver");
	  Thread.sleep(2000);
	  TIP.cardNumber("84372449236");
	  Thread.sleep(1000);
	  TIP.selectCardExpirationMonth();
	  Thread.sleep(2000);
	  TIP.selectCardExpirationYear();
	  Thread.sleep(1000);
	  TIP.entercardSecurityCode("2233");
	  Thread.sleep(2000);
	  TIP.selectcreditCardCountry();
	  Thread.sleep(1000);
	  TIP.enterBillingAddressOne("23 Taylor Street");
	  Thread.sleep(2000);
	  TIP.enterBillingAddressTwo("suite 43");
	  Thread.sleep(1000);
	  TIP.enterBillingCity("Arlington");
	  Thread.sleep(2000);
	  TIP.selectbillingState("Virginia");
	  Thread.sleep(2000);
	 // TIP.enterBillingZipCode("1143"); 
	  //Thread.sleep(2000);
	  TIP.enterEmailConfirmation("john@yahoo.com");
	  Thread.sleep(1000);
	  TIP.enterPassField("Testuser123");
	  Thread.sleep(3000);
	  TIP.enterConfirmPassField("Testuser123");
	  Thread.sleep(2000);
	  TIP.clickCompleteBookingButton();
	  
	  
  }
  @BeforeTest
  public void browsers() {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.expedia.com/Checkout/V1/FlightCheckout?tripid=bf116925-f944-515c-aa3d-4f541f2bc178&c=f4e6b5f3-289b-4aa0-9929-8781eefc7294");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
  }

  @AfterTest
  public void afterTest() {
  }

}
