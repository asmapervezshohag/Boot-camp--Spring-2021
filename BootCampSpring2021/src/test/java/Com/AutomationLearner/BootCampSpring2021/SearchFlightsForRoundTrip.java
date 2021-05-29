package Com.AutomationLearner.BootCampSpring2021;

import org.testng.annotations.Test;

import expediaFightSearch.ExpediaFlightSearchPage;
import expediaFightSearch.ExpediaHomePage;
import expediaFightSearch.FlightSelectionPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class SearchFlightsForRoundTrip {
	public WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		
		ExpediaHomePage hp = new ExpediaHomePage(driver);
		ExpediaFlightSearchPage fsp = new ExpediaFlightSearchPage(driver);
		FlightSelectionPage flightselpa=new FlightSelectionPage(driver);
		hp.clickFightTab();
		Thread.sleep(3000);
		fsp.enterleavingrFromField("DAC");
		Thread.sleep(3000);
		fsp.clickleavingrFromTheCity();
		Thread.sleep(3000);
		fsp.entergoingToField("NYC");
		Thread.sleep(3000);
		fsp.clickgoingToCity();
		Thread.sleep(3000);
		fsp.clickdateField();
		Thread.sleep(3000);
		fsp.clickdepartingDate();
		Thread.sleep(3000);
		fsp.clickreturningDate();
		Thread.sleep(3000);
		fsp.clickdoneButtonOnTheDateTable();
		Thread.sleep(3000);
		fsp.clickclassSelectionTab();
		Thread.sleep(3000);
		fsp.selectpassengersClass();
		Thread.sleep(3000);
		fsp.clicksearchButton();
		Thread.sleep(10000);
		flightselpa.clickSelectingFlightbox();
		Thread.sleep(2000);
		flightselpa.selectButtonClick();

	}

	@BeforeClass
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
		//driver.close();
		// driver.quit();
	}

}
