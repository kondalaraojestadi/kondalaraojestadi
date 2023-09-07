import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {
public static void main(String[] args) throws Throwable {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("kanthara");
	Thread.sleep(3000);
	List<WebElement> Alloptions=driver.findElements(By.xpath("//*[@class='eIPGRd']"));
	for(WebElement oneelement:Alloptions) {
		String text=oneelement.getText();
		System.out.println(text);
		Thread.sleep(2000);
		if(text.contains("kantara naa songs")) {
			oneelement.click();
			break;
		}
		
	}
}
}
