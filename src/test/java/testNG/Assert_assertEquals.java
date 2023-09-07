package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_assertEquals {
@Test
public void test() {
	Reporter.log("Running test method",true);
	String actR="Hi";
	String expR="Hi";
	Assert.assertEquals(actR, expR);
	
}
}
