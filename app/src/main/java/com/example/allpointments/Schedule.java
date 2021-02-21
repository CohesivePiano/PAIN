package com.example.allpointments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        Button choice1 = (Button) findViewById(R.id.choice1);
        schedule.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.getId() == R.id.choice1) {
                            Intent intent = new Intent(Schedule.this, //FILL THIS IN WITH THE CLASS YOU NEED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!);
                            startActivity(intent);
                        }
                    }

                });
        Button choice2 = (Button) findViewById(R.id.choice2);
        schedule.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.getId() == R.id.choice2) {
                            Intent intent = new Intent(Schedule.this, Tester.class);
                            startActivity(intent);
                        }
                    }

                });
        Button choice3 = (Button) findViewById(R.id.choice3);
        schedule.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.getId() == R.id.choice3) {
                            Intent intent = new Intent(Schedule.this, Tester.class);
                            startActivity(intent);
                        }
                    }

                });
    }
}