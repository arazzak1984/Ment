package M_Functions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dimen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.manage().window().getSize());
	
		Dimension d = new Dimension (640,480);
		
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
}
}
