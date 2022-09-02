package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anahuac.anahuac.adapters.CampusAdapter;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView rvCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        rvCampus = findViewById(R.id.rv_campus);
        rvCampus.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        ArrayList<String> listCampus = new ArrayList();
        listCampus.add("Cancun");
        listCampus.add("CDMX");
        listCampus.add("Queretaro");
        listCampus.add("Xalapa");
        listCampus.add("Puebla");
        listCampus.add("Merida");

        CampusAdapter adapter = new CampusAdapter(listCampus);
        rvCampus.setAdapter(adapter);
    }
}