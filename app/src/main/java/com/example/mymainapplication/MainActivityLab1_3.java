package com.example.mymainapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityLab1_3 extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.lab1_3_layout);

            ConstraintLayout constraintLayout = new ConstraintLayout(this);
            TextView textView = new TextView(this);
            textView.setText("Hello Android");
            textView.setTextSize(26);
            // устанавливаем параметры размеров и расположение элемента
            ConstraintLayout.LayoutParams layoutParams =
                    new ConstraintLayout.LayoutParams
                            (ConstraintLayout.LayoutParams.WRAP_CONTENT,
                                    ConstraintLayout.LayoutParams.WRAP_CONTENT);
            // эквивалент app:layout_constraintLeft_toLeftOf="parent"
            layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
// эквивалент app:layout_constraintTop_toTopOf="parent"
            layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
            // устанавливаем параметры для textView
            textView.setLayoutParams(layoutParams);
            // добавляем TextView в ConstraintLayout
            constraintLayout.addView(textView);
            setContentView(constraintLayout);

        }
    }

