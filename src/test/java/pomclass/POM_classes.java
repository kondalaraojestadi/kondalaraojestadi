package pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_classes {
	//declaration
	
		@FindBy(xpath = "//input[@id='username']")private WebElement untextbox;
		@FindBy(xpath = "//input[@name='pwd']")private WebElement pwdtextbox;
		@FindBy(xpath = "//div[text()='Login ']")private WebElement loginbtn;
		
		//initialization
		
		public POM_classes(){
		
		
		}

		//implementation
		public WebElement getUntextbox() {
			return untextbox;
		}

		public WebElement getPwdtextbox() {
			
			return pwdtextbox;
		}

		public WebElement getLoginbtn() {
			return loginbtn;
		}
		
}
