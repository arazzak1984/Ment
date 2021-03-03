package Facebook_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_TC1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(6000);
driver.findElement(By.id("email")).sendKeys("ars.acpnt@gmail.com");
driver.findElement(By.id("pass")).sendKeys("s15121984k");
Thread.sleep(6000);
driver.findElement(By.xpath("//input[contains(@id,'u_0_2')]")).click();
Thread.sleep(6000);
driver.findElement(By.className("_1vp5")).click();
//driver.findElement(By.className("_1frb")).sendKeys("Many Fakhori");

	}

}
