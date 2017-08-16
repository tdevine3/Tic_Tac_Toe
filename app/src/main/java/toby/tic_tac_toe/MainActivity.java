package toby.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView tv = (TextView) findViewById(R.id.WinningMessage);
        final Button button1 = (Button)findViewById(R.id.button1);
        final Button button2 = (Button)findViewById(R.id.button2);
        final Button button3 = (Button)findViewById(R.id.button3);
        final Button button4 = (Button)findViewById(R.id.button4);
        final Button button5 = (Button)findViewById(R.id.button5);
        final Button button6 = (Button)findViewById(R.id.button6);
        final Button button7 = (Button)findViewById(R.id.button7);
        final Button button8 = (Button)findViewById(R.id.button8);
        final Button button9 = (Button)findViewById(R.id.button9);

        final ImageView X1 = (ImageView) findViewById(R.id.x1);
        final ImageView X2 = (ImageView) findViewById(R.id.x2);
        final ImageView X3 = (ImageView) findViewById(R.id.x3);
        final ImageView X4 = (ImageView) findViewById(R.id.x4);
        final ImageView X5 = (ImageView) findViewById(R.id.x5);
        final ImageView X6 = (ImageView) findViewById(R.id.x6);
        final ImageView X7 = (ImageView) findViewById(R.id.x7);
        final ImageView X8 = (ImageView) findViewById(R.id.x8);
        final ImageView X9 = (ImageView) findViewById(R.id.x9);

        final ImageView O1 = (ImageView) findViewById(R.id.o1);
        final ImageView O2 = (ImageView) findViewById(R.id.o2);
        final ImageView O3 = (ImageView) findViewById(R.id.o3);
        final ImageView O4 = (ImageView) findViewById(R.id.o4);
        final ImageView O5 = (ImageView) findViewById(R.id.o5);
        final ImageView O6 = (ImageView) findViewById(R.id.o6);
        final ImageView O7 = (ImageView) findViewById(R.id.o7);
        final ImageView O8 = (ImageView) findViewById(R.id.o8);
        final ImageView O9 = (ImageView) findViewById(R.id.o9);

        final Button resetButton = (Button) findViewById(R.id.resetbutton);


        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Reset();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                X1.setVisibility(View.VISIBLE);
                button1.setVisibility(View.INVISIBLE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                button2.setVisibility(View.INVISIBLE);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                button3.setVisibility(View.INVISIBLE);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                button4.setVisibility(View.INVISIBLE);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                button5.setVisibility(View.INVISIBLE);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                button6.setVisibility(View.INVISIBLE);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                button7.setVisibility(View.INVISIBLE);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                button8.setVisibility(View.INVISIBLE);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                button9.setVisibility(View.INVISIBLE);
            }
        });


    }
    private void Reset () {

        findViewById(R.id.x1).setVisibility(View.INVISIBLE);
        findViewById(R.id.x2).setVisibility(View.INVISIBLE);
        findViewById(R.id.x3).setVisibility(View.INVISIBLE);
        findViewById(R.id.x4).setVisibility(View.INVISIBLE);
        findViewById(R.id.x5).setVisibility(View.INVISIBLE);
        findViewById(R.id.x6).setVisibility(View.INVISIBLE);
        findViewById(R.id.x7).setVisibility(View.INVISIBLE);
        findViewById(R.id.x8).setVisibility(View.INVISIBLE);
        findViewById(R.id.x9).setVisibility(View.INVISIBLE);

        findViewById(R.id.o1).setVisibility(View.INVISIBLE);
        findViewById(R.id.o2).setVisibility(View.INVISIBLE);
        findViewById(R.id.o3).setVisibility(View.INVISIBLE);
        findViewById(R.id.o4).setVisibility(View.INVISIBLE);
        findViewById(R.id.o5).setVisibility(View.INVISIBLE);
        findViewById(R.id.o6).setVisibility(View.INVISIBLE);
        findViewById(R.id.o7).setVisibility(View.INVISIBLE);
        findViewById(R.id.o8).setVisibility(View.INVISIBLE);
        findViewById(R.id.o9).setVisibility(View.INVISIBLE);

        findViewById(R.id.button1).setVisibility(View.VISIBLE);
        findViewById(R.id.button2).setVisibility(View.VISIBLE);
        findViewById(R.id.button3).setVisibility(View.VISIBLE);
        findViewById(R.id.button4).setVisibility(View.VISIBLE);
        findViewById(R.id.button5).setVisibility(View.VISIBLE);
        findViewById(R.id.button6).setVisibility(View.VISIBLE);
        findViewById(R.id.button7).setVisibility(View.VISIBLE);
        findViewById(R.id.button8).setVisibility(View.VISIBLE);
        findViewById(R.id.button9).setVisibility(View.VISIBLE);


//reset AI as well

    }
}
