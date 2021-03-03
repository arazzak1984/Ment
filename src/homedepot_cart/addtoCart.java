package homedepot_cart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtoCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Driver Latest/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	      driver.get("https://www.homedepot.com/");
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.id("headerSearch")).sendKeys("screw driver");
	      WebElement searcbox=driver.findElement(By.id("headerSearch"));
	      Thread.sleep(6000);
	      searcbox.sendKeys(Keys.ARROW_DOWN);
	      Thread.sleep(6000);
	      searcbox.sendKeys(Keys.ENTER);
	      Thread.sleep(6000);
	      driver.findElement(By.id("headerSearchButton")).click();
	      Thread.sleep(6000);
	      driver.findElement(By.linkText("HDX 3-1/4 in. 6-in-1 Screwdriver")).click();
	      for(int i=0;i<5;i++) {
	    	  
	      
	    driver.findElement(By.xpath("//div[@class='quantity-btn increment']")).click();
	      }
	      Thread.sleep(6000);
	      
	      driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	}

}
