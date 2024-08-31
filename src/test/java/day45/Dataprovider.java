package day45;

import java.time.Duration;


import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Dataprovider {
	WebDriver driver;
	
	@BeforeClass
	void Setup()
	{
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void testlogon() throws InterruptedException
	{
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("biswabandita bini");
		driver.findElement(By.name("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		Thread.sleep(200);
		boolean status= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img")).isDisplayed();
		if(status==true)
		{
			driver.findElement(By.xpath(null));
			Assert.assertTrue(true);
		}
			else
			{
				Assert.fail();
			}
		}
		
	@AfterClass
	void Testlogout()
	{
		driver.close();
		
	}
	@DataProvider
	Object Logdata()
	{
		Object data[][]= {{"bisawbasndiat", "12334"},{"Rout", "0987"},
		{"biswabandita bini", "abcg"},
		{"biswabandita bini", "Bandita@1234"}};
		return data;
	}	
		}
	


