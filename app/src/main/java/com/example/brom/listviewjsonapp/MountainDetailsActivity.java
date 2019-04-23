package com.example.brom.listviewjsonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.brom.activitiesapp.R;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);
        Intent intent = getIntent();

        TextView test = (TextView) findViewById(R.id.world);
        String mountainNames = intent.getStringExtra("mountainNames");
        test.setText("Load " + mountainNames);

    }
}
