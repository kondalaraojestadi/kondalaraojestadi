package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitMethod {

	public static void main(String[] args) throws Throwable {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.meesho.com/");
Thread.sleep(5000);

driver.navigate().to("https://www.amazon.in/");
Thread.sleep(5000);

driver.navigate().back();
Thread.sleep(5000);

driver.navigate().forward();
Thread.sleep(5000);

driver.navigate().refresh();

driver.quit();
	}

}
