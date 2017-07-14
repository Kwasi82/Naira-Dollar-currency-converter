package com.kwasiasiedu.nairadollarcurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void convertCash(View view) {

        EditText myCashField = (EditText) findViewById(R.id.enterMoney);

        //myCashField.getText().toString();

        //int number = Integer.parseInt(myCashField);

        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
