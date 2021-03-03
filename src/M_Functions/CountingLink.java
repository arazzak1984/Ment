package M_Functions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountingLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for (WebElement e:links)
		{
			System.out.println(e.getText());
		}
}
}
