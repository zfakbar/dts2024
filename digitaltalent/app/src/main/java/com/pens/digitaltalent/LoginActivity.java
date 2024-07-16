package com.pens.digitaltalent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public static final String FILENAME = "login";

    EditText edUserName, edPassword;

    Button btnLogin;

    TextView tvPassword;
    TextView tvRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        edUserName = findViewById(R.id.ed_email);
        edPassword = findViewById(R.id.ed_password);
        btnLogin = findViewById(R.id.btn_login);
        tvPassword = findViewById(R.id.tv_password);
        tvRegister = findViewById(R.id.tv_register);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkLogin();
            }
        });


//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Log.d("LoginActivity", "Test Login");
//                checkLogin();
//            }
//        });
    }

    private void checkLogin() {

        String email = edUserName.getText().toString().trim();
        String password = edPassword.getText().toString().trim();
        Log.d("LoginActivity", "Email : " + email + " password : " + password);


        if (TextUtils.isEmpty(edUserName.getText().toString().trim())
                && TextUtils.isEmpty(edPassword.getText().toString().trim())) {
            edUserName.setError("Email tidak boleh kosong!");
            edPassword.setError("Password tidak boleh kosong!");

        } else if (TextUtils.isEmpty(edUserName.getText().toString().trim())) {
            edUserName.setError("Email tidak boleh kosong!");
        } else if (TextUtils.isEmpty(edPassword.getText().toString())) {
            edPassword.setError("Password tidak boleh kosong!");
        } else if (email.equals("dts@dts.com") && password.equalsIgnoreCase("dts123")) {
            Intent newIntent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(newIntent);
            Toast.makeText(this, "Login berhasil!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Email / Password salah!", Toast.LENGTH_LONG).show();
        }
    }

    public void clickForgotPassword(View view) {

        Log.d("LoginActivity", "clickForgotPassword");
    }

    public void onRegister(View view) {
        Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
        startActivity(intent);

        Log.d("LoginActivity", "onRegister");
    }



}