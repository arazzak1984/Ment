package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Inner_Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		Thread.sleep(3000);

WebElement outerframe=driver.findElement(By.xpath("//div[@id='Multiple']//iframe[contains(text(),'<p>Your browser does not support iframes.</p>')]"));
		driver.switchTo().frame(outerframe);
		Thread.sleep(5000);
		
		WebElement innerframe=driver.findElement(By.xpath("//iframe[contains(text(),'<p>Your browser does not support iframes.</p>')]"));
	    driver.switchTo().frame(innerframe);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dd");
	    
	    
	}
	}


