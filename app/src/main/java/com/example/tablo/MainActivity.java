package com.example.tablo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Integer counterSpi = 0;
    private Integer counterPSG = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonSpir(View view){
        counterSpi=counterSpi+1;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counterSpi.toString());}
    public void onButtonPSG(View view){
        counterPSG=counterPSG+1;
        TextView counterView = findViewById(R.id.txt_counter2);
        counterView.setText(counterPSG.toString());

    }
    public void onButtonSbros(View view){
        counterSpi = 0;
        counterPSG = 0;
        TextView counterView = findViewById(R.id.txt_counter);
        TextView counterView2 = findViewById(R.id.txt_counter2);
        counterView.setText(counterSpi.toString());
        counterView2.setText(counterPSG.toString());
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counterSpi", counterSpi);
        outState.putInt("counterPSG", counterPSG);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("counterSpi")) {
            counterSpi = savedInstanceState.getInt("counterSpi");
        }
        ((TextView) findViewById(R.id.txt_counter)).setText(counterSpi.toString());
        if (savedInstanceState != null && savedInstanceState.containsKey("counterPSG")) {
            counterPSG = savedInstanceState.getInt("counterPSG");
        }
        ((TextView) findViewById(R.id.txt_counter2)).setText(counterPSG.toString());
    }

    }

