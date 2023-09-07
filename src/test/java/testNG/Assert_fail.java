package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
@Test
public void test() {
	Reporter.log("Running test method",true);
	Assert.fail();
	System.out.println("test is failed");
}
@Test
public void test1() {
	Reporter.log("Running test1 method",true);
	
}
}
