package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
@Test
public void Test1() {
	String s="Hi";
	String ss="Hello";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(s, ss);
	Reporter.log("Hello 1st verification",true);
	soft.assertAll();
}
}
