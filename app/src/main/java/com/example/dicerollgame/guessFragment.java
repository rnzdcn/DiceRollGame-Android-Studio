package com.example.dicerollgame;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class guessFragment extends Fragment {
    private EditText input;
    private Button rollDiceBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_guess, container, false);

        input = v.findViewById(R.id.userInput);

        rollDiceBtn = v.findViewById(R.id.rollBtn);
        rollDiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dice.rollDice();
            }
        });
        return v;
    }
}