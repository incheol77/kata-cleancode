package ch02MeaningfulName;

public class Cell {
	private static final int STATUS_VALUE = 0;
	private static final int FLAGGED = 4;
	
	private int[] cell;
	
	public Cell(int[] arr) {
		this.cell = arr;
	}
	
	public int[] getCell() {
		return this.cell;
	}
	
	public int getStatusCell() {
		return this.cell[0];
	}
	
	public boolean isFlagged(Cell cell) {
		return this.cell[STATUS_VALUE] == FLAGGED;
	}	
}
