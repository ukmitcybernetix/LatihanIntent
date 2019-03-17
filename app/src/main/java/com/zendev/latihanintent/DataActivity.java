package com.zendev.latihanintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    public static final String EXTRA_IMG = "extra_img";
    public static final String EXTRA_JUDUL = "extra_judul";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";

    ImageView imgGambar;
    TextView tvJudul, tvDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tvJudul = findViewById(R.id.tv_judul);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);
        imgGambar = findViewById(R.id.img_gambar);

        int gambar = getIntent().getIntExtra(EXTRA_IMG, 0);
        String judul = getIntent().getStringExtra(EXTRA_JUDUL);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);

        imgGambar.setImageResource(gambar);
        tvJudul.setText(judul);
        tvDeskripsi.setText(deskripsi);
    }
}
