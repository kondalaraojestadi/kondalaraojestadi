package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example2 {
@Test
public void tc4() {
	Reporter.log("ap",true);
}
@Test
public void tc5() {
	Reporter.log("ts",true);
}
@Test
public void tc6() {
	Reporter.log("tn",true);
}
}
