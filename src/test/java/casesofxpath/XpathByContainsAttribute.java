package casesofxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByContainsAttribute {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	//open the application 
	driver.get("https://demo.actitime.com/login.do");
	//Enter user name
	driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	//Enter the password
	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	//click on the login
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	String epxTitle="actiTIME - Login";
	String actTitle=driver.getTitle();
	System.out.println(actTitle);
	if(actTitle.equals(epxTitle)) {
		System.out.println("Test case PASS open the Home page");
	}
	else{
		System.out.println("Test cate i FAIL");
	}
}
}
