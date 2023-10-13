package com.example.mymainapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivityLab2_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2_4_layout);

        EditText editText = findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s,
                                          int start, int count, int after) {
            }
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                TextView textView = findViewById(R.id.textView);
                textView.setText(s);
            }
        });


    }
    // Обработка нажатия кнопки
    public void sendMessage(View view) {
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);
        textView.setText("Добро пожаловать, " + editText.getText());
    }
}
