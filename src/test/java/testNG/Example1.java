package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1 {
@Test
public void tc1() {
	Reporter.log("hi..",true);
}
@Test
public void tc2() {
	Reporter.log("hello..",true);
}
@Test
public void tc3() {
	Reporter.log("how..",true);
}
}
