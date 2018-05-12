package com.example.hrishi.foodin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Order_any_time_snacks extends AppCompatActivity {

    private int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_any_time_snacks);
    }

    public void order(View view) {
        Intent i = new Intent(this, Order_food_nest_item.class);
        startActivity(i);
    }
}
