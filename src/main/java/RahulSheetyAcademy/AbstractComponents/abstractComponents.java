package RahulSheetyAcademy.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.OrderPage;
import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.cardPage;

public class abstractComponents {
	WebDriver driver;

	public abstractComponents(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

	}

	@FindBy(css = "[routerlink='/dashboard/cart']")
	WebElement cardHeader;

	@FindBy(css = "[routerlink='/dashboard/myorders']")
	WebElement orderHeader;

	public void waitForElementToAppear(By findBy) {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
}
	public void waitForWebElementToAppear(WebElement findBy) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}

	public void waitForElementToDisAppear(WebElement ele) throws InterruptedException {

		//Thread.sleep(1000); //application design it will take some time so use thread

		  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		  wait.until(ExpectedConditions.invisibilityOf(ele));

}
	public  OrderPage gotToOrderPage() {
		orderHeader.click();
		OrderPage orderPage= new OrderPage(driver);
		return orderPage;
	}
	public cardPage gotToCardPage() {
		cardHeader.click();
		cardPage cardpage= new cardPage(driver);
		return cardpage;
	}

}