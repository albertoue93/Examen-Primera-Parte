package com.example.examen_primera_parte;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class GridFragmento extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid,container,false);
        GridView gridView = (GridView) view.findViewById(R.id.grill);

        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.countries, android.R.layout.simple_list_item_1);
        gridView.setAdapter(arrayAdapter);
        return view;
    }
}
