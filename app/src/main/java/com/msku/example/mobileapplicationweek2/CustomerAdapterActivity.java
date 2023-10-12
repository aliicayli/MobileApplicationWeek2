package com.msku.example.mobileapplicationweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomerAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_adapter);


        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Dog", R.drawable.dog_image));
        animalList.add(new Animal("Cat", R.drawable.cat_image));
        animalList.add(new Animal("Tiger", R.drawable.tiger_image));
        animalList.add(new Animal("Cow", R.drawable.cat_image));

        ListView listView = findViewById(R.id.myListView);
        AnimalAdapter adapter = new AnimalAdapter(this, animalList);
        listView.setAdapter(adapter);
    }
}

