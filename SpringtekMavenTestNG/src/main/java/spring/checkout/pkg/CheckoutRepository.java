package spring.checkout.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutRepository {
	
	private static WebElement element;
	
	public static WebElement fname(WebDriver driver) {
		element = driver.findElement(By.id("txtfname"));
		return element;
	}

	public static WebElement lastName(WebDriver driver) {
		element = driver.findElement(By.id("txtlname"));
		return element;
	}

	public static WebElement mobileNo(WebDriver driver) {
		element = driver.findElement(By.id("txtmobile"));
		return element;
	}
	
	public static WebElement emailAdd(WebDriver driver) {
		element = driver.findElement(By.id("txtemail"));
		return element;
	}
	
	public static WebElement address(WebDriver driver) {
		element = driver.findElement(By.id("txtaddress"));
		return element;
	}
	
	public static WebElement instruction(WebDriver driver) {
		element = driver.findElement(By.id("txtinstruction"));
		return element;
	}
	
	public static WebElement landmark(WebDriver driver) {
		element = driver.findElement(By.id("txtlandmark"));
		return element;
	}
	
	public static WebElement pincode(WebDriver driver) {
		element = driver.findElement(By.id("txtpincode"));
		return element;
	}
	
	public static WebElement city(WebDriver driver) {
		element = driver.findElement(By.id("txtcity"));
		return element;
	}
	
	public static WebElement state(WebDriver driver) {
		element = driver.findElement(By.id("txtstate"));
		return element;
	}
	public static WebElement ckboxagree(WebDriver driver) {
		element = driver.findElement(By.id("ckboxagree"));
		return element;
	}

	public static WebElement proceedToChkbtn(WebDriver driver) {
			
		element = driver.findElement(By.id("btngotopaymentmodel"));	
		return element;
	}

	public static WebElement selectFloor(WebDriver driver) {
		
		element = driver.findElement(By.id("ddlfloor"));
		return element;
		
		
	}

	public static WebElement shippedAdd(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/h5[1]"));
		return element;
	}

	public static WebElement productName(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div[1]/div/div[3]/div[1]/a"));
		return element;
		
	}

	public static WebElement productPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div[1]/div/div[3]/div[3]/h5/span"));
		return element;
		
	}

	public static WebElement productSize(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div[1]/div/div[3]/div[1]/p/span[1]"));
		return element ;
	}

	public static WebElement productDiscount(WebDriver driver) {
		element =  driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div[1]/div/div[3]/div[2]/h5/span"));
		return element;
	}

}
