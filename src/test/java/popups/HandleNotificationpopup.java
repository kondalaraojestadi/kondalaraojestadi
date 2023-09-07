package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleNotificationpopup {
public static void main(String[] args) {
	ChromeOptions c=new ChromeOptions();
	c.addArguments("--disable-notifications");
	c.addArguments("start-maximized");
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver(c);
    driver.get("https://www.hdfcbank.com/");
}
}