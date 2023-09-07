package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseMethod {

	public static void main(String[] args) throws Throwable {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.meesho.com/");
Thread.sleep(4000);
driver.close();
		System.out.println("This is my program");
	}

}
