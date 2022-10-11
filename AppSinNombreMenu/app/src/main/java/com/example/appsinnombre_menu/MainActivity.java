package com.example.appsinnombre_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.uno:
                Toast.makeText(MainActivity.this, "Probando la Opcion1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.dos:
                Toast.makeText(MainActivity.this, "Probando la Opcion2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.tres:
                Intent i = new Intent(MainActivity.this, redes.class);
                startActivity(i);
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
