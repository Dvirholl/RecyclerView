package com.example.recyclerviewdvir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Items> Items = new ArrayList<Items>();
        Items.add(new Items("WOW",R.drawable.wow));
        Items.add(new Items("AMAZING", R.drawable.amazing));
        Items.add(new Items("INTERESTING", R.drawable.interesting));
        Items.add(new Items("GOOD", R.drawable.good));
        Items.add(new Items("FOOTBALL", R.drawable.football));
        Items.add(new Items("BASKETBALL", R.drawable.basketball));
        Items.add(new Items("SOCCER", R.drawable.soccer));
        Items.add(new Items("BASEBALL", R.drawable.baseball));
        Items.add(new Items("VOLLEYBALL", R.drawable.volleyball));


        RecyclerView RecyclerView;
        RecyclerView = findViewById(R.id.RecyclerView);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.setOnCapturedPointerListener(new Adapter(getApplicationContext()));
    }
}