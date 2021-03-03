package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New_Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\System Software\\Ankur Second Session Chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		  
		String currentwindow=driver.getWindowHandle();
		System.out.println(currentwindow);
		
		Actions point=new Actions(driver);
		WebElement forgot=driver.findElement(By.linkText("Forgot account?"));
		point.keyDown(Keys.SHIFT).click(forgot).build().perform();
		
		 

	}

}
