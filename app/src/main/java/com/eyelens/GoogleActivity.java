package com.eyelens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GoogleActivity extends AppCompatActivity {

    TextView tvsearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        tvsearch = findViewById(R.id.tv_search);
        Intent intent = getIntent();
        String s = intent.getStringExtra("Words");
        tvsearch.setText(s);
    }
}
