package M_Functions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Get_Title {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
}
}
