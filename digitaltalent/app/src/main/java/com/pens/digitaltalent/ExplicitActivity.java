package com.pens.digitaltalent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExplicitActivity extends AppCompatActivity {
    EditText edName, edInstitusi;
    Button btnData, btnTanpaData;

    final public static String KEY_NAME = "name";
    final public static String KEY_INSTITUSI = "institusi";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);
        edName = findViewById(R.id.ed_name);
        edInstitusi = findViewById(R.id.ed_institusi);
        btnData = findViewById(R.id.btn_kirim_data);
        btnTanpaData = findViewById(R.id.btn_tanpa_data);
    }

    public void postTanpaData(View view) {
        Intent newInten = new Intent(this, TampilActivity.class);
        startActivity(newInten);
    }

    public void postData(View view) {
        String name = edName.getText().toString().trim();
        String institusi = edInstitusi.getText().toString().trim();

        Intent moveIntentWithData = new Intent(this, TampilActivity.class);
        moveIntentWithData.putExtra(KEY_NAME, name);
        moveIntentWithData.putExtra(KEY_INSTITUSI, institusi);

        Bundle mBundle = new Bundle();
        mBundle.putString("CONTOHString", "String");
        mBundle.putInt("CONTOHINT", 4);

        moveIntentWithData.putExtra("BUNDLE",mBundle);


        startActivity(moveIntentWithData);
    }
}
