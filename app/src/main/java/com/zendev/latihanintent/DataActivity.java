package com.zendev.latihanintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    public static final String EXTRA_NAMA_DEPAN = "extra_nama_depan";
    public static final String EXTRA_NAMA_BELAKANG = "extra_nama_belakang";
    public static final String EXTRA_UMUR = "extra_umur";

    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tvData = findViewById(R.id.tv_data);

        String nama_depan = getIntent().getStringExtra(EXTRA_NAMA_DEPAN);
        String nama_belakang = getIntent().getStringExtra(EXTRA_NAMA_BELAKANG);
        int umur = getIntent().getIntExtra(EXTRA_UMUR, 0);

        String data = "Nama Saya " + nama_depan + nama_belakang + ", Dan Umur Saya :" + umur;

        tvData.setText(data);
    }
}
