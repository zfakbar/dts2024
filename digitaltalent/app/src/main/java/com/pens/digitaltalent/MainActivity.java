package com.pens.digitaltalent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCalculator, btnExplicit, btnImplicit, btnSubmit;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculator = findViewById(R.id.btn_calculator);
        btnExplicit = findViewById(R.id.btn_explicit);
        btnImplicit = findViewById(R.id.btn_implicit);
        btnSubmit = findViewById(R.id.btn_submit);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            // Handle settings action
            return true;
        } else if (id == R.id.action_search) {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void clickCalculator(View view) {
        Intent newIntent = new Intent(MainActivity.this, CalculatorActivity.class);
        startActivity(newIntent);
    }

    public void clickExplicit(View view) {
        Intent newIntent = new Intent(MainActivity.this, ExplicitActivity.class);
        startActivity(newIntent);
    }

    public void clickImplisit(View view) {
        Intent newIntent = new Intent(MainActivity.this, ImplicitActivity.class);
        startActivity(newIntent);

    }

    public void clickSubmit(View view) {
        Toast.makeText(this, "Submit", Toast.LENGTH_SHORT).show();
    }

    public void clickListView(View view) {
        Intent listIntent = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(listIntent);
    }
}