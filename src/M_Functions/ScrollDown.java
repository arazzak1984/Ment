package M_Functions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		//Scroll to bottom of page::  To see hidden element in the page:----->>

		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(6000);
		js.executeScript("scrollBy(0,2500)");
	}

}
