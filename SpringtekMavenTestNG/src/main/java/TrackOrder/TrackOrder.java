package TrackOrder;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import spirng.readfile.pkg.ReadFile;

public class TrackOrder {

	
	
public static void track_order(WebDriver driver) throws InterruptedException, IOException {
		
		WebElement trackorder = driver.findElement(By.xpath("/html/body/header/div[2]/div[3]/ul/li[1]/a"));
		trackorder.click();
		Thread.sleep(3000);

		WebElement trackid = driver.findElement(By.id("txtorderid"));
		WebElement btntrack = driver.findElement(By.id("btntrack"));

		XSSFSheet trsh = ReadFile.readF("track_order");
		int size = trsh.getLastRowNum();
		for (int i = 1; i <= size; i++) {
			trackid.clear();
			String no = trsh.getRow(i).getCell(0).toString();
			trackid.sendKeys(no);
			btntrack.click();
			Thread.sleep(3000);
		}
	
	}

}
