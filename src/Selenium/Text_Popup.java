package Selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Text_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/tooltip/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement innerframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(innerframe);
		
		WebElement msg=driver.findElement(By.id("age"));
		Actions act=new Actions(driver);
		act.moveToElement(msg).build().perform();
		
		if(msg.isDisplayed()) {
			System.out.println("We ask for your age only for statistical purposes.");	
		}else {
			System.out.println("Poped Up message is not verified");
		}
	}
}
