package com.example.allpointments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Failure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failure);
        Button forward2 = (Button) findViewById(R.id.forward);
        forward2.setOnClickListener(
                new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.forward2) {
                Intent intent = new Intent(Failure.this, MainActivity.class);
                startActivity(intent);
            }
        }

    });
    }
}