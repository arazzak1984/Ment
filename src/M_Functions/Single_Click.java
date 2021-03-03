package M_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Single_Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement sclick=driver.findElement(By.xpath("//*[contains(@onclick,'myFunct')]"));
		Thread.sleep(6000);
		Actions act=new Actions(driver);
		
		act.moveToElement(sclick).click().perform();
		Thread.sleep(6000);
		
		//For right click------->>>>
		
		//act.moveToElement(sclick).contextClick().build().perform();

	}

}
