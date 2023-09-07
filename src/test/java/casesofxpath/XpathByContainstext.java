package casesofxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByContainstext {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	//open the application
	driver.get("https://demo.actitime.com/login.do");
	//enter the username
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("trainee");
	//enter the password
	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("trainee");
	//click on the login
	driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
}
}
