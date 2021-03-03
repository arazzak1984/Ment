package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\System Software\\Ankur Second Session Chromedriver_win32/chromedriver.exe");
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
		WebElement source_element2=driver.findElement(By.id("box2"));
		WebElement target_element2=driver.findElement(By.id("box102"));
		act.dragAndDrop(source_element2, target_element2).build().perform();
		WebElement source_element3=driver.findElement(By.id("box3"));
		WebElement target_element3=driver.findElement(By.id("box103"));
		act.dragAndDrop(source_element3, target_element3).build().perform();
		WebElement source_element4=driver.findElement(By.id("box4"));
		WebElement target_element4=driver.findElement(By.id("box104"));
		act.dragAndDrop(source_element4, target_element4).build().perform();
		WebElement source_element5=driver.findElement(By.id("box5"));
		WebElement target_element5=driver.findElement(By.id("box105"));
		act.dragAndDrop(source_element5, target_element5).build().perform();
		WebElement source_element7=driver.findElement(By.id("box7"));
		WebElement target_element7=driver.findElement(By.id("box107"));
		act.dragAndDrop(source_element7, target_element7).build().perform();
		
		

	}

}
