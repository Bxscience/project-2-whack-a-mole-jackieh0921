package com.example.huangj.whackamole;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;

public class ThreebyFour extends AppCompatActivity {

    ImageButton[] mole = new ImageButton[12];
    TextView timer, score;
    int scoreCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threeby_four);

        mole[0] = (ImageButton) findViewById(R.id.imageButton20);
        mole[1] = (ImageButton) findViewById(R.id.imageButton19);
        mole[2] = (ImageButton) findViewById(R.id.imageButton16);
        mole[3] = (ImageButton) findViewById(R.id.imageButton17);
        mole[4] = (ImageButton) findViewById(R.id.imageButton11);
        mole[5] = (ImageButton) findViewById(R.id.imageButton2);
        mole[6] = (ImageButton) findViewById(R.id.imageButton);
        mole[7] = (ImageButton) findViewById(R.id.imageButton7);
        mole[8] = (ImageButton) findViewById(R.id.imageButton8);
        mole[9] = (ImageButton) findViewById(R.id.imageButton6);
        mole[10] = (ImageButton) findViewById(R.id.imageButton3);
        mole[11] = (ImageButton) findViewById(R.id.imageButton4);
        timer = (TextView) findViewById(R.id.textView);
        score = (TextView) findViewById(R.id.textView4);
        for (int i = 0; i < 12; i++) {
            mole[i].setVisibility(View.INVISIBLE);
        }
        new CountDownTimer(60000, 1000) {
            public void onTick(long timeLeft) {
                timer.setText("" + timeLeft/1000);
                if (timeLeft / 1000 % 3 == 0) {
                    for (int i = 0; i < mole.length; i++)
                        mole[i].setVisibility(View.INVISIBLE);
                    Random rand = new Random();
                    int a = rand.nextInt(12);
                    mole[a].setVisibility(View.VISIBLE);
                }
            }

            public void onFinish() {

                {
                    gameOver();
                }


            }
        }.start();
    }

    public void gameOver(){
        Intent congratulations = new Intent(this, endScreen.class);
        String statement = score.getText().toString();
        congratulations.putExtra(MainActivity.Bye, statement);
        startActivity(congratulations);
    }
    public void onClick(View view) {
        for ( int i = 0; i < mole.length; i++){
            mole[i].setVisibility(View.INVISIBLE);}
            scoreCount++;
            score.setText("Score: " + scoreCount);

    }
}


