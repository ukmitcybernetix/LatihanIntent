package com.zendev.latihanintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputDataActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtNama, edtJurusan, edtKelas;
    Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);

        edtNama = findViewById(R.id.edt_nama);
        edtJurusan = findViewById(R.id.edt_jurusan);
        edtKelas = findViewById(R.id.edt_kelas);
        btnKirim = findViewById(R.id.btn_kirim);

        btnKirim.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent kirim = new Intent(this, PenerimaDataActivity.class);

        kirim.putExtra("nama", edtNama.getText().toString());
        kirim.putExtra("jurusan", edtJurusan.getText().toString());
        kirim.putExtra("kelas", edtKelas.getText().toString());

        startActivity(kirim);
    }
}
