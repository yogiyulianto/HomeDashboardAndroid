package com.bringin.iak.homedashboardmaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;


public class MainActivity extends AppCompatActivity {

    CardView cvPoint,cvIdea, cvBank, cvFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cvPoint = findViewById(R.id.point_view);
        cvIdea = findViewById(R.id.idea_view);
        cvBank = findViewById(R.id.banking_view);
        cvFile = findViewById(R.id.file_view);

        cvPoint.setOnClickListener(this);
        cvIdea.setOnClickListener(this);
        cvBank.setOnClickListener(this);
        cvFile.setOnClickListener(this);

    }
}
