package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class POM_For_facebook extends POM_class_facebook {

	//declaration
	
	@FindBy(xpath ="//input[@name='firstname']")private WebElement firstnamebox;
	@FindBy(xpath ="//input[@name='lastname']")private WebElement lastnamebox;
	@FindBy(xpath ="//div[text()='Mobile number or email address']")private WebElement Mobilenumberoremailaddressbox;
	@FindBy(xpath ="//div[text()='New password']")private WebElement Newpasswordbox;
	@FindBy(xpath ="//*[@id='day']")private WebElement daybox;
	@FindBy(xpath ="//*[@id='month']")private WebElement monthbox;
	@FindBy(xpath ="//*[@id='year']")private WebElement yearbox;
	@FindBy(xpath ="//*[text()='Male']")private WebElement malebtn;
	@FindBy(xpath ="//button[@name='websubmit']")private WebElement signupbtn;
	
	//initialization
	
	public POM_For_facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//implementation


	public WebElement getFirstnamebox() {
		
		return firstnamebox;
	}

	public WebElement getLastnamebox() {
		return lastnamebox;
	}

	public WebElement getMobilenumberoremailaddressbox() {
		return Mobilenumberoremailaddressbox;
	}

	public WebElement getNewpasswordbox() {
		return Newpasswordbox;
	}

	public WebElement getDaybox() {
		return daybox;
	}

	public WebElement getMonthbox() {
		return monthbox;
	}

	public WebElement getYearbox() {
		return yearbox;
	}

	public WebElement getMalebtn() {
		return malebtn;
	}

	public WebElement getSignupbtn() {
		return signupbtn;
	}
	
	
}
