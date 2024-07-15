package com.pens.digitaltalent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcResultActivity extends AppCompatActivity {

    EditText edtValues;
    Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_result);

        edtValues = findViewById(R.id.edtValues);
        btnok = findViewById(R.id.btnDone);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent myIntent = getIntent();
        Bundle myBundle = myIntent.getBundleExtra("Data");
        Double v1 = myBundle.getDouble("Num1");
        Double v2 = myBundle.getDouble("Num2");
        Double vResult = v1 + v2;

        edtValues.setText("Data received : \n" +
                "Num 1 : " + v1.toString() + "\n" +
                "Num 2 : " + v2.toString() + "\n" +
                "Result : " + vResult.toString());

        myBundle.putDouble("Result", vResult);
        myIntent.putExtra("Result", myBundle);
        setResult(Activity.RESULT_OK, myIntent);

    }
}