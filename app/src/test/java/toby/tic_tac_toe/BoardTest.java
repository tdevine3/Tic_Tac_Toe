package toby.tic_tac_toe;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Toby on 8/16/2017.
 */
public class BoardTest implements Markers {
    @Test
    public void emptySquares() throws Exception {

        Board board = new Board();
        XO[] setsquares = {XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E};
        board.squares = setsquares.clone();
        List<Integer> emptysquares = board.EmptySquares();
        Integer[] es = {0,1,2,3,4,5,6,7,8};
        List<Integer> expectedemptysquares = Arrays.asList(es);
        Assert.assertEquals(emptysquares,expectedemptysquares);


        Board board2 = new Board();
        XO[] setsquares2 = {XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E};
        board.squares = setsquares2.clone();
        List<Integer> emptysquares2 = board.EmptySquares();
        Integer[] es2 = {0,1,2,3,4,5,6,7,8};
        List<Integer> expectedemptysquares2 = Arrays.asList(es2);
        Assert.assertEquals(emptysquares2,expectedemptysquares2);
    }

    @Test
    public void isGameOver() throws Exception {
        Board board = new Board();
        XO[] setsquares = {XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E};
        board.squares = setsquares.clone();
        Assert.assertEquals(board.isGameOver(),false);

        XO[] setsquares2 = {XO.E,XO.O,XO.O,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E};
        board.squares = setsquares2.clone();
        Assert.assertEquals(board.isGameOver(),false);

        XO[] setsquares3 = {XO.O,XO.O,XO.O,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E};
        board.squares = setsquares3.clone();
        Assert.assertEquals(board.isGameOver(),true);

        XO[] setsquares4 = {XO.O,XO.X,XO.O,XO.O,XO.X,XO.X,XO.X,XO.O,XO.X};
        board.squares = setsquares4.clone();
        Assert.assertEquals(board.isGameOver(),true);

        XO[] setsquares5 = {XO.O,XO.O,XO.X,XO.E,XO.X,XO.E,XO.X,XO.E,XO.E};
        board.squares = setsquares5.clone();
        Assert.assertEquals(board.isGameOver(),true);

    }

    @Test
    public void winner() throws Exception {
        Board board = new Board();
        XO[] setsquares = {XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E};
        board.squares = setsquares.clone();
        Assert.assertEquals(board.winner()==XO.E,true);

        XO[] setsquares2 = {XO.E,XO.O,XO.O,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E};
        board.squares = setsquares2.clone();
        Assert.assertEquals(board.winner()==XO.E,true);

        XO[] setsquares3 = {XO.O,XO.O,XO.O,XO.E,XO.E,XO.E,XO.E,XO.E,XO.E};
        board.squares = setsquares3.clone();
        Assert.assertEquals(board.winner()==XO.O,true);

        XO[] setsquares4 = {XO.O,XO.X,XO.O,XO.O,XO.X,XO.X,XO.X,XO.O,XO.X};
        board.squares = setsquares4.clone();
        Assert.assertEquals(board.winner()==XO.E,true);

        XO[] setsquares5 = {XO.O,XO.O,XO.X,XO.E,XO.X,XO.E,XO.X,XO.E,XO.E};
        board.squares = setsquares5.clone();
        Assert.assertEquals(board.winner()==XO.X,true);
    }

}