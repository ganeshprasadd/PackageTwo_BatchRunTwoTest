package PackageTwo;

import org.testng.annotations.Test;

public class BatchRunTwoTest {
	
	@Test
	public void pushBatchRunTwoTest() {
		
		System.out.println("Method belong to Project 2 - firtst method Batch Second Run");
	}

	@Test 
	public void pushBatchRunTwoMethodTest() {
		
		System.out.println("Method belong to Project 2 - second method Batch Second Run");
	}
	
	//making changes and uploading to git.
	//after making changes the build shld be autotriggred and Poll Scm should pick it up. 

}
