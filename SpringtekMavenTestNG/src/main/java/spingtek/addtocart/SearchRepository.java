package spingtek.addtocart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchRepository {

	private static WebElement element;

	public static WebElement search(WebDriver driver) {
		element = driver.findElement(By.name("searchbox"));
		return element;
	}

	public static WebElement dualConf(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a[href='https://springtek.in/dual-comfort']"));
		return element;
	}

	public static WebElement dualImage(WebDriver driver, int j) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		element = driver.findElement(By.xpath("//*[@id=\"magnific\"]/div/div/div/div[1]/div/div/a[" + j + "]/img"));
		Thread.sleep(1000);
		return element;
	}

	public static WebElement mattSize(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		element = driver.findElement(By.cssSelector("input[value='Double']"));
		return element;
	}

	public static WebElement mattDimention(WebDriver driver) throws InterruptedException {
		element = driver.findElement(By.cssSelector("input[value='75\"x36\"']"));
		return element;
	}

	public static WebElement matt_height(WebDriver driver) {
		element = driver.findElement(By.name("mattress height"));
		return element;
	}

	public static WebElement ddlquantity(WebDriver driver) {
		element = driver.findElement(By.id("ddlquantity"));
		return element;
	}

	public static WebElement pinCode(WebDriver driver) throws InterruptedException {
		element = driver.findElement(By.id("txtpincodecheck"));
		return element;
	}

	public static WebElement addToCartButton(WebDriver driver) throws InterruptedException {

		element = driver.findElement(By.id("btngotocart"));
		return element;
	}

	public static WebElement viewVerify(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a[href='/natural-latex-mattress-certificate']"));
		return element;
	}

//	public static WebElement quantity_id(WebDriver driver) {
//		element = driver.findElement(By.xpath("//*[@id=\"bindcartitems\"]/div[1]/div/div[1]/div[2]/div[2]/select"));
//		return element;   
//	}
	public static WebElement quantity_id(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div[1]/div/div[1]/div[2]/div[2]/select"));
		return element;   
	}


	public static WebElement unitPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"bindcartitems\"]/div[1]/div/div[1]/div[2]/div[3]/h5[2]/span"));
		return element;
	}

	public static WebElement totalPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"bindcartitems\"]/div[1]/div/div[1]/div[2]/div[5]/h5[2]/span"));
		return element;
	}

	public static WebElement txtbox_Coupon(WebDriver driver) {
		element = driver.findElement(By.id("txtcouponcode"));
		return element;
	}

	public static WebElement applycouponTextMsg(WebDriver driver) {	// /html/body/div[1]/section/div/div/div[1]/div[2]/div/div[1]/p
		element = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[1]/div[2]/div/div[1]/p"));
		return element;
	}

	public static WebElement applyCoupButton(WebDriver driver) {
		element = driver.findElement(By.id("btncouponcode"));
		return element;
	}

	public static WebElement proceedtocheckoutbtn(WebDriver driver) {
		element = driver.findElement(By.id("btngotocheckout"));
		return element;

	}

	
	public static WebElement emiPayment(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[2]/div/div[3]/div[2]/div/div[1]/div[6]"));
		return element;						
	}

	public static WebElement contiPayBtn_checkout(WebDriver driver) {
		element =  driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[2]/div/div[3]/div[2]/div/div[2]/div/div[8]/div[2]/a[2]"));
		return element;
	}

	public static WebElement chtiframe(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[4]/iframe[3]"));
		return element;
	}

	public static WebElement chatCloseBtn(WebDriver driver) {
		element = driver.findElement(By.id("tawk-mpreview-close"));
		return element;
	}
	
	public static WebElement mrp_value(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"productmrpspan\"]"));
		return element ;
		
	}
	

	public static WebElement product_price(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/s"));
		return element ;
	}

	public static WebElement coupon_selling_price(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"productspecialpricestrong\"]"));
		return element ;
	}

	public static WebElement saving_MRP_price(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"productdiscountdetailspan\"]"));
		return element ;
	}
	
	public static WebElement mainLogo(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/header/div[2]/div[1]/a/img"));	
		return element ;
	}
	
	
	
	
}
