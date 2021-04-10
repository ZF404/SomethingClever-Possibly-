package com.example.easyenergysaver;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Fragment3 extends Fragment {

    private ArrayList count;
    public boolean isStateA, isStateB, isStateC, isStateD;
    CheckBox stateA, stateB, stateC, stateD;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment3_layout, container, false);

        stateA = (CheckBox) view.findViewById(R.id.stateA);
        stateB = (CheckBox) view.findViewById(R.id.stateB);
        stateC = (CheckBox) view.findViewById(R.id.stateC);
        stateD = (CheckBox) view.findViewById(R.id.stateD);

        stateA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stateA.isChecked()) isStateA = true;
                else isStateA = false;
            }
        });

        stateB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stateB.isChecked()) isStateB = true;
                else isStateB = false;
            }
        });

        stateC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stateC.isChecked()) isStateC = true;
                else isStateC = false;
            }
        });

        stateD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stateD.isChecked()) isStateD = true;
                else isStateD = false;
            }
        });

        return view;
    }
}
