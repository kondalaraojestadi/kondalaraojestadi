package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	driver.switchTo().frame("packageListFrame");
	String data=driver.findElement(By.xpath("//h2[@title='Packages']")).getText();
	System.out.println(data);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	String data1=driver.findElement(By.xpath("//h1[@class='bar']")).getText();
	System.out.println(data1);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	String data2=driver.findElement(By.xpath("//span[text()='Packages']")).getText();
	System.out.println(data2);

}
}
