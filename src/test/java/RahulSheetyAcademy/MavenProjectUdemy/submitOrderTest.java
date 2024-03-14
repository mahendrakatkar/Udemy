package RahulSheetyAcademy.MavenProjectUdemy;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import RahulSheetyAcademy.MavenProjectUdemy.TestComponents.BaseTest;
import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.OrderPage;
import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.cardPage;
import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.checkOutpage;
import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.confirmationPage;
import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.productCalalog;

public class submitOrderTest extends BaseTest {
	// WebElement product = null;
//	String productName = "ZARA COAT 3";
	String productName = "ZARA COAT 3, ADIDAS ORIGINAL";

	@Test(dataProvider = "getData", groups = { "Purchase" })
	public void submitOrder(String email, String password, String productName)
			throws IOException, InterruptedException {

		// LandingPage landingPage= launchApplication();

		productCalalog ProductCalalog = landingPage.loginApplication(email, password);

		// productCalalog ProductCalalog = new productCalalog(driver);
		List<WebElement> products = ProductCalalog.geProductList();
		ProductCalalog.addProductTOCard(productName);
		cardPage cardpage = ProductCalalog.gotToCardPage();
		// cardPage cardpage= new cardPage(driver);
		boolean match = cardpage.verifyproductDispaly(productName);
		Assert.assertTrue(match);

		checkOutpage checkoutpage = cardpage.goToCheckoutPage();
		checkoutpage.selectCountry("india");
		confirmationPage confimpage = checkoutpage.submitOrder();

		String ConfrimMessage = confimpage.getConfirmationMessage();
		Assert.assertTrue(ConfrimMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	}

	@Test(dependsOnMethods = { "submitOrder" })
	public void orderHIstory() {
		productCalalog ProductCalalog = landingPage.loginApplication("mahendra@gmail.com", "Mahendra@123");
		OrderPage orderPage = ProductCalalog.gotToOrderPage();
		Assert.assertTrue(orderPage.verifyOrderDisplay(productName));
	}

	public void getScreenshot(String testcaseName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File filedestination = new File(System.getProperty("user.dir") + "//reports//" + testcaseName + ".png");
		FileUtils.copyFile(Source, filedestination);
		return;
	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { "mahendra@gmail.com", "Mahendra@123", "ZARA COAT 3" },
				{ "mahendra@gmail.com", "Mahendra@123", "ADIDAS ORIGINAL" } };

	}
}
