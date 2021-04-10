package com.example.easyenergysaver;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    ListView mListView;
    View view;
    HomeListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1_layout, container, false);

        mListView = (ListView) view.findViewById(R.id.homeList);
        ArrayList<HomeDataUnit> listOfElements =  new ArrayList<>(6);

        listOfElements.add(new HomeDataUnit("Null", "Null"));
        listOfElements.add(new HomeDataUnit("Null", "Null"));
        listOfElements.add(new HomeDataUnit("Null", "Null"));
        listOfElements.add(new HomeDataUnit("Null", "Null"));
        listOfElements.add(new HomeDataUnit("Null", "Null"));
        listOfElements.add(new HomeDataUnit("Null", "Null"));

        adapter = new HomeListAdapter(getContext(), R.layout.home_adapter_view_layout, listOfElements);
        mListView.setAdapter(adapter);

        return view;
    }
}
