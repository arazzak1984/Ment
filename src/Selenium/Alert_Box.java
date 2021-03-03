package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert_Box {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	}
}
