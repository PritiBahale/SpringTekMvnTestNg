package UserProfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChatBox {

	

	public static void chat_box(WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[9]/iframe[4]")));	
							
		System.out.println("Switched to chatbox");
		driver.findElement(By.cssSelector("img[src='https://embed.tawk.to/_s/v4/assets/images/attention-grabbers/168-r-br.svg']")).click();
		System.out.println("ChatBox Clickable");
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[9]/iframe[2]"))); ///html/body/div[9]/iframe[2]
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/form/div[1]/fieldset/div/input")).sendKeys("ABCDEF");
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/form/div[2]/fieldset/div/input")).sendKeys("9587642569");
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/button")).click();

		driver.switchTo().parentFrame();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[9]/iframe[1]")));
		System.out.println("Switched to close button");
		driver.findElement(By.xpath("/html/body/div/div/button")).click();
		Thread.sleep(5000);

		
		driver.switchTo().parentFrame();
		
		try
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[7]/iframe[3]")));  ///html/body/div[7]/iframe[3]
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("tawk-mpreview-close")).click();
		}
		catch (Exception e) 
		{
			System.out.println("close talk button not clickable");
		}
		 
		driver.switchTo().parentFrame();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
