package PavanSir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/* 
 * Open App
 * test logo 
 * login
 * Close
 */
public class OpenOrangeHRM {
	WebDriver driver;
	@Test(priority=1)
	public void OpenHr()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test(priority=2)
	public void TestLogo() throws Exception
	{
		Thread.sleep(30);
		boolean Status=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		System.out.println("Dispaly Logo:"+Status);
		
	}
	@Test(priority=3)
	void Logon()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	}
	@Test(priority=4)
	void Close()
	{
		driver.quit();
	}

}
