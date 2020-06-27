package ch02MeaningfulName;

import java.util.ArrayList;
import java.util.List;

public class NamingEx01Refactor1 {
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
	public List<int[]> getFlaggedCells(List<int[]> gameBoard) {
		List<int[]> flaggedCells = new ArrayList<int[]>();

		for (int[] cell : gameBoard) {
			if (cell[STATUS_VALUE] == FLAGGED) {
				flaggedCells.add(cell);
			}
		}
		return flaggedCells;
	}
}
