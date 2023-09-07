package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailTestCase {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kondalaraojestadi@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kondal@123");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@Test
	public void login() {
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kondalaraojestadi@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kondal@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();*/
	}
	
	
	@Test
	public void profile() {
		
	}
	
	@Test
	public void search() {
		
	}
	
	@AfterMethod
	public void teardown() {
		
	}
	
	
	
}
