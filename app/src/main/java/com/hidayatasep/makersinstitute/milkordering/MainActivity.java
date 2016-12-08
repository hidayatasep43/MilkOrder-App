package com.hidayatasep.makersinstitute.milkordering;

import java.text.NumberFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    //global variabel
    int quantityOfMilk = 0;
    int totalPriceOfOrderMilk = 0;
    final int priceOfMilk = 5;
    //view
    TextView quantityTextView;
    TextView totalPriceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assign value to quantity textview
        quantityTextView = (TextView)findViewById(R.id.quantityMilkTextView);
        totalPriceTextView = (TextView)findViewById(R.id.priceOrderMilkTextView);

    }

    //increment order
    public void incrementOrder(View view){
        //increment quantity of order milk
        quantityOfMilk += 1;
        //displaying a quantity of order milk
        quantityTextView.setText("" + quantityOfMilk);
    }

    public void decrementOrder(View view){
        //check if number of order milk > 0
        if(quantityOfMilk>0){
            //decrement quantity of order milk
            quantityOfMilk -= 1;
            //displaying a quantity of order milk
            quantityTextView.setText("" + quantityOfMilk);
        }

    }

    public void showTotalPrice(View view){
        //Calculate total price of order milk
        totalPriceOfOrderMilk = priceOfMilk * quantityOfMilk;
        //show total price
        //add your code ...
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        totalPriceTextView.setText(nf.format(totalPriceOfOrderMilk));
    }

}
