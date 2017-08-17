package toby.tic_tac_toe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board implements Markers {
	XO[] squares;
	
	private int[][] winningCombinations = {
			{0,1,2},
			{3,4,5},
			{6,7,8},
			{0,3,6},
			{1,4,7},
			{2,5,8},
			{0,4,8},
			{6,4,2}
	};
	
	Board(Board board) {
		this.squares = board.squares.clone();
	}

	Board() {
		squares = new XO[] { XO.E, XO.E, XO.E, XO.E, XO.E, XO.E, XO.E, XO.E, XO.E };
	}
	
	List<Integer> EmptySquares(){
		List<Integer> freeSquares = new ArrayList<Integer>();
		for(int i=0; i<squares.length; i++)
			if(squares[i]==XO.E) freeSquares.add(i);
		return freeSquares;
	}

	boolean isGameOver(){
		for (int[] combo: winningCombinations)
			if (allSame(combo))
				return true;
		if(!Arrays.asList(squares).contains(XO.E))
				return true;
		return false;
	}

	// winner() assumes the game is over
	XO winner() {
		for (int[] combo: winningCombinations)
			if (allSame(combo))
				return squares[combo[0]];
		return XO.E;
	}
	
	private boolean allSame(int[] combo) {
		boolean isSame = true;
		for(int i=1; i<combo.length; i++)
			isSame = (isSame && (squares[combo[i]]==squares[combo[0]]) && squares[combo[0]]!=XO.E);
		return isSame;
	}
	
}
