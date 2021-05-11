package com.example.showactivits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityText3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text3);
    }

    public void openFourthActivity(View view) {
        Intent intent = new Intent(this, ActivityFourth.class);
        startActivity(intent);
    }
}