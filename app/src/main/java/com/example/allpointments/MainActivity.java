package com.example.allpointments;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EDcrypt cypher = new EDcrypt();
        setContentView(R.layout.activity_main);

        String mudwater = "";

        try {
            FileReader read = new FileReader("logs.txt");
            mudwater = read.toString();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileWriter write = new FileWriter("logs.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        String[][] userInfo = new String[5][18];
        cypher.Decrypt(userInfo,mudwater);

        Button addUser = (Button) findViewById(R.id.addUser);

        Button schedule = (Button) findViewById(R.id.schedule);
        schedule.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.getId() == R.id.schedule) {
                            Intent intent = new Intent(MainActivity.this, Schedule.class);
                            startActivity(intent);
                        }
                    }

                });

        addUser.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.getId() == R.id.addUser) {
                            Intent intent = new Intent(MainActivity.this, enterUserInfo.class);
                            startActivity(intent);
                        }
                    }

                });







    }
    public String[][] userInfo = new String[5][19];


    public void setUser(String newString[], int current)
    {
        for(int i = 0; i < userInfo[0].length; i++)
        {
            userInfo[current][i] = newString[i];
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}