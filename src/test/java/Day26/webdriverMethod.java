package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.id("Bandita"));
		

	}

}
