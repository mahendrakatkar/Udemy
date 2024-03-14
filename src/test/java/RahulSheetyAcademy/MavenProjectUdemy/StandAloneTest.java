package RahulSheetyAcademy.MavenProjectUdemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import RahulSheetyAcademy.MavenProjectUdemy.pageobjects.LandingPage;

public class StandAloneTest {
	WebElement product = null;

	public static void main(String[] args) throws InterruptedException {
		String productName="ZARA COAT 3";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/client");

		LandingPage landingPage= new LandingPage(driver);

		driver.findElement(By.id("userEmail")).sendKeys("mahendra@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Mahendra@123");
		driver.findElement(By.id("login")).click();
		driver.manage().window().maximize();



		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod = products.stream().filter(Product->
		Product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		prod.findElement(By.xpath("/html/body/app-root/app-dashboard/section[2]/div[1]/div[2]/div[1]/div/div/button[2]")).click();
			Thread.sleep(5000); //use wait

		driver.findElement(By.cssSelector("[routerlink='/dashboard/cart']")).click();
	driver.findElement(By.cssSelector(".totalRow button")).click();

	Actions a = new Actions(driver);
	a.sendKeys(driver.findElement(By.cssSelector("[placeholder=\"Select Country\"]")), "india").build().perform();

	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
driver.findElement(By.cssSelector(".action__submit")).click();
String ConfrimMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
Assert.assertTrue(ConfrimMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	driver.close();
	}


			/*
			 * WebDriver driver = new ChromeDriver();
			 *
			 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 * driver.get(
			 * "https://www.amazon.com/s?k=mouse+pad&crid=2XCV4QW82Y5UN&sprefix=mo%2Caps%2C91&ref=nb_sb_ss_ts-doa-p_1_2"
			 * ); driver.manage().window().maximize();
			 *
			 *
			 *
			 * List<WebElement> lt =
			 * driver.findElements(By.cssSelector(".a-section a-spacing-base"));
			 * //className("a-section a-spacing-base")); for (WebElement it : lt) { String
			 * my_text = it.getText(); System.out.println(my_text); if
			 * (my_text.contains("zara coat 3")) { System.out.println(my_text);
			 * driver.findElement(By.className("fa fa-shopping-cart")).click(); break;
			 */
			}


