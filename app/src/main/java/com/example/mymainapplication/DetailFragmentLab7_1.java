package com.example.mymainapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetailFragmentLab7_1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail_lab7_1,
                container, false);
    }
    // обновление текстового поля
    public void setSelectedItem(String selectedItem) {
        TextView view = getView().findViewById(R.id.detailsText);
        view.setText(selectedItem);
    }

}