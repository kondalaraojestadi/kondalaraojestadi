package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	WebDriver driver;
@Test
public void openapplication() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@DataProvider
public void login() {
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kondalarao");
}
}
