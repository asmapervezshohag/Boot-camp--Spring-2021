package Com.AutomationLearner.BootCampSpring2021;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class IlistenerForBootCamp extends commonMethodsForAllTestCases implements ITestListener {
	public org.apache.log4j.Logger lg = org.apache.log4j.Logger.getLogger(IlistenerForBootCamp.class.getName());
	
	@Override
	public void onTestStart(ITestResult result) {
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\target\\logger4j.properties");
		lg.info("Starting the test");
	 
	}
	

	@Override
	public void onTestSuccess(ITestResult result) {
		String path = System.getProperty("user.dir");

		Date dt = new Date();
		// System.out.println(dt);
		String si = dt.toString().replace(" ", "_").replace(":", "_");
		// System.out.println(si);
		this.driver = ((commonMethodsForAllTestCases) result.getInstance()).driver;
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(screenshot, new File(path + "\\screenshots\\passed\\" + si + "photo.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String path = System.getProperty("user.dir");
		Date dt = new Date();
		// System.out.println(dt);
		String si = dt.toString().replace(" ", "_").replace(":", "_");
		// System.out.println(si);
		this.driver = ((commonMethodsForAllTestCases) result.getInstance()).driver;
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(screenshot, new File(path + "\\screenshots\\failed\\" + si + "photo.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
