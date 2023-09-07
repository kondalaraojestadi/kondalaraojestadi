package testngannotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FlowofTestAnnotations {

	@BeforeSuite
	public void m1() {
		Reporter.log("Data Base Connection",true);
	}
	
	@BeforeClass
	public void m2() {
		Reporter.log("open the browser",true);
	}
	
	@BeforeMethod
	public void m3() {
		Reporter.log("login application",true);
	}
	
	@Test
	public void testcasse() {
		Reporter.log("main test case",true);
	}
	
	@AfterMethod
	public void m4() {
		Reporter.log("logout application",true);
	}
	@AfterClass
	public void m5() {
		Reporter.log("close the browser",true);
	}
	@AfterSuite
	public void m6() {
		Reporter.log("Data Base Disconnection",true);
	}
}
