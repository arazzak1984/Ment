package depends_method;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class checkingDependency {
	WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("https://www.horizonnjhealth.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

  @Test
  public void tC1() {
	  driver.findElement(By.xpath("(//a[text()='FIND A DOCTOR'])[1]")).click();
  }
  
  @Test()
  public void tC2() {
	  driver.findElement(By.id("edit-provider-type-list")).click();
	  Select dd=new Select(driver.findElement(By.id("edit-provider-type-list")));
		dd.selectByVisibleText("Hospital");
		
		driver.findElement(By.id("edit-plan-list")).click();
		Select dd2=new Select(driver.findElement(By.id("edit-plan-list")));
		dd2.selectByVisibleText("Horizon NJ Health");
  }
  
  
 
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
