package com.example.appsinnombre_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.net.URI;

public class redes extends AppCompatActivity {
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redes);
        imageButton = (ImageButton) findViewById(R.id.imageButton2);

        imageButton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com"));
                startActivity(i);
            }
        });



    }





    }

