package M_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Capital_Sendkeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement fb=driver.findElement(By.id("email"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(fb).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

	}

}
