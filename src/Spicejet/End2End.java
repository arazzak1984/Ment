package Spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()=' Delhi (DEL)']")).click();
		Thread.sleep(6000);
        driver.findElement(By.xpath("(//a[text()=' Srinagar (SXR)'])[2]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("(//a[text()='20'])[1]")).click();
        Thread.sleep(6000);
        driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[text()='16']")).click();
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("#divpaxinfo")).click();
        Thread.sleep(6000);
        Select dd=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        dd.selectByVisibleText("6");
        
		
	}

}
