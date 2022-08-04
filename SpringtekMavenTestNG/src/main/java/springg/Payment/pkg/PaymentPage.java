package springg.Payment.pkg;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import spirng.readfile.pkg.ReadFile;
import sprinktek.methods.pkg.ScrollPage;

public class PaymentPage {
	public static void payment(WebDriver driver, JavascriptExecutor js, Actions act)
			throws InterruptedException, IOException {

		driver.switchTo().frame(PaymentRepository.popupiFrame(driver));
		Thread.sleep(2000);
		System.out.println("Merchant Name : " + PaymentRepository.merchant_name(driver).getText());
		System.out.println("Total Amount : " + PaymentRepository.totalamount(driver).getText());
		System.out.println("Phone || Email :  " + PaymentRepository.phoneemail(driver).getText());
		js.executeScript("arguments[0].click();", PaymentRepository.selectoffer(driver));
		PaymentRepository.selectOfferList(driver).click();
		System.out.println("Select Offer :   " + PaymentRepository.selectOfferList(driver).getText());
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", PaymentRepository.selectRbiBank(driver));
		Thread.sleep(3000);
		System.out.println("Selected Offer :   " + PaymentRepository.selectRbiBank(driver).getText());
		js.executeScript("arguments[0].click();", PaymentRepository.applyOfferBtn(driver));
		Thread.sleep(3000);
		try {

			XSSFSheet cardSh = ReadFile.readF("card credential");
			int cardShisze = cardSh.getLastRowNum();

			for (int m = 1; m <= cardShisze; m++) {
				PaymentRepository.cardNumber(driver).clear();
				PaymentRepository.cardExpiry(driver).clear();
				PaymentRepository.cardCVV(driver).clear();
				
				String cred_data = cardSh.getRow(m).getCell(0).toString();
				String exp_date = cardSh.getRow(m).getCell(1).toString();
				String cvv = cardSh.getRow(m).getCell(2).toString();

				PaymentRepository.cardNumber(driver).sendKeys(cred_data);
				PaymentRepository.cardExpiry(driver).sendKeys(exp_date);
				PaymentRepository.cardCVV(driver).sendKeys(cvv);
			
				System.out.println("Card No :  " + cred_data + "  ||  " + "expdate :  " + exp_date + "  ||  " + " cvv : " + cvv);
				js.executeScript("arguments[0].click();", PaymentRepository.payButton(driver));
			}
		} catch (Exception e) {
			System.out.println("Card details not there");
		}
		
		act.moveToElement(PaymentRepository.emiTitle(driver)).doubleClick().build().perform();
		Thread.sleep(2000);																					// Card
		ScrollPage.jsScroll(driver, 400);	
		Thread.sleep(2000);																					// Netbanking
		js.executeScript("arguments[0].scrollIntoView();", PaymentRepository.netBanking(driver));
		PaymentRepository.sbiBank(driver).click();		// select HDFC Bank
		Thread.sleep(2000);
		PaymentRepository.hdfcBank(driver).click();
	
		String win1 = driver.getWindowHandle();
		// pay btn
		PaymentRepository.netbankingPaymentButton(driver).click();
		Thread.sleep(3000);

		for (String wins : driver.getWindowHandles())
		{
			driver.switchTo().window(wins); // Switching to new window opened
		}
		
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("bottom_frame");
		
		// customerID
	
		PaymentRepository.cust_id(driver).sendKeys("12345");
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", PaymentRepository.continueButton(driver));
		
		driver.close();	
		driver.switchTo().window(win1);

		driver.switchTo().frame(driver.findElement(By.className("razorpay-checkout-frame")));
									
		ScrollPage.jsScroll(driver,400);
		PaymentRepository.reson1(driver).click();	
		js.executeScript("arguments[0].click();", PaymentRepository.subitButton(driver));
		js.executeScript("arguments[0].click();", PaymentRepository.retryButton(driver));
		Thread.sleep(3000);
		PaymentRepository.popUpClose(driver).click();
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
	

	}

}
