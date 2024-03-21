package com.example.tictactoelab7_8ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private boolean enabled = true;
    private String winner = " ";
    private char turn = 'X';
    private char[] chans = new char[9];

    private TextView label;

    private ArrayList<TextView> labs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label = findViewById(R.id.label);

        TextView label1 = findViewById(R.id.label1);
        TextView label2 = findViewById(R.id.label2);
        TextView label3 = findViewById(R.id.label3);
        TextView label4 = findViewById(R.id.label4);
        TextView label5 = findViewById(R.id.label5);
        TextView label6= findViewById(R.id.label6);
        TextView label7 = findViewById(R.id.label7);
        TextView label8 = findViewById(R.id.label8);
        TextView label9 = findViewById(R.id.label9);






    }
}