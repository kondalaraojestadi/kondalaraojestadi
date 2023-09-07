package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_SignIn {
public static void main(String[] args) throws Throwable {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/reg/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kondalarao");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("jestadi");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kondalaraojestadi@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("kondalaraojestadi@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Kondal@123");
	Thread.sleep(3000);
	
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	Select Day=new Select(day);
	Day.selectByIndex(14);
	Thread.sleep(3000);
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	Select Month=new Select(month);
	Month.selectByIndex(7);
	Thread.sleep(3000);
	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	Select Year=new Select(year);
	Year.selectByVisibleText("1998");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	
}
}
