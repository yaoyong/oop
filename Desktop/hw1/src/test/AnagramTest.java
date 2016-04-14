package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

 
	@Test
	public void test() {
//		fail("Not yet implemented");
		Anagram test = new Anagram();
		boolean flag1 = test.isAnagram("Toss", "Shot");    	
		boolean flag2 = test.isAnagram("nagaram", "anagram"); 
		boolean flag3 = test.isAnagram("keEp", "peeK"); 
		boolean flag4 = test.isAnagram("rat", "car");
        
		assertEquals(false,flag1);
		assertEquals(true,flag2);
		assertEquals(true,flag3);
		assertEquals(false,flag4);
	}

}
