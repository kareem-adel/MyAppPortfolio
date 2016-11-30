package com.example.kareem.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button MainActivity_popularMovies = (Button) findViewById(R.id.MainActivity_popularMovies);
        Button MainActivity_stockHawk = (Button) findViewById(R.id.MainActivity_stockHawk);
        Button MainActivity_buildItBigger = (Button) findViewById(R.id.MainActivity_buildItBigger);
        Button MainActivity_makeYourAppMaterial = (Button) findViewById(R.id.MainActivity_makeYourAppMaterial);
        Button MainActivity_goUbiquitous = (Button) findViewById(R.id.MainActivity_goUbiquitous);
        Button MainActivity_capstoneMyOwnApp = (Button) findViewById(R.id.MainActivity_capstoneMyOwnApp);

        MainActivity_popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMessage("This button will launch my popular movies project");
            }
        });
        MainActivity_stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMessage("This button will launch my stock hawk project");
            }
        });
        MainActivity_buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMessage("This button will launch my build it bigger project");
            }
        });
        MainActivity_makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMessage("This button will launch my make your app material project");
            }
        });
        MainActivity_goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMessage("This button will launch my go ubiquitous project");
            }
        });
        MainActivity_capstoneMyOwnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMessage("This button will launch my capstone my own app project");
            }
        });
    }

    public void viewMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
