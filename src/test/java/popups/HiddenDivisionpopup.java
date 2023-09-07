package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionpopup {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com"); //Hidden division popup
	//driver.get("https://www.hdfcbank.com/"); Notification popup
	driver.findElement(By.xpath("//button[text()='✕']")).click();
}
}
