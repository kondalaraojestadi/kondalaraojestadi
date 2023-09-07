package day2webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys {

	public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.in/");
     driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("oneplus mobiles");
     driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
     
	}

}
