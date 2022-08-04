package springtek.login.pkg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import spirng.readfile.pkg.ReadFile;
import springtek.kid.pkg.KidsTest;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class LoginTestNg 
{
  private WebDriver driver;

@Test
  public void login() throws IOException, InterruptedException 
  {
//		XSSFSheet sh_join = ReadFile.readF("login");
//		int size = sh_join.getLastRowNum();
//		System.out.println("Row size " + size);

//		for (int i = 1; i <= size; i++) 
//		{
			LoginRepository.un_email(driver).clear();
			LoginRepository.login_pw(driver).clear();
//			String un = sh_join.getRow(i).getCell(0).toString();
//			String pw = sh_join.getRow(i).getCell(1).toString();
	
			LoginRepository.un_email(driver).sendKeys("pritibahale1803@gmail.com");
			LoginRepository.login_pw(driver).sendKeys("Shivansh@10");
	
			WebElement fv = driver.findElement(By.id("login_first"));
			int v1 = Integer.parseInt(fv.getAttribute("value"));
			WebElement sv = driver.findElement(By.id("login_last"));
			int v2 = Integer.parseInt(sv.getAttribute("value"));
	
			LoginRepository.login_result(driver).sendKeys(Integer.toString(v1 + v2));
			LoginRepository.login(driver).click();
			Thread.sleep(5000);
//			KidsTest kt = new KidsTest();
//			kt.beforeClass(driver);
//			
//			kt.beforeM(driver);
//			kt.bookChairs(driver);
//			kt.addToCart(driver);
//			
//			kt.beforeM(driver);
//			kt.bookFoldChair(driver);
//			kt.addToCart(driver);
//			
//			kt.beforeM(driver);
//			kt.bookTv(driver);
//			kt.addToCart(driver);
	    }
	  
//  }


	  @BeforeTest
	  public void beforeTest()
	  {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://springtek.in/Register");	  
	  }

	  @AfterTest
	  public void closeBrowser() 
	  {
		  driver.close();
	  }

}
