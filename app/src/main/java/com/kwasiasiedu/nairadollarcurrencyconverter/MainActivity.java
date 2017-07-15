package com.kwasiasiedu.nairadollarcurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        //Create an EditText variable which is equal to a field
        EditText nairaField = (EditText) findViewById(R.id.nairaField);

        //Get the value of the field convert to a double (type of number)
        Double nairaAmount = Double.parseDouble(nairaField.getText().toString());

        //Convert naira to dollar using the conversion rate
        Double dollarAmount = nairaAmount * 0.0032;

        //display to the log the conversion
        Log.i("dollarAmount", dollarAmount.toString());



        //myCashField.getText().toString();

        //int number = Integer.parseInt(myCashField);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
