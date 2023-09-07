package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownOrListBox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	//open the url page
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//select the dropdown store it in one visible
	WebElement allcatageries=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
	Select sr=new Select(allcatageries);
	sr.selectByVisibleText("Jewellery");
	// click on the search
	driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	
}
}
