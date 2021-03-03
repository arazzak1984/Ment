package M_Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement source_element=driver.findElement(By.id("box6"));
		WebElement target_element=driver.findElement(By.id("box106"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		
		act.dragAndDrop(source_element, target_element).build().perform();
		
		WebElement source_element1=driver.findElement(By.id("box1"));
		WebElement target_element1=driver.findElement(By.id("box101"));
		act.dragAndDrop(source_element1, target_element1).build().perform();

	}

}
