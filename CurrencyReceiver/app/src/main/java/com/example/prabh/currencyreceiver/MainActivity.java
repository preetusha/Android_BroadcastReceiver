package com.example.prabh.currencyreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MyReceiver rc;
    static Double total;
    static String amount;
    static TextView result;
    static String currency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView tv = (TextView)findViewById(R.id.res);
        IntentFilter fil=new IntentFilter("Preeti.custom.intent.request");
        fil.addCategory(Intent.CATEGORY_DEFAULT);
        rc=new MyReceiver();
        registerReceiver(rc,fil);
        result = (TextView) findViewById(R.id.total);


    }

//ccy conversion
    public static void covertCurrency(String textReceived, Double amtReceived) {
        currency =textReceived;
        switch(textReceived){
            case "British Pound":
                Double total = (amtReceived * 0.72);
                amount= String.valueOf(total);
                Log.d("British Pound", "British Pound " + amount);


                break;
            case "Euro":
                total = (amtReceived * 0.92);
                amount= String.valueOf(total);
                Log.d("Euro", "Euro" + amount);
                //  result = (TextView) findViewById(R.id.total);
                // result.setText("The amount converted is: "+total);
                break;

            case "Indian Rupee":
                total = (amtReceived * 68.80);
                amount= String.valueOf(total);
                Log.d("Indian Rupee", "Indian Rupee " + amount);
                // result = (TextView) findViewById(R.id.total);
                // result.setText("The amount converted is: "+total);
                break;

            case "Canadian Dollar":
                total = (amtReceived * 0.74);
                amount= String.valueOf(total);
                Log.d("Canadian Dollar", "Canadian Dollar " + amount);
                // result = (TextView) findViewById(R.id.total);
                // result.setText("The amount converted is: "+total);
                break;
        }
    }

    public void apply(View view) {

        result.setText(currency + " " + amount);
        currecyExchange();
        }
        public void currecyExchange () {
            Intent intent = new Intent("Preeti.custom.intent.response");
            intent.putExtra("num", amount);
            intent.putExtra("text", currency);
            this.sendBroadcast(intent);
        }

}
