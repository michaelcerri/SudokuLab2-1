package pkgGame;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {

	private int iSize;
	private int iSqrtSize;

	public Sudoku(int iSize) throws Exception {

		if (Math.sqrt(iSize) == (int) Math.sqrt(iSize)) {
			this.iSize = iSize;
			this.iSqrtSize = (int) Math.sqrt(iSize);
		} else
			throw new Exception("size must be a perfect square");

	}

	public Sudoku(int[][] puzzle) throws Exception {

		super(puzzle);

		if (Math.sqrt(puzzle.length) == (int) Math.sqrt(puzzle.length)) {
			this.iSize = puzzle.length;
			this.iSqrtSize = (int) Math.sqrt(iSize);
		} else
			throw new Exception("size must be a perfect square");
	}

	protected int[][] getPuzzle() {
		return super.getLatinSquare();
	}

//	protected int[] getRegion(int r) {
//		if (r >= iSize)
//			return null;
//		
//		int[] region = new int[iSize];
//		
//		int CRange = r % iSqrtSize;
//		
//		int RRange = r / iSqrtSize;
//		
//		for (int i = 0; i < iSize; i++) {
//			
//			for (int Col = iSqrtSize * CRange; Col < iSqrtSize * (CRange + 1); Col++) {
//				
//				for (int Row = iSqrtSize * RRange; Row < iSqrtSize * (RRange + 1); Row++) {
//					
//					region[i] = super.LatinSquare[Row][Col];
//				}
//			}
//		}
//		
//		return region;
//	}
//
//	protected int[] getRegion(int iCol, int iRow) {
//		
//		if (iCol >= iSize || iRow >= iSize)
//			return null;
//		
//		int[] region = new int[iSize];
//		
//		int RegionCol = iCol % iSqrtSize;
//		
//		int RegionRow = iRow % iSqrtSize;
//		
//		for (int i = 0; i < iSize; i++) {
//			for (int Col = iSqrtSize * RegionCol; Col < iSqrtSize * (RegionCol + 1); Col++) {
//				for (int Row = iSqrtSize * RegionRow; Row < iSqrtSize * (RegionRow + 1); Row++) {
//					
//					region[i] = super.getPuzzle[Row][Col];
//					
//				}
//			}
//		}
//		
//		return region;
//	}

//	protected boolean isPartialSudoku() {
//		// TODO: modify hasallvalues and hasduplicates to account for 0s
//		// hasduplicates will ignore 0s
//		// hasallvalues will compare each row/column/region against the size of the
//		// sudoku
//
//	}

//	protected boolean isSudoku() {
//		
//		boolean hasAllVals = false;
//		
//		for (int i = 1; i < this.iSize; i++) {
//			if(!super.hasAllValues(getRegion(0), getRegion(i)))
//				return false;
//		}
//		
//		hasAllVals = true;
//			
//		return (hasAllVals && super.isLatinSquare() && !super.ContainsZero());
//	}

//	protected boolean isValidValue(int iCol, int iRow, int iValue) {
//
//	}
}
