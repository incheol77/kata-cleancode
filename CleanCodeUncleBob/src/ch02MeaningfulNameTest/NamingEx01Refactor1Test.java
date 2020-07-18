package ch02MeaningfulNameTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import ch02MeaningfulName.NamingEx01Origin;

class NamingEx01Refactor1Test {

	@Test
	void test() {
		NamingEx01Origin ex01 = new NamingEx01Origin();
		
		List<int[]> input = new ArrayList<int[]>();
		int[] vals1 = {4,3,2,1};
		int[] vals2 = {4,6,7,8};
		int[] res = {4};
		input.add(vals1);
		input.add(vals2);
		
		assertEquals(res[0], ex01.getThem(input).get(0)[0]);
		assertNotEquals(res[0], ex01.getThem(input).get(0)[1]);
		
		assertEquals(res[0], ex01.getThem(input).get(1)[0]);
		assertNotEquals(res[0], ex01.getThem(input).get(1)[1]);
	}
}
