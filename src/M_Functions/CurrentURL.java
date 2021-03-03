package M_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
}
}
