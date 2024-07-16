package com.pens.digitaltalent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TampilActivity extends AppCompatActivity {

    TextView tvName, tvInstitusi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        tvName = findViewById(R.id.tv_name);
        tvInstitusi = findViewById(R.id.tv_institusi);


        Bundle bundle = getIntent().getBundleExtra("CONTOH");

        String strBundle = bundle.getString("CONTOHString");
        String name = getIntent().getStringExtra(ExplicitActivity.KEY_NAME);
        String instansi = getIntent().getStringExtra(ExplicitActivity.KEY_INSTITUSI);


        tvName.setText(name);
        tvInstitusi.setText(instansi);

    }
}