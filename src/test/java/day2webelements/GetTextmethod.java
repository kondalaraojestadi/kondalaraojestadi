package day2webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextmethod {

	public static void main(String[] args) throws Throwable {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.actitime.com/");
Thread.sleep(3000);
String text=driver.findElement(By.xpath("//h1[.='Time Tracking Software']")).getText();

System.out.println(text);
	}

}
