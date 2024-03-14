package RahulSheetyAcademy.MavenProjectUdemy.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.LandingPage;

public class BaseTest {
public WebDriver driver;
public LandingPage landingPage;
	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
				"\\src\\main\\java\\RahulSheetyAcademy\\MavenProjectUdemy\\Resources\\globalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			 driver = new ChromeDriver();

		}
		else if(browserName.equalsIgnoreCase("edge")) {

		 driver = new EdgeDriver();

		}
		else if(browserName.equalsIgnoreCase("firefox")) {

			 driver = new FirefoxDriver();
					}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}

	/*
	 * public static String captureScreenshot (WebDriver driver, String testName) {
	 * File srcScreenshot = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); String destinationScreenshotPath =
	 * System.getProperty("user.dir") + "\\Screenshots\\" +testName + ".png";
	 */
	@BeforeMethod
	public LandingPage launchApplication() throws IOException {
		driver=initializeDriver();
		 landingPage= new LandingPage(driver);
		landingPage.goTo();
		return landingPage;
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}