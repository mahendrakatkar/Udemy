package RahulSheetyAcademy.MavenProjectUdemy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RahulSheetyAcademy.AbstractComponents.abstractComponents;

public class LandingPage extends abstractComponents{

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement userEmail = driver.findElement(By.id("userEmail"));
//page factory
	@FindBy(id = "userEmail") // to get idea of driver > added sentence in construction>
								// PageFactory.initElements(driver, this)
	WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement passwordel;

	@FindBy(id = "login")
	WebElement submit;

	@FindBy(css = "[class*='flyInOut']")
	WebElement errorMessage;

	public productCalalog loginApplication(String email, String password) {
		userEmail.sendKeys(email);
		passwordel.sendKeys(password);
		submit.click();

		productCalalog ProductCalalog = new productCalalog(driver);
		return ProductCalalog;
		}

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");

	}

	public String getErrorMessage() {
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();

	}

}
