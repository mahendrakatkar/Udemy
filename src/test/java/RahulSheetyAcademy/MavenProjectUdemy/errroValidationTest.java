package RahulSheetyAcademy.MavenProjectUdemy;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import RahulSheetyAcademy.MavenProjectUdemy.TestComponents.BaseTest;
import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.cardPage;
import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.productCalalog;

public class errroValidationTest extends BaseTest{

	@Test(groups = {"'ErrorHandling"})
	public void loginErrorValidation() throws IOException, InterruptedException {
		String productName="ZARA COAT 3";

		//LandingPage landingPage= launchApplication();

	landingPage.loginApplication("mahendra@gmail.com", "Mahendra@f6d123");
	Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());

}
	@Test
	public void productErrorValidation() throws IOException, InterruptedException {
		String productName="ZARA COAT 3";

		productCalalog ProductCalalog= landingPage.loginApplication("testsamp1@gmail.com", "Mahendra@123");

		List<WebElement> products=ProductCalalog.geProductList();
		ProductCalalog.addProductTOCard(productName);
		cardPage cardpage= ProductCalalog.gotToCardPage();

		boolean match = cardpage.verifyproductDispaly("dd");
		Assert.assertFalse(match);


	}
	}

