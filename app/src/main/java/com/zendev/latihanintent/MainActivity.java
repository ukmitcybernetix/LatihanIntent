package com.zendev.latihanintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin, btnData, btnInputData;

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
                moveData.putExtra(DataActivity.EXTRA_NAMA_DEPAN, "Fattahul");
                moveData.putExtra(DataActivity.EXTRA_NAMA_BELAKANG, "Akbar");
                moveData.putExtra(DataActivity.EXTRA_UMUR, 21);
                startActivity(moveData);
                break;
            case R.id.btn_activity_input_data:
                Intent moveInputData = new Intent(MainActivity.this, InputDataActivity.class);
                startActivity(moveInputData);
                break;
        }
    }
}
