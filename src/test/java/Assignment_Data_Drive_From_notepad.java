import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Data_Drive_From_notepad {
public static void main(String[] args) throws Throwable {
	File fis=new File("D:\\Automation\\AutomationExamples\\kondal.provider\\creditionaldata");
	FileInputStream f=new FileInputStream(fis);
	Properties p=new Properties();
	p.load(f);
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	String url=p.getProperty("URL");
	driver.get(url);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys(p.getProperty("UN"));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@name='pwd']")).sendKeys(p.getProperty("PWD"));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(3000);
	String Title=driver.getTitle();
	System.out.println(Title);
	String expectTitle="actiTIME - Enter Time-Track";
	String actualTitle=driver.getTitle();
	if(actualTitle.equals(expectTitle)) {
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Test case is Fail");
	}
}
}
