package com.example.lab3app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.ffmenu,menu);
        return super.onCreateOptionsMenu(menu); }

    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch(item.getItemId()){

            case R.id.item1: Toast.makeText(MainActivity.this, "you clicked the menu icon", Toast.LENGTH_LONG).show();
                break;

            case R.id.item2: Toast.makeText(MainActivity.this, "you clicked the menu item", Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item); }

}

