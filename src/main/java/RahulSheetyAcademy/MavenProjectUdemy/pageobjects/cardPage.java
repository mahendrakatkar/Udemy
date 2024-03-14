package RahulSheetyAcademy.MavenProjectUdemy.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RahulSheetyAcademy.AbstractComponents.abstractComponents;

public class cardPage extends abstractComponents {
	WebDriver driver;

	@FindBy(css = ".totalRow button")
	WebElement Checkoutfile;

	@FindBy(css = ".cartSection h3")
	private List<WebElement> cartProduct;

	public cardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public Boolean verifyproductDispaly(String productName) {
		Boolean match = cartProduct.stream().anyMatch(product -> product.getText().equalsIgnoreCase(productName));
		return match;
	}

	public checkOutpage goToCheckoutPage() {
		Checkoutfile.click();
		return new checkOutpage(driver);
		// return;
		// return new checkoutPage(driver)
	}
}
