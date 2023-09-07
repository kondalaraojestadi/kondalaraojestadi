package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
@Test(priority=1)
public void Test1() {
	Reporter.log("login to facebook application",true);
}
@Test(timeOut=5000)
public void Test2() {
	Reporter.log("Go to Home page",true);
}
@Test(enabled=false)
public void Test3() {
	Reporter.log("logout facebook application",true);
}
}
