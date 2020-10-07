package com.example.proyekcapstone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<RecyclerModel> beritaArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerAdapter adapter = new RecyclerAdapter(beritaArray);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){
        beritaArray = new ArrayList<>();
        beritaArray.add(new RecyclerModel("Konflik Agraria", "20-09-2020", "Hukum"));
        beritaArray.add(new RecyclerModel("Capres 2020", "21-09-2020", "Politik"));
        beritaArray.add(new RecyclerModel("Barcelona VS Real Madrid", "22-09-2020", "Sepakbola"));
        beritaArray.add(new RecyclerModel("Pemerintah janjikan PLN Gratis", "23-09-2020", "Ekonomi"));
    }
}