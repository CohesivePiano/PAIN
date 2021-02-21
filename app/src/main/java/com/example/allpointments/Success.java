package com.example.allpointments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Button forward = (Button) findViewById(R.id.forward);
        forward.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.getId() == R.id.forward) {
                            Intent intent = new Intent(Success.this, MainActivity.class);
                            startActivity(intent);
                        }
                    }

                });
    }
}