package com.example.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Property;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView recyclerView;
    private  RecycleViewerAdapter recyclerViewAdapter;
    private  ArrayList<Country> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        countryList = new ArrayList<>();
        countryList.add(new Country("Slovensko", 49035));
        countryList.add(new Country("Taliansko", 301338));
        countryList.add(new Country("Česko", 78866));
        countryList.add(new Country("Anglicko", 130395));

        recyclerViewAdapter = new RecycleViewerAdapter(MainActivity.this,countryList);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
