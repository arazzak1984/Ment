package M_Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class OpeningNewWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		  
		String currentwindow=driver.getWindowHandle();
		System.out.println(currentwindow);
		
		Actions point=new Actions(driver);
		WebElement forgot=driver.findElement(By.linkText("Forgot account?"));
		point.keyDown(Keys.SHIFT).click(forgot).build().perform();
		
		driver.switchTo().window(currentwindow);

	}

}
