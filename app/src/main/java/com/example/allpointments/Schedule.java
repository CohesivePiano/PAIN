package com.example.allpointments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        Button choice1 = (Button) findViewById(R.id.choice1);
        choice1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.getId() == R.id.choice1) {
                            Intent intent = new Intent(Schedule.this, Success.class);
                            startActivity(intent);
                        }
                    }

                });
        Button choice2 = (Button) findViewById(R.id.choice2);
        choice2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.getId() == R.id.choice2) {
                            Intent intent = new Intent(Schedule.this, Success.class);
                            startActivity(intent);
                        }
                    }

                });
        Button choice3 = (Button) findViewById(R.id.choice3);
        choice3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.getId() == R.id.choice3) {
                            Intent intent = new Intent(Schedule.this, Success.class);
                            startActivity(intent);
                        }
                    }

                });
    }
}