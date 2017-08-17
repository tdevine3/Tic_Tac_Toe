package toby.tic_tac_toe;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toby on 8/16/2017.
 */
public class AITest implements Markers{
    @Test
    public void think() throws Exception {
        Board board = new Board();
        int compMove;

        XO[] setsquares = { XO.E,XO.O,XO.O,
                            XO.E,XO.X,XO.E,
                            XO.E,XO.E,XO.E};
        board.squares = setsquares.clone();
        compMove = (AI.Think(XO.X, board)).bestMove;
        Assert.assertEquals(compMove,0);
        compMove = (AI.Think(XO.O, board)).bestMove;
        Assert.assertEquals(compMove,0);

        XO[] setsquares2 = {  XO.E,XO.E,XO.E,
                              XO.X,XO.X,XO.E,
                              XO.O,XO.E,XO.O};
        board.squares = setsquares2.clone();
        compMove = (AI.Think(XO.X, board)).bestMove;
        Assert.assertEquals(compMove,7);
        compMove = (AI.Think(XO.O, board)).bestMove;
        Assert.assertEquals(compMove,5);

        XO[] setsquares3 = { XO.E,XO.E,XO.E,
                            XO.E,XO.E,XO.E,
                            XO.E,XO.E,XO.E};

        board.squares = setsquares3.clone();
        compMove = (AI.Think(XO.X, board)).bestMove;
        Assert.assertEquals(compMove,4);
        compMove = (AI.Think(XO.O, board)).bestMove;
        Assert.assertEquals(compMove,4);
    }
}