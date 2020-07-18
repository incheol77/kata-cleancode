package ch02MeaningfulNameTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import ch02MeaningfulName.NamingEx01Refactor1;

class NamingEx01Refactor1Test {

	@Test
	void test() {
		NamingEx01Refactor1 ex01 = new NamingEx01Refactor1();
		int FLAGGED = 4;
		
		List<int[]> input = new ArrayList<int[]>();
		
		input.add(new int[] {4,3,2,1});
		input.add(new int[] {4,6,7,8});
		
		List<int[]> flaggedCells = ex01.getFlaggedCells(input);
		
		assertEquals(FLAGGED, flaggedCells.get(0)[0]);
		assertNotEquals(FLAGGED, flaggedCells.get(0)[1]);
		
		assertEquals(FLAGGED, flaggedCells.get(1)[0]);
		assertNotEquals(FLAGGED, flaggedCells.get(1)[1]);
	}
}
