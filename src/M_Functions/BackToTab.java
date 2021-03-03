package M_Functions;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BackToTab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		driver.findElement(By.linkText("Forgot Password?")).sendKeys(selectLinkOpeninNewTab);
		
		// Way of going back to previous tab/page:---
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		
	//driver.switchTo().window((String) tabs.get(0));   :Another Way of switching Tabs:
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		/*
		driver.findElement(By.id("cookie-use-link")).click();
		driver.switchTo().window(tabs.get(1));
		driver.quit();*/

	}

}
