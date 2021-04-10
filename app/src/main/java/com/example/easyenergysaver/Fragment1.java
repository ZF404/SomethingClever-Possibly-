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
        ArrayList<HomeDataUnit> listOfElements =  new ArrayList<>(8);

        listOfElements.add(new HomeDataUnit("Temperatura w domu:", "Null"));
        listOfElements.add(new HomeDataUnit("Temperatura na zewnątrz:", "Null"));
        listOfElements.add(new HomeDataUnit("Nasłonecznenie:", "Null"));
        listOfElements.add(new HomeDataUnit("Aktualna suma pobieranej energii:", "Null"));
        listOfElements.add(new HomeDataUnit("Energia elektryczna dotychczas oddana do sieci:", "Null"));
        listOfElements.add(new HomeDataUnit("Energia pograna dotychczas z sieci:", "Null"));
        listOfElements.add(new HomeDataUnit("Stan naładowania magazynu energii:", "Null"));
        listOfElements.add(new HomeDataUnit("Aktualnie wybrany tryb pracy: ", "Null"));

        adapter = new HomeListAdapter(getContext(), R.layout.home_adapter_view_layout, listOfElements);
        mListView.setAdapter(adapter);

        return view;
    }
}
