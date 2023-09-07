package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_assertNotEquals {
@Test
public void test() {
	Reporter.log("Running test method",true);
	String act="hi";
	String exp="h";
	Assert.assertNotEquals(act, exp);
}
}
