package springtek.login.pkg;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import spirng.readfile.pkg.ReadFile;

public class LoginPage {

	public static void login(WebDriver driver) throws IOException, InterruptedException {
		XSSFSheet sh_join = ReadFile.readF("login");
		int size = sh_join.getLastRowNum();
		System.out.println("Row size " + size);

//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://springtek.in/Register");

		for (int i = 1; i <= size; i++) {
			LoginRepository.un_email(driver).clear();
			LoginRepository.login_pw(driver).clear();
			String un = sh_join.getRow(i).getCell(0).toString();
			String pw = sh_join.getRow(i).getCell(1).toString();

			LoginRepository.un_email(driver).sendKeys(un);
			LoginRepository.login_pw(driver).sendKeys(pw);

			WebElement fv = driver.findElement(By.id("login_first"));
			int v1 = Integer.parseInt(fv.getAttribute("value"));
			WebElement sv = driver.findElement(By.id("login_last"));
			int v2 = Integer.parseInt(sv.getAttribute("value"));

			LoginRepository.login_result(driver).sendKeys(Integer.toString(v1 + v2));
			LoginRepository.login(driver).click();
			Thread.sleep(5000);

		}
		// SearchPage.searchItem(driver);

		
	}
}
