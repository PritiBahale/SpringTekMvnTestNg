package spring.checkout.pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import sprinktek.methods.pkg.ScrollPage;

public class CheckoutPage {

	public static void checkout(WebDriver driver, JavascriptExecutor js) throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		ScrollPage.jsScroll(driver, 900);
		CheckoutRepository.fname(driver).clear();
		CheckoutRepository.fname(driver).sendKeys("ABCDE");
		
		CheckoutRepository.lastName(driver).clear();
		CheckoutRepository.lastName(driver).sendKeys("XYZ");
		
		CheckoutRepository.mobileNo(driver).clear();
		CheckoutRepository.mobileNo(driver).sendKeys("9568452635");
		
		CheckoutRepository.emailAdd(driver).clear();
		CheckoutRepository.emailAdd(driver).sendKeys("abcd@gmail.com");
		try {
			Select s = new Select(CheckoutRepository.selectFloor(driver));
			s.selectByVisibleText("Floor-2");
		} catch (Exception e) {
			System.out.println(e);
		}
		CheckoutRepository.address(driver).clear();
		CheckoutRepository.address(driver).sendKeys("mnop");
		
		CheckoutRepository.instruction(driver).clear();
		CheckoutRepository.instruction(driver).sendKeys("jklmnop");
		
		CheckoutRepository.landmark(driver).clear();
		CheckoutRepository.landmark(driver).sendKeys("near petrol pamp");
		
		CheckoutRepository.pincode(driver).clear();
		CheckoutRepository.pincode(driver).sendKeys("445001");

		
		// js.executeScript("scroll(0, 700)");
		CheckoutRepository.city(driver).clear();
		CheckoutRepository.city(driver).sendKeys("ABCDE");
		
		CheckoutRepository.state(driver).clear();
		CheckoutRepository.state(driver).sendKeys("ABCDE");
		js.executeScript("arguments[0].click();", CheckoutRepository.ckboxagree(driver));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", CheckoutRepository.proceedToChkbtn(driver));

		System.out.println("Shipping Address : " + CheckoutRepository.shippedAdd(driver).getText());
		
		System.out.println("Product Name : "+ CheckoutRepository.productName(driver).getText());
		
		System.out.println("Price :  "+ CheckoutRepository.productPrice(driver).getText());
		
		System.out.println("Size : " + CheckoutRepository.productSize(driver).getText());
		
		System.out.println("Discount :  " + CheckoutRepository.productDiscount(driver).getText());
	
		Thread.sleep(3000);
		
		

	}

}
