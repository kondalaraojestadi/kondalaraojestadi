package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example3 {
@Test
public void tc7() {
	Reporter.log("vlg",true);
}
@Test
public void tc8() {
	Reporter.log("md",true);
}
@Test
public void tc9() {
	Reporter.log("dt",true);
}
}
