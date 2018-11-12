package com.example.huangj.whackamole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class endScreen extends AppCompatActivity {

    TextView finalScore;
    Button restartButton, exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Bye);

        finalScore = (TextView) findViewById(R.id.textView3);
        finalScore.setText(message);
        restartButton = (Button) findViewById(R.id.button4);
        exitButton = (Button) findViewById(R.id.button5);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Restart = new Intent(endScreen.this, MainActivity.class);
                startActivity(Restart);
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int finish = android.os.Process.myPid();
                android.os.Process.killProcess(finish);
            }
        });


    }
}
