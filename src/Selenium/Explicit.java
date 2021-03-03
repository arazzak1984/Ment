package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Explicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,1000);
		
		driver.navigate().to("http://www.newtours.demoaut.com/");
		
	WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
	username.sendKeys("mercury");
	WebElement pass=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	pass.sendKeys("mercury");
	WebElement login=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
	login.click();

	}
}
