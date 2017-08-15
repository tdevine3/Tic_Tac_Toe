package toby.tic_tac_toe;

public class Play {
	enum XO {X, O, E};

	public static void main(String[] args) {
		XO turn = XO.X;
		Board board = new Board();
		XO[] boardTest = {	XO.E,XO.X,XO.E,
							XO.X,XO.E,XO.E,
							XO.O,XO.E,XO.E
							};
		board.squares = boardTest.clone(); 
		Memory aThought = AI.Think(turn,board);
		System.out.println("The computer moves to square: "+Integer.toString(aThought.bestMove));
	}
	
}
