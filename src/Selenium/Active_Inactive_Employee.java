package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Active_Inactive_Employee {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		
		int rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		System.out.println(rows);
		
		int count = 0;
		for(int r=1;r<=rows;r++)
		{
String status= driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();	
		if(status.equals("Enabled"))
			{
				count++;
			}
		}
		System.out.println("Number of enabled employees:"+ count);
		System.out.println("Number of disabled employees:"+(rows-count));
	}
}
