package com.zendev.latihanintent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BroadcastReceiverActivity extends AppCompatActivity {

    TextView tvBaterai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver);

        tvBaterai = findViewById(R.id.tv_baterai);
        this.registerReceiver(this.broadcastReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }

    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int bateraiLevel = intent.getIntExtra("level", 0);
            tvBaterai.setText("Baterai Anda : " + String.valueOf(bateraiLevel) + "%");
        }
    };

}
