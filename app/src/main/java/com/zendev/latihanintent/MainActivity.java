package com.zendev.latihanintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin, btnData, btnInputData, btnBroadcast, btnImplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_activity_login);
        btnLogin.setOnClickListener(this);

        btnData = findViewById(R.id.btn_activity_data);
        btnData.setOnClickListener(this);

        btnInputData = findViewById(R.id.btn_activity_input_data);
        btnInputData.setOnClickListener(this);

        btnBroadcast = findViewById(R.id.btn_broadcast_receiver);
        btnBroadcast.setOnClickListener(this);

        btnImplicit = findViewById(R.id.btn_implicit);
        btnImplicit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_activity_login:
                Intent moveLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(moveLogin);
                break;
            case R.id.btn_activity_data:
                Intent moveData = new Intent(MainActivity.this, DataActivity.class);
                moveData.putExtra(DataActivity.EXTRA_IMG, R.drawable.ic_launcher_background);
                moveData.putExtra(DataActivity.EXTRA_JUDUL, "Universitas Putra Indonesia");
                moveData.putExtra(DataActivity.EXTRA_DESKRIPSI, "Universitas Putra Indonesia adalah universitas yang berada di kota padang");
                startActivity(moveData);
                break;
            case R.id.btn_activity_input_data:
                Intent moveInputData = new Intent(MainActivity.this, InputDataActivity.class);
                startActivity(moveInputData);
                break;
            case R.id.btn_broadcast_receiver:
                Intent moveBroadcast = new Intent(MainActivity.this, BroadcastReceiverActivity.class);
                startActivity(moveBroadcast);
                break;
            case R.id.btn_implicit:
                Intent moveImplicit = new Intent(MainActivity.this, ImplicitActivity.class);
                startActivity(moveImplicit);
        }
    }
}
