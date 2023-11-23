package com.example.mymainapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.File;



public class MainActivityLab7_2 extends AppCompatActivity{

    /*private final static String FILE_NAME = "content.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab7_2_layout);
    }
    // сохранение файла
    public void saveText(View view){
        FileOutputStream fos = null;
        try {
            EditText textBox = findViewById(R.id.editor);
            String text = textBox.getText().toString();
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен",
                    Toast.LENGTH_SHORT).show();

        }
        catch(IOException ex) {
            Toast.makeText(this, ex.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }
        finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){
                Toast.makeText(this, ex.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
    // открытие файла
    public void openText(View view){
        FileInputStream fin = null;
        TextView textView = findViewById(R.id.text);
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
        }
        catch(IOException ex) {
            Toast.makeText(this, ex.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }

 finally{
            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){
                Toast.makeText(this, ex.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }*/

    private final static String FILE_NAME = "document.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab7_2_layout);
    }
    private File getExternalPath() {
        return new File(getExternalFilesDir(null), FILE_NAME);
    }
    // сохранение файла
    public void saveText(View view){
        try(FileOutputStream fos =
                    new FileOutputStream(getExternalPath())) {
            EditText textBox = findViewById(R.id.editor);
            String text = textBox.getText().toString();
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен",
                    Toast.LENGTH_SHORT).show();
        }
        catch(IOException ex) {
            Toast.makeText(this, ex.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }
    }
    // открытие файла
    public void openText(View view){

        TextView textView = findViewById(R.id.text);

        File file = getExternalPath();
        // если файл не существует, выход из метода
        if(!file.exists()) return;
        try(FileInputStream fin = new FileInputStream(file)) {
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
        }
        catch(IOException ex) {
            Toast.makeText(this, ex.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }
    }



}
