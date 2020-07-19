package ch02MeaningfulNameTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import ch02MeaningfulName.NamingEx01;

class NamingEx01Test {

	@Test
	void test() {
		NamingEx01 ex01 = new NamingEx01();
		
		List<int[]> input = new ArrayList<int[]>();
	
		input.add(new int[] {4,3,2,1});
		input.add(new int[] {4,6,7,8});
		
		assertEquals(4, ex01.getThem(input).get(0)[0]);
		assertNotEquals(4, ex01.getThem(input).get(0)[1]);
		
		assertEquals(4, ex01.getThem(input).get(1)[0]);
		assertNotEquals(4, ex01.getThem(input).get(1)[1]);
	}
}
