package day8;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTesting {

	@BeforeMethod
	public void beforeMethos() {
		System.out.println("Executes before a Method");
	}
	
	
	@Test(priority=-1)
	public void testcase1() {
		System.out.println("Test case 1 ...");
		
	}
	
	@Test(priority=1)
	public void testcase2() {
		System.out.println("Test case 2 ...");
		
	}
	@Test(priority=0, enabled = false)
	public void testcase3() {
		System.out.println("Test case 3 ...");
		
	}
	@Test(priority=-1)
	public void testcase4() {
		System.out.println("Test case 4 ...");
		
	}
	
	
}
