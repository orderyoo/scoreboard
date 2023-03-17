package com.example.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Integer counterForUsa = 0;
    Integer counterForCanada = 0;
    private static final String KEY_COUNT = "counter";
    private static final String KEY_COUNT1 = "counter1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, counterForCanada);
        outState.putInt(KEY_COUNT1, counterForUsa);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counterForCanada = savedInstanceState.getInt(KEY_COUNT);
        counterForUsa = savedInstanceState.getInt(KEY_COUNT1);
        TextView textUsa = findViewById(R.id.txt_counterUsa);
        TextView textCanada = findViewById(R.id.txt_counterCanada);
        textUsa.setText(counterForUsa.toString());
        textCanada.setText(counterForCanada.toString());
    }
    public void clickButtonUsa(View view){
        TextView textUsa = findViewById(R.id.txt_counterUsa);
        counterForUsa++;
        textUsa.setText(counterForUsa.toString());
    }
    public void clickButtonCanada(View view){
        counterForCanada++;
        TextView textCanada = findViewById(R.id.txt_counterCanada);
        textCanada.setText(counterForCanada.toString());
    }
    public void clickButtonReset(View view){
        TextView textUsa = findViewById(R.id.txt_counterUsa);
        TextView textCanada = findViewById(R.id.txt_counterCanada);
        counterForCanada = 0;
        textCanada.setText(counterForCanada.toString());
        counterForUsa = 0;
        textUsa.setText(counterForUsa.toString());
    }
}