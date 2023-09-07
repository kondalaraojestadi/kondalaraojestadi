package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {
public static void main(String[] args) throws Throwable {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Thread.sleep(4000);
	//click on ok button of alert popup
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	String source=driver.switchTo().alert().getText();
	System.out.println(source);
	
	
}
}
