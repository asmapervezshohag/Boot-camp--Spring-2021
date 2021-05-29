package Com.AutomationLearner.BootCampSpring2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class commonMethodsForAllTestCases {
	  public WebDriver driver;
			//public JavascriptExecutor js;
			@Parameters({"browser","website"})
			
		  @BeforeClass
		  public void browsers(String browser,String sites) {
			  String path=System.getProperty("user.dir");
		  		if (browser.equalsIgnoreCase("Chrome")) {
		  			System.setProperty("webdriver.chrome.driver",
		  					path +"\\Drivers\\chromedriver.exe");
		  			driver = new ChromeDriver();
		  			driver.get(sites);
		  			
		  			//driver.manage().window().maximize();
		  			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  		} else if (browser.equalsIgnoreCase("FireFox")) {
		  			System.setProperty("webdriver.gecko.driver",
		  					path+"\\Drivers\\geckodriver.exe");
		  			driver = new FirefoxDriver();
		  			driver.get(sites);
		  			//driver.manage().window().maximize();
		  			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  		} else if (browser.equalsIgnoreCase("Edge")) {
		  			System.setProperty("webdriver.edge.driver",
		  					path +"\\Drivers\\msedgedriver.exe");
		  			driver = new EdgeDriver();

		  			driver.get(sites);
		  			
		  			//driver.manage().window().maximize();
		  			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  		}
		  }
		  		@AfterClass
		  		public void endclass() {
		  			// driver.close();
		  		}

		  	
		  
  }

