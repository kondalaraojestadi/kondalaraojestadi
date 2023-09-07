package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {
@Test(invocationCount=15)
public void Testcase() {
	Reporter.log("Facebook",true);
}
}
