package testngannotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class_Sample2 {

	@Test
	public void m4() {
		Reporter.log("m4 method",true);
	}
	
	@Test
	public void m5() {
		Reporter.log("m5 method",true);
	}
	
	@Test
	public void m6() {
		Reporter.log("m6 method",true);
	}
}
