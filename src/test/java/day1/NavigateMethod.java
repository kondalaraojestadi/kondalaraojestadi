package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMethod 
{
	public static void main(String[] args) throws Throwable 
	{
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.navigate().to("https://www.google.com/");
   Thread.sleep(4000);
   
   driver.navigate().to("https://www.flipkart.com/");
   Thread.sleep(4000);

   driver.navigate().back();
   Thread.sleep(4000);

   driver.navigate().forward();
   Thread.sleep(4000);

   driver.navigate().refresh();
   
	}

}
