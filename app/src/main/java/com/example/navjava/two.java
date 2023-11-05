package com.example.navjava;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class two extends Fragment {

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view=inflater.inflate(R.layout.fragment_two, container, false);
        TextView textView=view.findViewById(R.id.txtTwo);
        int num=twoArgs.fromBundle(getArguments()).getNumber();
        textView.setText("Number from One:"+num);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_two_to_one);
            }
        });
        return view;

    }
}