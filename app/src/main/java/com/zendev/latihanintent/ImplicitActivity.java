package com.zendev.latihanintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ImplicitActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edLokasi, edWebsite, edShare, edNotelp;
    Button btnLokasi, btnShare, btnWebsite, btnNotelp, btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        edLokasi = findViewById(R.id.ed_lokasi);
        edWebsite = findViewById(R.id.ed_website);
        edShare = findViewById(R.id.ed_share);
        edNotelp = findViewById(R.id.ed_notelp);

        btnLokasi = findViewById(R.id.btn_lokasi);
        btnLokasi.setOnClickListener(this);

        btnShare = findViewById(R.id.btn_share);
        btnShare.setOnClickListener(this);

        btnWebsite = findViewById(R.id.btn_website);
        btnWebsite.setOnClickListener(this);

        btnNotelp = findViewById(R.id.btn_notelp);
        btnNotelp.setOnClickListener(this);

        btnCamera = findViewById(R.id.btn_camera);
        btnCamera.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_lokasi:
                String lokasi = edLokasi.getText().toString();
                Intent openLocation = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + lokasi));
                startActivity(openLocation);
                break;
            case R.id.btn_website:
                String website = edWebsite.getText().toString();
                Uri uri = Uri.parse(website);
                Intent openWebsite = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(openWebsite);
                break;
            case R.id.btn_share:
                String share = edShare.getText().toString();
                String type = "text/plain";
                ShareCompat.IntentBuilder
                        .from(this)
                        .setType(type)
                        .setChooserTitle("Share Menggunakan ?")
                        .setText(share)
                        .startChooser();
                break;
            case R.id.btn_notelp:
                String notelp = edNotelp.getText().toString();
                Intent openTelp = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + notelp));
                startActivity(openTelp);
                break;
            case R.id.btn_camera:
                Intent openCamera = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(openCamera);
        }
    }
}
