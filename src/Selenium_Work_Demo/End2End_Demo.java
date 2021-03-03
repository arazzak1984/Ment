package Selenium_Work_Demo;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class End2End_Demo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver Latest/chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); 
// Radio Button:---------->>>>>
	      WebElement rb = driver.findElement(By.xpath("//*[@id='radio-btn-example']/fieldset/label[1]/input"));
	      rb.click();
	      if (rb.isSelected())
	      { System.out.println("Radio Button Working");}
	      else
	      {System.out.println("Radio Button is not working");}
// Select Class:---------->>>>>
	      Select dd = new Select(driver.findElement(By.id("dropdown-class-example")));
	      dd.selectByVisibleText("Option3");
// Check Box:---------->>>>>
	      WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
	      checkbox.click();
	      if (checkbox.isSelected())
	      {System.out.println("Check Box Works");}
	      else
	      {System.out.println("Check Box is not Working");}
// Switch Window:---------->>>>>
	      String landingpage = driver.getWindowHandle();
	      System.out.println("Parent window is" +landingpage);
	      WebElement newwindo = driver.findElement(By.id("openwindow"));
	      newwindo.click();
	      Set<String> windoHandles = driver.getWindowHandles();
	      for(String handle: windoHandles){
	          if(!handle.equals(landingpage)){
	          driver.switchTo().window(handle);
	          System.out.println("Title of the new window: " +driver.getTitle());
	          System.out.println("Closing the new window...");
	          driver.close();
	          }
	      }// Switching the control back to parent window::
	      driver.switchTo().window(landingpage);
// Switch Tab:---------->>>>>
	      driver.findElement(By.id("opentab")).click();
	      ArrayList tabs = new ArrayList(driver.getWindowHandles());
	      driver.switchTo().window((String) tabs.get(0));
// Switch to Alert:---------->>>>>
	      driver.findElement(By.id("name")).sendKeys("AR Sumon");
	      driver.findElement(By.id("alertbtn")).click();
	     driver.switchTo().alert().accept(); 
	     driver.quit();
	}
}
