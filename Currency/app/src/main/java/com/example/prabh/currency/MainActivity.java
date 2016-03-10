package com.example.prabh.currency;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private String text;
    private double num;
    static String amount;
    static String currency;
    static TextView  result;

    //public static final String tag = "SendBroadcast";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList<>();
        list.add("British Pound");
        list.add("Euro");
        list.add("Indian Rupee");
        list.add("Canadian Dollar");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        ListView countrylist = (ListView)findViewById(R.id.Countries);
        result = (TextView)findViewById(R.id.textView2);
        countrylist.setAdapter(adapter);

        countrylist.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int index, long id) {
        ListView countrylist = (ListView) findViewById(R.id.Countries);
        text =  countrylist.getItemAtPosition(index).toString();
    }

    public void ConvertCurrency(View view) {
        EditText amount = (EditText)findViewById(R.id.Amount);
        num = Double.parseDouble(amount.getText().toString());

        Intent intent = new Intent("Preeti.custom.intent.request");
        intent.putExtra("text",text );
        Log.d("Hello================", amount.getText().toString());
        intent.putExtra("num", num);
        MainActivity.this.sendBroadcast(intent);

    }

    public static void setCcy(String textReceived, String amtReceived) {


        result.setText(textReceived + amtReceived );
    }

    public void CloseApp(View view) {
        MainActivity.this.finish();
    }


}
