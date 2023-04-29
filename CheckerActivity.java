package com.example.forassignmentonly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;


public class CheckerActivity extends AppCompatActivity {

    TextView checkmessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checker);

        Toolbar mytoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mytoolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        checkmessage = findViewById(R.id.checkmessage);

        String first_content = getIntent().getStringExtra("firstContent");
        String second_content = getIntent().getStringExtra("secondContent");

        if (first_content.equals(second_content) ){
            checkmessage.setText("SAME");
        }else {
            checkmessage.setText("NOT THE SAME");
        }

    }

}