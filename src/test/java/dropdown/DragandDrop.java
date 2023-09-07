package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
  driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
 WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
 WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
 Actions act=new Actions(driver);
 act.dragAndDrop(src, target).perform();
	
}
}
