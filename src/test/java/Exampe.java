import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exampe {
public static void main(String[] args) throws Throwable {
	WebDriverManager.operadriver().setup();
	WebDriver driver=new OperaDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("gmail");
	Thread.sleep(2000);
	List<WebElement> alloptions=driver.findElements(By.xpath("//*[@class='pcTkSc']"));
	Thread.sleep(2000);
	for(WebElement oneelement:alloptions) {
	String text=oneelement.getText();
	System.out.println(text);
	if(text.contains("gmail sign up")) {
		oneelement.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Google Accounts: Sign in']")).click();

	}
	}
}
}
