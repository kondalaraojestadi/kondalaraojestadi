package keysclass;

import javax.security.auth.kerberos.KeyTab;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	//driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
}
}
