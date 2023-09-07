package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.in/");
       //driver.get("https://accounts.google.com/");
      // driver.get("https://www.facebook.com/");
       driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iqoo mobiles");
       driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
       driver.findElement(By.xpath("//div[@class=\"s-image\"]")).click();
	}

}
