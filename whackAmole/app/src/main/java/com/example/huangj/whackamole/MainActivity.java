package com.example.huangj.whackamole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String Bye = "goodbye";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start2x3(View view) {
        Intent i = new Intent(this, twobythree.class);
        startActivity(i);
    }
    public void start3x4(View view) {
        Intent j = new Intent(this, ThreebyFour.class);
        startActivity(j);
    }
    public void start4x5(View view) {
        Intent k = new Intent(this, fourbyfive.class);
        startActivity(k);
    }



    }



