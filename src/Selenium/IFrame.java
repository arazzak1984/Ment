package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://seleniumhq.github.io/selenium/docs/api/java/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame"); //First Frame
		driver.findElement(By.linkText("org.openqa.selenium.ie")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.switchTo().frame("packageFrame");  //Second Frame
		driver.findElement(By.linkText("InternetExplorerDriver")).click();	
	}
}
