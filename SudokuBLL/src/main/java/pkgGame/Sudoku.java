package pkgGame;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {

	private int iSize;
	private int iSqrtSize;
	
	private int[][] ls;

	public Sudoku(int iSize) throws Exception {

		if (Math.sqrt(iSize) == (int) Math.sqrt(iSize)) {
			this.iSize = iSize;
			this.iSqrtSize = (int) Math.sqrt(iSize);
		} else
			throw new Exception("size must be a perfect square");

	}

	public Sudoku(int[][] puzzle) throws Exception {

		super(puzzle);

		if (puzzle.length == (int) Math.sqrt(puzzle.length)) {
			this.iSize = puzzle.length;
			this.iSqrtSize = (int) Math.sqrt(iSize);
		} else
			throw new Exception("size must be a perfect square");
	}
	
	public int[][] getPuzzle(){
		return ls;
	}
	
	public int[] getRegion(int iCol, int iRow){
		
	}
	
	public int[] getRegion(int r) {
		
	}
	
	public boolean isPartialSudoku() {
		
	}
	
	public boolean isSudoku() {
		
	}
	
	public boolean isValidValue(int iCol, int iRow, int iValue) {
		
	}
}
