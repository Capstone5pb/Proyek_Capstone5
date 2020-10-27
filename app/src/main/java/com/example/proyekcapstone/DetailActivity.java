package com.example.proyekcapstone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView judulberita;
    private TextView tanggalberita;
    private TextView kategoriberita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
        judulberita.setText(getIntent().getStringExtra("judulberita"));
        tanggalberita.setText(getIntent().getStringExtra("tanggalberita"));
        kategoriberita.setText(getIntent().getStringExtra("kategoriberita"));
    }

    private void initView() {
        judulberita = findViewById(R.id.judulberita);
        tanggalberita = findViewById(R.id.tanggalberita);
        kategoriberita = findViewById(R.id.kategoriberita);
    }
}