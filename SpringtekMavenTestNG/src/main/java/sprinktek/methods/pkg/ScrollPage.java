package sprinktek.methods.pkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollPage {
	
	public static void jsScroll(WebDriver driver , int val) {
		JavascriptExecutor	js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0," + val + ")");
	}


}
