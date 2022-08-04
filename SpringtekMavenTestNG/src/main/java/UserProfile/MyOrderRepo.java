package UserProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyOrderRepo {

	private static WebElement element;

	public static WebElement firstname(WebDriver driver) {
		element = driver.findElement(By.id("firstname"));
		return element;
	}

	public static WebElement lastname(WebDriver driver) {
		element = driver.findElement(By.id("lastname"));
		return element;
	}

	public static WebElement mobileNumber(WebDriver driver) {
		element = driver.findElement(By.id("mobileNumber"));
		return element;
	}

	public static WebElement address(WebDriver driver) {
		element = driver.findElement(By.id("address"));
		return element;
	}

	public static WebElement landmark(WebDriver driver) {
		element = driver.findElement(By.id("landmark"));
		return element;
	}

	public static WebElement pincode(WebDriver driver) {
		element = driver.findElement(By.id("pincode"));
		return element;
	}

	public static WebElement city(WebDriver driver) {
		element = driver.findElement(By.id("city"));
		return element;
	}

	public static WebElement state(WebDriver driver) {
		element = driver.findElement(By.id("state"));
		return element;
	}

	public static WebElement userIcon(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.cssSelector("img[src = '/images/svg/user-icon.png']"));
		return element;
	}


	public static WebElement orderTitle(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.cssSelector("a[href='/myorders']"));
		return element;
	}

	public static WebElement penddingOrder(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.cssSelector("a[href='#home']"));
		return element;
	}

	public static WebElement penddingText(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("home"));
		return element;

	}

	public static WebElement shippingOrder(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.cssSelector("a[href='#menu1']"));
		return element;
	}

	public static WebElement shippingText(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("menu1"));
		return element;
	}

	public static WebElement deliveryOrder(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.cssSelector("a[href='#menu2']"));
		return element;
	}

	public static WebElement deliveryText(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("menu2"));
		return element;
	}

	public static WebElement addressTitle(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.cssSelector("a[href='/myaddress']"));
		return element;
	}

	public static WebElement changepassword(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.cssSelector("a[href='/changepassword']"));
		return element;
	}

	public static WebElement submitbtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.name("shippingaddressBtn"));
		return element;
	}

	public static WebElement oldPassword(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("oldPassword"));
		return element;
	}

	public static WebElement newPassword(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("newPassword"));
		return element;
	}

	public static WebElement confirmNewPassword(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("confirmNewPassword"));
		return element;
	}

	public static WebElement firstValue(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("first"));
		return element;
	}

	public static WebElement lastValue(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("last"));
		return element;
	}

	public static WebElement result(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("result"));
		return element;
	}

	public static WebElement passwordSubmit(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("btnsubmit"));
		return element;
	}

	public static WebElement selectFloor(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("floor"));
		return element;
	}

	public static Object logout(WebDriver driver) throws InterruptedException {
			Thread.sleep(3000);
			element = driver.findElement(By.cssSelector("a[href='/register']"));
			return element;
		}

	public static WebElement telecall(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.cssSelector("a[href='tel:+91 8006002485']"));
		return element;
	}

	public static WebElement whatsapp(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.cssSelector("a[href='https://api.whatsapp.com/send?phone=918006002485&text=Hi there, I have a query.']"));
		return element;
	}
	
}
