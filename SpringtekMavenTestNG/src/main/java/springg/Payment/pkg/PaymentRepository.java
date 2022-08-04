package springg.Payment.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentRepository
{
	
	private static WebElement element;

	public static WebElement merchant_name(WebDriver driver) {
		element = driver.findElement(By.id("merchant-name"));
		return element;
		
	}

	public static WebElement totalamount(WebDriver driver) {
		element = driver.findElement(By.className("original-amount"));
		return element;
	}

	public static WebElement phoneemail(WebDriver driver) {
		element = driver.findElement(By.id("user-details"));
		return element ;
	}

	public static WebElement selectoffer(WebDriver driver) {
		element = driver.findElement(By.className("svelte-11398gv"));
		return element ;
		
	}

	public static WebElement selectOfferList(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[6]/div[3]/header/span"));
		return element ;
		
	}

	public static WebElement selectRbiBank(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[6]/div[3]/main/div/div/div[2]"));
		return element ;
	}

	public static WebElement applyOfferBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[3]/span[2]"));
		return element ;
	}

	public static WebElement popUpClose(WebDriver driver) {
		element = driver.findElement(By.id("modal-close"));
		return element ;
	}
	
	public static WebElement popupiFrame(WebDriver driver)
	{
		element = driver.findElement(By.className("razorpay-checkout-frame"));
		return element;
	}
	public static WebElement cardNumber(WebDriver driver)
	{
		element =  driver.findElement(By.name("card[number]"));
		return element;
	}
	
	public static WebElement cardExpiry(WebDriver driver)
	{
		element =  driver.findElement(By.name("card[expiry]"));
		return element;
	}
	
	public static WebElement emiTitle(WebDriver driver)
	{
		element =  driver.findElement(By.id("tab-title"));
		return element;
	}
	
	public static WebElement payButton(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//*[@id=\"footer-cta\"]"));
		return element;
	}
	
	
	public static WebElement cardCVV(WebDriver driver)
	{
		element =  driver.findElement(By.name("card[cvv]"));
		return element;
	}
	
	
	public static WebElement netBanking(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div/button[1]/div/div[1]/div[2]"));
		return element;
	}

	public static WebElement sbiBank(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div/button[3]/div/div[1]/div[1]"));				
		return element;							
	}

	public static WebElement hdfcBank(WebDriver driver) 
	{
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[7]/div[1]/div/div[1]/div[2]/label"));				
		return element;
	}
	public static WebElement netbankingPaymentButton(WebDriver driver) 
	{
		element = driver.findElement(By.xpath("//*[@id=\"footer\"]/span[2]"));
		return element;
	}

	public static WebElement cust_id(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.name("fldLoginUserId"));
		return element;
		
	}

	public static WebElement continueButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div/div/div[2]/div[2]/div[2]/div[2]/a"));
		return element;
	}

	public static WebElement reson1(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.id("netbanking-0"));
		return element;
	}

	public static WebElement subitButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[6]/div/button"));		
		return element;
		
	}

	public static WebElement retryButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"fd-hide\"]"));
		return element;
	}

}
