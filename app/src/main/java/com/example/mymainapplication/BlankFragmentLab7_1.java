package com.example.mymainapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Date;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.util.Log;

public class BlankFragmentLab7_1 extends Fragment {

    /*public BlankFragmentLab7_1(){
        super(R.layout.fragment_blank_lab7_1);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button updateButton = view.findViewById(R.id.updateButton);
        TextView updateBox = view.findViewById(R.id.dateTextView);

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curDate = new Date().toString();
                updateBox.setText(curDate);
            }
        });
    }*/
    private final static String TAG = "ContentFragment";
    public BlankFragmentLab7_1(){
        Log.d(TAG, "Constructor");
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach");
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        return inflater.inflate(R.layout.fragment_blank_lab7_1, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button updateButton = view.findViewById
                (R.id.updateButton);

        TextView updateBox = view.findViewById(R.id.dateTextView); updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curDate = new Date().toString();
                updateBox.setText(curDate);
            }
        });
        Log.d(TAG, "onViewCreated");
    }
    @Override
    public void onViewStateRestored(@Nullable Bundle
                                            savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(TAG, "onViewStateRestored");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }
    @Override
    public void onDestroyView() {

        super.onDestroyView();
        Log.d(TAG, "onDestroyView");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach");
    }
}