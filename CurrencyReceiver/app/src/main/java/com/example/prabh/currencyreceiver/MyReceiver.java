package com.example.prabh.currencyreceiver;

import android.content.BroadcastReceiver;

import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String textReceived = intent.getStringExtra("text");
        Double amtReceived =  intent.getDoubleExtra("num", -1);
        Log.d("myreceiver_ccy",textReceived);
        String amt=String.valueOf(amtReceived);
        Log.d("myreceiver_amt",amt);
        MainActivity.covertCurrency(textReceived, amtReceived);

    }
}