package toby.tic_tac_toe;

import java.util.ArrayList;
import java.util.List;

class AI implements Markers{

	static Memory Think(XO turnIn, Board boardIn) {

		XO turn = (( turnIn == XO.X ) ? XO.O : XO.X); //Swap turns. turn is now the current turn
		Memory mem = new Memory();
		
		int[] scores;
		if(turn==XO.X) {
			int[] scoreDefaults= {-20,-20,-20,-20,-20,-20,-20,-20,-20}; //This ensures an occupied square is not chosen
			scores = scoreDefaults.clone();
		} else {
			int[] scoreDefaults = {20,20,20,20,20,20,20,20,20};
			scores = scoreDefaults.clone();
		}
		
		List<Integer> EmptySquaresIn = boardIn.EmptySquares();
		
		for (Integer currentSquare:EmptySquaresIn ) {
			Board board = new Board(boardIn);
			List<Integer> freeSquares =  new ArrayList<>(EmptySquaresIn ); // Copy the input free squares
			
			freeSquares.remove(currentSquare); // Remove the current square, square i

			board.squares[currentSquare]=turn;
			if(board.isGameOver()) {
				scores[currentSquare]= getScore(board);
			}else {
				scores[currentSquare] = Think(turn, board).bestScore;				
			}
			board.squares[currentSquare]=XO.E; //Remove from square the placed mark, to place the next
		}
		
		if(turn==XO.X) {
			mem.bestMove = maxIndex(scores);
		} else {
			mem.bestMove = minIndex(scores);
		}
		mem.bestScore = scores[mem.bestMove];
		mem.scorelist = scores.clone();
		return mem;
	}

	//getScore assumes the game is over
	static int getScore(Board board){
		int Ecount = countEmpties(board); //Favor shorter solutions. Max Ecount is 4, so +/-20 never surpassed
		int score = 10+Ecount;
		switch (board.winner()){
			case X: return score;
			case O: return -score;
			default: return 0;
		}
	}
	
	static private int countEmpties(Board board) {
		int Ecount = 0;
		for (XO xo:board.squares)
			if(xo==XO.E) Ecount++;
		return Ecount;
	}
	
	static private int maxIndex(int[] list ) {
		int index=0;
		for(int i=0; i<list.length; i++)
			if(list[i]>list[index])
				index=i;
		return index;
	}
	
	static private int minIndex(int[] list ) {
		int index=0;
		for(int i=0; i<list.length; i++)
			if(list[i]<list[index])
				index=i;
		return index;
	}
}
