package UserProfile;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MyOrder {

	public static void logout(WebDriver driver,Actions act ,JavascriptExecutor js ) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		act.moveToElement(MyOrderRepo.userIcon(driver)).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		js .executeScript("arguments[0].click();", MyOrderRepo.orderTitle(driver));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		MyOrderRepo.penddingOrder(driver).click();		
		System.out.println(MyOrderRepo.penddingText(driver).getText());
		MyOrderRepo.shippingOrder(driver).click();
		System.out.println(MyOrderRepo.shippingText(driver).getText());
		MyOrderRepo.deliveryOrder(driver).click();
		System.out.println(MyOrderRepo.deliveryText(driver).getText());
																							// addresss
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		act.moveToElement(MyOrderRepo.userIcon(driver)).build().perform();
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", MyOrderRepo.addressTitle(driver));
		MyOrderRepo.firstname(driver).sendKeys("XYZ");
		MyOrderRepo.lastname(driver).sendKeys("MNOP");
		MyOrderRepo.mobileNumber(driver).sendKeys("9586958746");
		
		Select s = new Select(MyOrderRepo.selectFloor(driver));
		s.selectByVisibleText("Floor-5");
		Thread.sleep(3000);
		MyOrderRepo.address(driver).sendKeys("Maharastra");
		MyOrderRepo.landmark(driver).sendKeys("near M hotel");
		MyOrderRepo.pincode(driver).sendKeys("415025");
		MyOrderRepo.state(driver).sendKeys("Maharastra");
		MyOrderRepo.city(driver).sendKeys("Yavatmal");
		MyOrderRepo.submitbtn(driver).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		act.moveToElement(MyOrderRepo.userIcon(driver)).build().perform();
		js.executeScript("arguments[0].click();", MyOrderRepo.changepassword(driver));
		MyOrderRepo.oldPassword(driver).sendKeys("Shiv");
		MyOrderRepo.newPassword(driver).sendKeys("Shivansh@10");
		MyOrderRepo.confirmNewPassword(driver).sendKeys("Shivansh@10");
		WebElement fvp = MyOrderRepo.firstValue(driver);
		int fv1 = Integer.parseInt(fvp.getAttribute("value"));
		
		WebElement svp = MyOrderRepo.lastValue(driver);
		int sv2 = Integer.parseInt(svp.getAttribute("value"));
		
		MyOrderRepo.result(driver).sendKeys(Integer.toString(fv1 + sv2));
		
		MyOrderRepo.passwordSubmit(driver).click();
		js.executeScript("arguments[0].click();", MyOrderRepo.logout(driver));
		
		
	}

}
