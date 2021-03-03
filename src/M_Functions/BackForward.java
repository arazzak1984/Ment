package M_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForward {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		
		driver.navigate().refresh();
		Thread.sleep(6000);
		
		driver.navigate().back();
		Thread.sleep(6000);
		
		driver.navigate().forward();

	}

}
