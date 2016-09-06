package com.example.codetribe.myapplication;

import android.annotation.TargetApi;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        int price = quantity * 5;
        String priceMessage = "Amount Due Is : R" + price;
        priceMessage = priceMessage + "\nThank You!";
        displayMessage(priceMessage);
    }

    public void increment(View view) {

        quantity = quantity + 1;
        display(quantity);
    }
    public void decrement(View view) {

        quantity = quantity - 1;
        display(quantity);
    }
    public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        //quantityTextView.setText("" + number);
    }
    public void displayMessage(String message)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    @TargetApi(Build.VERSION_CODES.N)
    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
