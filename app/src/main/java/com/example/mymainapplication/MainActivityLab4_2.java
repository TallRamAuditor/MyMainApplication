package com.example.mymainapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityLab4_2 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, SecondMainActivity.class);
        startActivity(intent);
    }
}

