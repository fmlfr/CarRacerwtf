package com.example.carracer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainPageActivity extends AppCompatActivity {

    Button statsButton, measureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        statsButton = findViewById(R.id.statsButton);
        measureButton = findViewById(R.id.measureButton);

        statsButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainPageActivity.this, StatsActivity.class);
            startActivity(intent);
        });

        measureButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainPageActivity.this, MeasureActivity.class);
            startActivity(intent);
        });
    }
}
