//package com.example.prabh.currencyreceiver;
//
//import android.app.Activity;
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//
//import java.util.ArrayList;
//
//public class Convert extends Activity {
//
//    String textReceived;
//    double amtReceived;
//    static TextView  result;
//
//
//    protected void onCreate(Bundle savedInstanceState) {
//        int test = 100;
//        super.onCreate(savedInstanceState);
//        result = (TextView) findViewById(R.id.total);
//    }
//
//
//    public static void covertCurrency(String textReceived, Double amtReceived) {
//
//        switch(textReceived){
//            case "British Pound":
//                Double total = (amtReceived * 0.72);
//               // result = (TextView) findViewById(R.id.total);
//               // result.setText("The amount converted is: "+total);
//                Log.d("abc",total.toString());
//                break;
//            case "Euro":
//                total = (amtReceived * 0.92);
//              //  result = (TextView) findViewById(R.id.total);
//               // result.setText("The amount converted is: "+total);
//                break;
//
//            case "Indian Rupee":
//                total = (amtReceived * 68.80);
//               // result = (TextView) findViewById(R.id.total);
//               // result.setText("The amount converted is: "+total);
//                break;
//
//            case "Canadian Dollar":
//                total = (amtReceived * 0.74);
//               // result = (TextView) findViewById(R.id.total);
//               // result.setText("The amount converted is: "+total);
//                break;
//        }
//    }
//
//
//    public void CloseApp(View view) {
//        Convert.this.finish();
//    }
//}
