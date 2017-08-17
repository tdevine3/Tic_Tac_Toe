package toby.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Markers{

    Button[] buttons = new Button [9]; //initialize arrays
    ImageView [] Xs = new ImageView[9];
    ImageView [] Os = new ImageView[9];

    XO turn = XO.X;
    Board board = new Board();
    TextView wm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wm =  (TextView) findViewById(R.id.WinningMessage);
        final Button resetButton = (Button) findViewById(R.id.resetbutton);

// put in loop
        buttons[0] = (Button)findViewById(R.id.button1); //shifted one
        buttons[1] = (Button)findViewById(R.id.button2);
        buttons[2] = (Button)findViewById(R.id.button3);
        buttons[3] = (Button)findViewById(R.id.button4);
        buttons[4] = (Button)findViewById(R.id.button5);
        buttons[5] = (Button)findViewById(R.id.button6);
        buttons[6] = (Button)findViewById(R.id.button7);
        buttons[7] = (Button)findViewById(R.id.button8);
        buttons[8] = (Button)findViewById(R.id.button9);

        Xs[0] = (ImageView)findViewById(R.id.x1);
        Xs[1] = (ImageView)findViewById(R.id.x2);
        Xs[2] = (ImageView)findViewById(R.id.x3);
        Xs[3] = (ImageView)findViewById(R.id.x4);
        Xs[4] = (ImageView)findViewById(R.id.x5);
        Xs[5] = (ImageView)findViewById(R.id.x6);
        Xs[6] = (ImageView)findViewById(R.id.x7);
        Xs[7] = (ImageView)findViewById(R.id.x8);
        Xs[8] = (ImageView)findViewById(R.id.x9);

        Os[0] = (ImageView)findViewById(R.id.o1);
        Os[1] = (ImageView)findViewById(R.id.o2);
        Os[2] = (ImageView)findViewById(R.id.o3);
        Os[3] = (ImageView)findViewById(R.id.o4);
        Os[4] = (ImageView)findViewById(R.id.o5);
        Os[5] = (ImageView)findViewById(R.id.o6);
        Os[6] = (ImageView)findViewById(R.id.o7);
        Os[7] = (ImageView)findViewById(R.id.o8);
        Os[8] = (ImageView)findViewById(R.id.o9);




        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Reset();
            }
        });

        for (int i=0; i<=8; i++) {
            final int j = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    move(j);
                }
            });
        }
    }

    private void move(int j){
        buttons[j].setVisibility(View.INVISIBLE);
        Xs[j].setVisibility(View.VISIBLE);
        board.squares[j]=XO.X;

        if (board.isGameOver()){
            XO w=board.winner();
            wm.setText(w.toString()+" wins!");
            wm.setVisibility(View.VISIBLE);
        }else {

            Memory aThought = AI.Think(turn, board);
            int compMove = aThought.bestMove;
            Os[compMove].setVisibility(View.VISIBLE);
            buttons[compMove].setVisibility(View.INVISIBLE);
            board.squares[compMove] = XO.O;

            if (board.isGameOver()) {
                XO w = board.winner();
                wm.setText(w.toString() + " wins!");
                wm.setVisibility(View.VISIBLE);
            }
        }
    }

    private void Reset () {

        Button[] buttons = new Button [9];
        int[] xs = {R.id.x1, R.id.x2, R.id.x3, R.id.x4, R.id.x5, R.id.x6, R.id.x7, R.id.x8, R.id.x9};
        int[] os = {R.id.o1, R.id.o2, R.id.o3, R.id.o4, R.id.o5, R.id.o6, R.id.o7, R.id.o8, R.id.o9};
        int[] bs = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9};

        for (int i=0; i<=8; i++){
            findViewById(xs[i]).setVisibility(View.INVISIBLE);
            findViewById(os[i]).setVisibility(View.INVISIBLE);
            findViewById(bs[i]).setVisibility(View.VISIBLE);
        }


        XO[] resetSquares = new XO[] { XO.E, XO.E, XO.E, XO.E, XO.E, XO.E, XO.E, XO.E, XO.E };
        this.board.squares = resetSquares.clone();

        findViewById(R.id.WinningMessage).setVisibility(View.INVISIBLE);
        wm.setVisibility(View.INVISIBLE);

    }

}
