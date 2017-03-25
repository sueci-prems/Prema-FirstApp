package com.example.ctadmin.prema_firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView mytextView = (TextView) findViewById(R.id.textView);
                mytextView.setText("Be Sarcastic Always!");
            }
        });
        Button gotoButton = (Button) findViewById(R.id.button2);
        gotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(gotoIntent);            }        });

    }}