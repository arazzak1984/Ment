package M_Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
public class OpeningNewTabWithinThePage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		driver.findElement(By.linkText("Forgot account?")).sendKeys(selectLinkOpeninNewTab);	
		
		

	
	
}
}
