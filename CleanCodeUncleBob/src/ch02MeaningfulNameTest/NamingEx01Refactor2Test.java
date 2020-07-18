package ch02MeaningfulNameTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ch02MeaningfulName.Cell;
import ch02MeaningfulName.NamingEx01Refactor1;
import ch02MeaningfulName.NamingEx01Refactor2;

class NamingEx01Refactor2Test {

	@Test
	void test() {
		NamingEx01Refactor2 ex01 = new NamingEx01Refactor2();
		int FLAGGED = 4;
		
		List<Cell> input = new ArrayList<Cell>();
		Cell vals1 = new Cell(new int[] {4,3,2,1});
		Cell vals2 = new Cell(new int[] {4,6,7,8});
		
		input.add(vals1);
		input.add(vals2);
		
		List<Cell> flaggedCells = ex01.getFlaggedCells(input);
		
		assertEquals(FLAGGED, flaggedCells.get(0).getStatusCell());
		assertEquals(FLAGGED, flaggedCells.get(1).getStatusCell());
	}
}
