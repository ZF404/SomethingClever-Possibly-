package com.example.easyenergysaver;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    private int count = 0;
    public boolean isStateA, isStateB, isStateC, isStateD;
    CheckBox stateA, stateB, stateC, stateD;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment3_layout, container, false);


        return view;
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.stateA:
                if (checked)
                    isStateA = true;
            else
                isStateA = false;
                break;
            case R.id.stateB:
                if (checked)
                    isStateB = true;
            else
                isStateB = false;
                break;
            case R.id.stateC:
                if (checked)
                    isStateC = true;
            else
                isStateC = false;
                break;
            case R.id.stateD:
                if (checked)
                    isStateD = true;
            else
                isStateD = false;
                break;
        }
    }
}
