package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	/*driver.get("https://www.google.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\konda\\Desktop\\Screenshot Selenium\\googlepage.png");
	Files.copy(src, destination);*/
	
	driver.get("https://www.amazon.in/");
	TakesScreenshot ts1=(TakesScreenshot)driver;
	File src1=ts1.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\konda\\Desktop\\Screenshot Selenium\\amazonpage.png");
	Files.copy(src1, destination);
	
	
}
}
