package RahulSheetyAcademy.MavenProjectUdemy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RahulSheetyAcademy.AbstractComponents.abstractComponents;

public class productCalalog extends abstractComponents {

	WebDriver driver;

	public productCalalog(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement userEmail = driver.findElement(By.id("userEmail"));
//page factory
//	List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

	@FindBy(css = ".mb-3")
	List <WebElement> products;

	@FindBy(css = ".ng-animating")
	WebElement spinner;


	By productBy=By.cssSelector(".mb-3");
	By addToCard =By.xpath("/button");
	By toastMessage=By.cssSelector("#toast-container");


	public List<WebElement> geProductList() {
		waitForElementToAppear(productBy);
		return products;
	}

	public WebElement getProductByName(String productName) {
		
		WebElement prod = driver.findElement(By.xpath("//*[contains(text(),'"+productName+"')]/parent::h5/following-sibling::button[2]"));
		
	
	return prod;
	}

	public void addProductTOCard(String productName) throws InterruptedException {
	WebElement prod=	getProductByName(productName);
		prod.click();
		waitForElementToAppear(toastMessage);
		waitForElementToDisAppear(spinner);
		}
}
