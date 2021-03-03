package M_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderFunction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Driver Latest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']/span"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(slider, 400, 0).build().perform();

	}

}
