package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pageobjectmodel {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	WebElement textb=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	driver.navigate().refresh();
	textb.sendKeys("mobiles");
}
}
