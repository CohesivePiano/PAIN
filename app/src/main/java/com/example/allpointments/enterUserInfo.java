package com.example.allpointments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class enterUserInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_user_info);
        Button Submit = (Button) findViewById(R.id.Submit);
        Submit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.getId() == R.id.Submit) {
                            Intent intent = new Intent(enterUserInfo.this, MainActivity.class);
                            startActivity(intent);
                        }
                    }

                });
    }
}