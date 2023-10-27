package com.example.mymainapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivityLab4_2 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab4_3_activity_main2);
    }
    /*public void onClick(View view) {
        Intent intent = new Intent(this, SecondMainActivity.class);
        startActivity(intent);
    }*/
   /* public void onClick(View v) {
        EditText nameText = findViewById(R.id.name);
        EditText companyText = findViewById(R.id.company);
        EditText ageText = findViewById(R.id.age);
        String name = nameText.getText().toString();
        String company = companyText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());
        Intent intent = new Intent(this, SecondMainActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("company", company);
        intent.putExtra("age", age);
        startActivity(intent);
    }*/
    public void onClick(View v) {
        EditText nameText = findViewById(R.id.name);
        EditText companyText = findViewById(R.id.company);
        EditText ageText = findViewById(R.id.age);
        String name = nameText.getText().toString();
        String company = companyText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());
        User user = new User(name, company, age);
        Intent intent = new Intent(this, SecondMainActivity.class);
        intent.putExtra(User.class.getSimpleName(), user);
        startActivity(intent);
    }

}

