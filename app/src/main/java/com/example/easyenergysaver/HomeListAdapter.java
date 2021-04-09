package com.example.easyenergysaver;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class HomeListAdapter extends ArrayAdapter<HomeDataUnit> {

    Context mContext;
    int mResource;

    public HomeListAdapter(Context context, int resource, ArrayList<HomeDataUnit> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    //Get necessary data
        String name = getItem(position).getName();
        String content = getItem(position).getData();

        HomeDataUnit dataUnit = new HomeDataUnit(name, content);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView fieldName = (TextView) convertView.findViewById(R.id.objectName);
        TextView fieldContent = (TextView) convertView.findViewById(R.id.objectContent);

        fieldName.setText(name);
        fieldContent.setText(content);

        return convertView;
    }
}
