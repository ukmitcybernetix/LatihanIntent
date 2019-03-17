package com.zendev.latihanintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PenerimaDataActivity extends AppCompatActivity {

    TextView tvNama, tvJurusan, tvKelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penerima_data);

        tvNama = findViewById(R.id.tv_nama);
        tvJurusan = findViewById(R.id.tv_jurusan);
        tvKelas = findViewById(R.id.tv_kelas);

        tvNama.setText(getIntent().getStringExtra("nama"));
        tvJurusan.setText(getIntent().getStringExtra("jurusan"));
        tvKelas.setText(getIntent().getStringExtra("kelas"));
    }
}
