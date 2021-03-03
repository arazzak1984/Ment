package M_Functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicate_Element_Handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		
//Three elements have the same attribute value; like name=sex, so i m selecting based on index number.		
		
		List<WebElement> lin = driver.findElements(By.name("sex"));
		System.out.println(lin.size());
		
		for(int i=0; i<=lin.size(); i++) {
			lin.get(2).click();
		}
		

	}

}
