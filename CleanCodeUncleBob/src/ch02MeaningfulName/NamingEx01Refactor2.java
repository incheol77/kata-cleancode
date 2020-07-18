package ch02MeaningfulName;

import java.util.ArrayList;
import java.util.List;

public class NamingEx01Refactor2 {
	private static final int STATUS_VALUE = 0;
	private static final int FLAGGED = 4;

	// Q1 : What is in 'theList'?
	//		-> 'theList' is a data structure for game board
	// Q2 : Why is the 0th value in 'theList' important?
	//		-> means the status of each cell 
	// Q3 : What does value 4 mean?
	//		-> means the status of flagged 
	// Q4 : How do I use list1 returned by the function?
	//		-> use as a list or class
	public List<Cell> getFlaggedCells(List<Cell> gameBoard) {
		List<Cell> flaggedCells = new ArrayList<Cell>();

		for (Cell cell : gameBoard) {
			if (cell.isFlagged(cell)) {
				flaggedCells.add(cell);
			}
		}
		return flaggedCells;
	}

	public class Cell {
		private int[] cell;
		
		public boolean isFlagged(Cell cell) {
			return this.cell[STATUS_VALUE] == FLAGGED;
		}	
	}
}
