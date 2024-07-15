package com.pens.digitaltalent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    EditText edtNum1, edtNum2;
    Button btnAdd;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        btnAdd = findViewById(R.id.btnAdd);
        tvResult = findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1 = Double.parseDouble(edtNum1.getText().toString());
                Double v2 = Double.parseDouble(edtNum2.getText().toString());

                Intent myCalcIntent = new Intent(CalculatorActivity.this,CalcResultActivity.class);
                Bundle myData = new Bundle();

                myData.putDouble("Num1",v1);
                myData.putDouble("Num2",v2);

                myCalcIntent.putExtra("Data",myData);


                startActivityForResult(myCalcIntent,101);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        try{

            if((requestCode==101) &&(resultCode== Activity.RESULT_OK))
            {
                Bundle myResult = data.getBundleExtra("Result");
                Double vResult = myResult.getDouble("Result");
                tvResult.setText("Sum is : " + vResult.toString());
            }

        }
        catch (Exception e)
        {
            tvResult.setText("Something Wrong : " + requestCode);
        }
    }
}