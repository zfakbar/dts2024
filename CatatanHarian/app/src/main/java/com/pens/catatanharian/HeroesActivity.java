package com.pens.catatanharian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pens.catatanharian.data.Hero;
import com.pens.catatanharian.data.HeroesData;

import java.util.ArrayList;

public class HeroesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private ArrayList<Hero> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        HeroListAdapter heroListAdapter = new HeroListAdapter(list);
        recyclerView.setAdapter(heroListAdapter);
    }
}