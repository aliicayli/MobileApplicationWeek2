package com.msku.example.mobileapplicationweek2;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ArrayAdapterActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] animalNames = {"Dog", "Cat", "Tiger", "Cow"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.my_card, R.id.animalNameTextView, animalNames);

        setListAdapter(adapter);
    }
}
