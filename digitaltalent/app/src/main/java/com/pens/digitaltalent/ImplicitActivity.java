package com.pens.digitaltalent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ImplicitActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnCamera, btnContact, btnBrowser, btnGallery, btnDial;

    EditText etNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        etNo = findViewById(R.id.etNo);

        btnCamera = findViewById(R.id.btnCamera);
        btnBrowser = findViewById(R.id.btnBrowser);
        btnGallery = findViewById(R.id.btnGallery);
        btnDial = findViewById(R.id.btnDial);
        btnContact = findViewById(R.id.btnContact);


        btnDial.setOnClickListener(this::onClick);
        btnCamera.setOnClickListener(this);
        btnBrowser.setOnClickListener(this);
        btnContact.setOnClickListener(this);
        btnGallery.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnDial:
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + etNo.getText()));
                startActivity(i);
                break;

            case R.id.btnCamera:
                Intent iCamera = new Intent();
                iCamera.setAction(MediaStore.ACTION_PICK_IMAGES);
                startActivity(iCamera);
                break;

            case R.id.btnGallery:
                Intent iGallery = new Intent();
                iGallery.setAction(Intent.ACTION_VIEW);
                iGallery.setData(Uri.parse("content://media/external/images/media/"));
                startActivity(iGallery);
                break;

            case R.id.btnBrowser:
                Intent iBrowser = new Intent();
                iBrowser.setAction(Intent.ACTION_VIEW);
                iBrowser.setData(Uri.parse("http://www.pens.ac.id/"));
                startActivity(Intent.createChooser(iBrowser, "Title"));
                break;

            case R.id.btnContact:
                Intent iContact = new Intent();
                iContact.setAction(Intent.ACTION_VIEW);
                iContact.setData(Uri.parse("content://contacts/people/"));
                startActivity(iContact);
                break;

            default:
                break;
        }
    }
}