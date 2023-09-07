package testngannotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class_Sample1 {

	@Test
	public void m1() {
		Reporter.log("m1 method",true);
	}
	
	@Test
	public void m2() {
		Reporter.log("m2 method",true);
	}
	
	@Test
	public void m3() {
		Reporter.log("m3 method",true);
	}
}
