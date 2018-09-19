package pkgGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuTest {

	@Test(expected = Exception.class)
	public void constructorTest1() throws Exception {

		Sudoku sud = new Sudoku(3);

	}

	@Test
	public void constructorTest2() throws Exception {

		Sudoku sud = new Sudoku(9);

	}

	@Test(expected = Exception.class)
	public void constructorTest3() throws Exception {

		int[][] test = new int[3][3];

		Sudoku sud = new Sudoku(test);
	}

	@Test
	public void constructorTest4() throws Exception {

		int[][] test = new int[4][4];

		Sudoku sud = new Sudoku(test);
	}

}
