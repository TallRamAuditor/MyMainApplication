package com.example.mymainapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivityLab3_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3_3_layout);

        // Получаем объект RadioGroup
        RadioGroup radGrp = (RadioGroup) findViewById(R.id.radios);

// Обработка переключения состояния переключателя
        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                TextView selection = findViewById(R.id.selection);
                if (checkedId == R.id.java) {
                    selection.setText("Выбрана Java");
                } else if (checkedId == R.id.kotlin) {
                    selection.setText("Выбран Kotlin");
                }
            }
        });
    }

    /*public void onCheckboxClicked(View view) {
        // Получаем флажки
        CheckBox java = findViewById(R.id.java);
        CheckBox kotlin = findViewById(R.id.kotlin);
        String selectedItems = "";
        if(java.isChecked())
            selectedItems +=java.getText() + " ";
        if(kotlin.isChecked())
            selectedItems +=kotlin.getText();
        TextView selection = findViewById(R.id.selection);
        selection.setText(selectedItems);
    }*/
   /* public void onToggleClicked(View view) {
        // включена ли кнопка
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            // действия если включена
            Toast.makeText(this, "Свет включен",
                    Toast.LENGTH_LONG).show();
            } else {
            // действия, если выключена
            Toast.makeText(this, "Свет выключен!",
                    Toast.LENGTH_LONG).show();
            }}*/

    /*public void onRadioButtonClicked(View view) {
        // Если переключатель отмечен
        boolean checked = ((RadioButton) view).isChecked();
        TextView selection = findViewById(R.id.selection);

        if (view.getId() == R.id.javaRB) {
            if (checked) {
                selection.setText("Выбрана Java");
            }
        } else if (view.getId() == R.id.kotlinRB) {
            if (checked) {
                selection.setText("Выбран Kotlin");
            }
        }
    }*/


}
