package com.example.dicerollgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

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
            public void onClick(View v) {
                Dice.rollDice();
                resultFragment fragment = new resultFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.flFragment, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return v;
    }
}


