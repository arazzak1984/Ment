package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Double_Click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\System Software\\Ankur Second Session Chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/#dblclick-handler");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.xpath("//html//body//div"));
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		Thread.sleep(3000);
        act.doubleClick(ele).build().perform();
		Thread.sleep(3000);
		act.doubleClick(ele).build().perform();
		Thread.sleep(3000);
		act.doubleClick(ele).build().perform();
	}

}
