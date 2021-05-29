package Com.AutomationLearner.BootCampSpring2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import homeDepotAccountCreate.CreateAnAccountPage;
import homeDepotAccountCreate.CreateAnAccountWithPersonalInformation;
import homeDepotAccountCreate.SigninPage;

public class HomeDepotNewUserAccountCreation {
	
	
	 public WebDriver driver;
		//public JavascriptExecutor js;
		@Parameters({"browser","website"})
		
	  @BeforeClass
	  public void browsers(String browser,String website) {
		  String path=System.getProperty("user.dir");
	  		if (browser.equalsIgnoreCase("Chrome")) {
	  			System.setProperty("webdriver.chrome.driver",
	  					path +"\\Drivers\\chromedriver.exe");
	  			driver = new ChromeDriver();
	  			driver.get(website);
	  			
	  			//driver.manage().window().maximize();
	  			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  		} else if (browser.equalsIgnoreCase("FireFox")) {
	  			System.setProperty("webdriver.gecko.driver",
	  					path+"\\Drivers\\geckodriver.exe");
	  			driver = new FirefoxDriver();
	  			driver.get(website);
	  			//driver.manage().window().maximize();
	  			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  		} else if (browser.equalsIgnoreCase("Edge")) {
	  			System.setProperty("webdriver.edge.driver",
	  					path +"\\Drivers\\msedgedriver.exe");
	  			driver = new EdgeDriver();

	  			driver.get(website);
	  			
	  			//driver.manage().window().maximize();
	  			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  		}
		}
	@Test
	public void homeDepotNewUserRegistration() throws InterruptedException {
		SigninPage landingpage = new SigninPage(driver);
		CreateAnAccountPage CAP = new CreateAnAccountPage(driver);
		CreateAnAccountWithPersonalInformation CAPI = new CreateAnAccountWithPersonalInformation(driver);
		landingpage.clickOnMyAccountButton();
		Thread.sleep(2000);
		landingpage.clickOnRegisterButton();
		Thread.sleep(1000);
		CAP.clickSelectAndContinueButton();
		CAPI.enterEmailAddress("shava@yahoo.com");
		CAPI.enterPassword("test@123");
		CAPI.enterZipCode("222289");
		CAPI.enterPhoneNumber("2333487559");
		CAPI.checkKeepMeSignedCheckBox();
		CAPI.checkVerifyMyMobileNumberCheckBox();
		CAPI.clickCreateAnAccountButton();
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}

