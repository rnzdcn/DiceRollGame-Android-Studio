package com.example.dicerollgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guessFragment guessFragment = new guessFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flFragment, guessFragment).commit();



    }
}