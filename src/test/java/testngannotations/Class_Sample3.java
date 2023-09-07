package testngannotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class_Sample3 {

	@Test
	public void m7() {
		Reporter.log("m7 method",true);
	}
	
	@Test
	public void m8() {
		Reporter.log("m8 method",true);
		
	}
	
	@Test
	public void m9() {
		Reporter.log("m9 method",true);
	}
}
