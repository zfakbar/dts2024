package com.pens.digitaltalent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCalculator, btnExplicit, btnImplicit, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculator = findViewById(R.id.btn_calculator);
        btnExplicit = findViewById(R.id.btn_explicit);
        btnImplicit = findViewById(R.id.btn_implicit);
        btnSubmit = findViewById(R.id.btn_submit);
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