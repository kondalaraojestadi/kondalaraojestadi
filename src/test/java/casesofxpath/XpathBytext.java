package casesofxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathBytext {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	//Enter the username
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("trainee");
	//Enter the password
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("trainee");
	//click the login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	String expTitle="actiTIME - Login";
	String actTitle=driver.getTitle();
	System.out.println(actTitle);
	if(actTitle.equals(expTitle)){
		System.out.println("Test case is PASS open the Home page");
	}
	else {
		System.out.println("Test case FAIL");
	}
}
}
