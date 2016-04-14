package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsDuplicateTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		ContainsDuplicate test = new ContainsDuplicate();
		int[] nums = {4,5,6,6,7,7};		
		boolean flag = test.containsDuplicate(nums); 
		assertEquals(true,flag);
	}

}
