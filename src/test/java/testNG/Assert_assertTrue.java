package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_assertTrue {
@Test
public void test() {
	Reporter.log("Running test method",true);
	boolean act=true;
	Assert.assertTrue(act);
}
}
