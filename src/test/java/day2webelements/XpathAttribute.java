package day2webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAttribute {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://integrator.actitime.com/auth/at");
	driver.manage().window().maximize();
	//enter valid username
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
	//enter valid password
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	//Get the title
	String actTitle=driver.getTitle();	
	System.out.println(actTitle);
}
}
