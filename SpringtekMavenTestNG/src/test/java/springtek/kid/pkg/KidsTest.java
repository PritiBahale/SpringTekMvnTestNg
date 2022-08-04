package springtek.kid.pkg;

import org.testng.annotations.Test;


import TrackOrder.TrackOrder;
import UserProfile.ChatBox;
import UserProfile.MyOrder;
import io.github.bonigarcia.wdm.WebDriverManager;
import spingtek.addtocart.AddToCart;
import spingtek.addtocart.SearchRepository;
import spirng.readfile.pkg.ReadFile;
import spring.checkout.pkg.CheckoutPage;
import springg.Payment.pkg.PaymentPage;
import springtek.login.pkg.LoginPage;
import sprinktek.methods.pkg.ScrollPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class KidsTest {
	WebDriver driver;
	Actions act;
	JavascriptExecutor js;
	WebElement chairs;

	@Test(priority = 1)
	public void bookChairs() throws InterruptedException, IOException 
	{
		LoginPage.login(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));				
		WebElement living = driver.findElement(By.linkText("Living"));

		act.moveToElement(living).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
		chairs = driver.findElement(By.linkText("Accent Chairs"));		
		chairs.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
		SearchRepository.pinCode(driver).sendKeys("411005");		
		WebElement addBtn =	SearchRepository.addToCartButton(driver);
		//js.executeScript("arguments[0].scrollIntoView();", addBtn);
		ScrollPage.jsScroll(driver,700);				
		js.executeScript("arguments[0].click();",addBtn);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();           // alert Msg

	}



	@Test(priority = 2)
	public void  bookFoldChair() throws InterruptedException
	{	
		WebElement kids = driver.findElement(By.linkText("Kids"));

		act.moveToElement(kids).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));					
		chairs = driver.findElement(By.linkText("Baby Toddler, Foldable Wooden Highchair"));		
		chairs.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));					
		SearchRepository.pinCode(driver).sendKeys("411005");					
		WebElement addBtn =	SearchRepository.addToCartButton(driver);
		//js.executeScript("arguments[0].scrollIntoView();", addBtn);
		ScrollPage.jsScroll(driver,700);				
		js.executeScript("arguments[0].click();",addBtn);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();           // alert Msg

	}
	@Test(priority = 3)
	public void bookTv() throws InterruptedException
	{
		WebElement bedroom = driver.findElement(By.linkText("Bedroom"));
		act.moveToElement(bedroom).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement tv = driver.findElement(By.linkText("Drishya TV Unit"));		
		tv.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		SearchRepository.pinCode(driver).sendKeys("411005");

		WebElement addBtn =	SearchRepository.addToCartButton(driver);
		//js.executeScript("arguments[0].scrollIntoView();", addBtn);
		ScrollPage.jsScroll(driver,700);
		js.executeScript("arguments[0].click();",addBtn);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();           // alert Msg	

	}
	

	@BeforeTest
	public void beforeClass()
	{
		System.out.println("I am in before class");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://springtek.in");
		act = new Actions(driver);
		js = (JavascriptExecutor) driver;

	}

	@AfterTest
	public void closeBrowser() throws InterruptedException, IOException 
	{
		TrackOrder.track_order(driver);
		SearchRepository.mainLogo(driver).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		ChatBox.chat_box(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		SearchRepository.mainLogo(driver).click();
		MyOrder.logout(driver, act, js);
		System.out.println("Logout");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.close();
	}

	@BeforeMethod
	public void beforeM()
	{
		System.out.println("Testcase starting");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[2]/div[1]/a/img")));
		SearchRepository.mainLogo(driver).click();
	}


	@AfterMethod
	public void addToCart() throws InterruptedException, IOException
	{

		AddToCart.addToCart(driver, chairs, js);
		CheckoutPage.checkout(driver, js);

		try
		{
			SearchRepository.emiPayment(driver).click(); // payment method
			Thread.sleep(2000);
			SearchRepository.contiPayBtn_checkout(driver).click();
			Thread.sleep(5000);
		} 
		catch (Exception e) {
			System.out.println(e);
		}

		try {
			PaymentPage.payment(driver, js, act); // Payment Popup
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}


	}

}
