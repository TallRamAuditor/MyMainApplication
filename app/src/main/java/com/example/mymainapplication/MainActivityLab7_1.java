package com.example.mymainapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
public class MainActivityLab7_1  extends AppCompatActivity implements ListFragmentLab7_1.OnFragmentSendDataListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab7_1_layout);
    }

    @Override
    public void onSendData(String selectedItem) {
        DetailFragmentLab7_1 fragment = (DetailFragmentLab7_1)
                getSupportFragmentManager()
                        .findFragmentById(R.id.detailFragment);
        if (fragment != null && fragment.isVisible())
            fragment.setSelectedItem(selectedItem);
        else {
            Intent intent = new Intent(getApplicationContext(),
                    DetailActivityLab7_1.class);
            intent.putExtra(DetailActivityLab7_1.SELECTED_ITEM,
                    selectedItem);
            startActivity(intent);
        }
    }


}
