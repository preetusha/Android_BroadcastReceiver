package com.example.prabh.currency;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class ResponseBC extends BroadcastReceiver {
    //private Convert convertObj = new Convert();


    @Override
    public void onReceive(Context context, Intent i) {
        String textReceived = i.getStringExtra("text");
        String amtReceived = i.getStringExtra("num");

        if(i.getAction().equals("Preeti.custom.intent.response")) {
            MainActivity.setCcy(textReceived, amtReceived);
        }
    }
}