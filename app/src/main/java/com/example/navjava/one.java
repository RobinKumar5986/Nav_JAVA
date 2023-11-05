package com.example.navjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class one extends Fragment {
    EditText edtMsg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_one, container, false);
        TextView textView=view.findViewById(R.id.txtOne);
        edtMsg=view.findViewById(R.id.edtMsg);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=Integer.parseInt(edtMsg.getText().toString());

                oneDirections.ActionOneToTwo action =oneDirections.actionOneToTwo().setNumber(num);
                Navigation.findNavController(view).navigate(action);
            }
        });

        return view;
    }
}