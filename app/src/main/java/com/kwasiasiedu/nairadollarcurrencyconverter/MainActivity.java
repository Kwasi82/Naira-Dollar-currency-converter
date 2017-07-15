package com.kwasiasiedu.nairadollarcurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText nairaField = (EditText) findViewById(R.id.nairaField);

        Log.i("nairaField", nairaField.getText().toString());

        //myCashField.getText().toString();

        //int number = Integer.parseInt(myCashField);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
