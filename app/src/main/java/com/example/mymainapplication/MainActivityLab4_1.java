package com.example.mymainapplication;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.DatePicker;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivityLab4_1 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab4_1_layout);

        //DATEPICKER
        /*TextView dateTextView = findViewById(R.id.dateTextView);
        DatePicker datePicker = this.findViewById(R.id.datePicker);
        // Месяц начиная с нуля. Для отображения добавляем 1.
        datePicker.init(2020, 02, 01, new
                DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
// Отсчет месяцев начинается с нуля. Для отображения добавляем 1.
                        dateTextView.setText(("Дата: " + view.getDayOfMonth() + "/" + view.getMonth() + 1) + "/" + view.getYear());

                        // альтернативная запись
                        // dateTextView.setText("Дата: " + dayOfMonth + "/" +(monthOfYear + 1) + "/" + year);
                    }
                });*/

        //TIMEPICKER
        /*TextView timeTextView = findViewById(R.id.timeTextView);
        TimePicker timePicker = findViewById(R.id.timePicker);
        timePicker.setOnTimeChangedListener
                (new TimePicker.OnTimeChangedListener() {
                    @Override
                    public void onTimeChanged(TimePicker view, int
                            hourOfDay, int minute)
                    {

                        timeTextView.setText("Время: " + hourOfDay + ":" + minute);
                        // или так
                        // timeTextView.setText("Время: " + view.getHour() + ":" +view.getMinute());
                    }
                });*/

        //SEEKBAR
        /*SeekBar seekBar = findViewById(R.id.seekBar);
        TextView textView = findViewById(R.id.seekBarValue);
        seekBar.setOnSeekBarChangeListener(new
                                                   SeekBar.OnSeekBarChangeListener() {
                                                       @Override
                                                       public void onProgressChanged(SeekBar seekBar,
                                                                                     int progress, boolean fromUser) {
                                                           textView.setText(String.valueOf(progress));
                                                       }
                                                       @Override
                                                       public void onStartTrackingTouch(SeekBar seekBar) {
                                                       }
                                                       @Override
                                                       public void onStopTrackingTouch(SeekBar seekBar) {}
        });*/



    }
}
