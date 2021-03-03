package M_Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		
		//Admin---->UserManagement--->Users
		WebElement admin=driver.findElement(By.xpath("//*[text()='Admin']"));
		WebElement usermgt=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement user=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		
		Actions act= new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(admin).moveToElement(usermgt).moveToElement(user).build().perform();
}
}
