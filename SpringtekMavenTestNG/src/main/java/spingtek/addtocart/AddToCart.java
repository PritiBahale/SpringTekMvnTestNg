package spingtek.addtocart;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import spirng.readfile.pkg.ReadFile;
import sprinktek.methods.pkg.ScrollPage;

public class AddToCart {

	private static String qty;
	private static String up;
	private static String tp;

	public static void addToCart(WebDriver driver, WebElement item,JavascriptExecutor js) throws InterruptedException, IOException {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		ScrollPage.jsScroll(driver, 900);		
		try {
			Select s = new Select(SearchRepository.quantity_id(driver));
			s.selectByValue("4");
			qty = s.getFirstSelectedOption().getText();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Quantity not there");
		}

		try { 
			up = SearchRepository.unitPrice(driver).getText();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Unit price not there");
		}
		try {
			tp = SearchRepository.totalPrice(driver).getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Total price not there");
		}


		try 
		{
			System.out.println("Product Name :  "+ item.getText() + " Quantity : " + qty + "  ||  Unit Price : " + up + "  ||  Total Price : " + tp);
		} 
		catch (Exception e)
		{
			System.out.println("Product Name,Quantity Not there :");
		}

		
		try {
			WebElement couponTextbox =     SearchRepository.txtbox_Coupon(driver);
			XSSFSheet c_sh = ReadFile.readF("coupon");
			int c_size = c_sh.getLastRowNum();
			System.out.println("No of coupons are : "+(c_size+1));
			for (int k = 0; k <= c_size; k++) 
			{
				String coupon = c_sh.getRow(k).getCell(0).toString();

				System.out.println(" coupon = " +coupon);
				SearchRepository.txtbox_Coupon(driver).clear();
				SearchRepository.txtbox_Coupon(driver).sendKeys(coupon);
				Thread.sleep(1000);
				SearchRepository.applyCoupButton(driver).click();
				ScrollPage.jsScroll(driver, 200);	
				Thread.sleep(2000);
				try
				{
					System.out.println(SearchRepository.applycouponTextMsg(driver).getText());
				}
				catch(Exception e)
				{
					String error_msg= driver.findElement(By.className("error")).getText();
					System.out.println(error_msg);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Already applied");
		}



		js.executeScript("arguments[0].scrollIntoView();", SearchRepository.proceedtocheckoutbtn(driver));
		Thread.sleep(1000);
		SearchRepository.proceedtocheckoutbtn(driver).click();



	}
}