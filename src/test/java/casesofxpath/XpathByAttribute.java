package casesofxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByAttribute {
public static void main(String[] args) throws Throwable {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//Enter valid username
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	Thread.sleep(3000);
	//Enter valid password
	driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
	Thread.sleep(3000);
	//Get Login home page
	driver.findElement(By.linkText("Login")).click();
	String expTitle="actiTIME - Login";
	String actTitle=driver.getTitle();
	System.out.println(actTitle);
	if(actTitle.equals(expTitle)){
		System.out.println("Text case is PASS open The Home page");
	}
	else {
		System.out.println("Test case is FAIL");
	}
}
}
