package com.kwasiasiedu.nairadollarcurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        //Create an EditText variable which is equal to a field
        EditText nairaField = (EditText) findViewById(R.id.nairaField);

        //Get the value of the field convert to a double (type of number)
        Double nairaAmount = Double.parseDouble(nairaField.getText().toString());

        //Convert naira to dollar using the conversion rate
        Double dollarAmount = nairaAmount * 0.0032;

        //Display converted amount in Naira to Dollar via Toast on device
        Toast.makeText(getApplicationContext(), "$" + dollarAmount.toString(), Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
