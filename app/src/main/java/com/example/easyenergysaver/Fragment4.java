package com.example.easyenergysaver;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;

public class Fragment4 extends Fragment {

    public boolean globalVacationDay;
    public int varDur;
    View view;
    Button submit, reset;
    TextInputEditText textInput;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment4_layout, container, false);

        textInput = (TextInputEditText) view.findViewById(R.id.inputNumberOfDays);


        submit = (Button) view.findViewById(R.id.submitButton);
        reset = (Button) view.findViewById(R.id.resetButton);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVacationDay = true;
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVacationDay = false;
            }
        });

        return view;
    }
}
