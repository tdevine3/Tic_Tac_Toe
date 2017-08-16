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
        final ImageView X1 = (ImageView) findViewById(R.id.x1);


        final Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                tv.setText(R.string.winnerx);
                X1.setVisibility(View.VISIBLE);
            }
        });
        final Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                tv.setText(R.string.winnero);
            }
        });
        final Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                tv.setText(R.string.winnerx);
            }
        });
        final Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                tv.setText(R.string.winnero);
            }
        });
        final Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                tv.setText(R.string.winnerx);
            }
        });
        final Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                tv.setText(R.string.winnero);
            }
        });
        final Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                tv.setText(R.string.winnerx);
            }
        });
        final Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                tv.setText(R.string.winnero);
            }
        });
        final Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setVisibility(View.VISIBLE);
                tv.setText(R.string.winnerx);
            }
        });
    }
}
