package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority=1)
public void Tc1() {
	Reporter.log("login to application",true);
}
@Test(priority=2)
public void Tc2() {
	Reporter.log("open the Home page",true);
}
@Test(priority=3)
public void Tc3() {
	Reporter.log("logout from application",true);
}
}
