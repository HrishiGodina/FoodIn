package com.example.hrishi.foodin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void order_food1(View view) {
        Intent i1 = new Intent(this, Order_any_time_snacks.class);
        startActivity(i1);
    }

    public void order_food2(View view) {
        Intent i2 = new Intent(this, Order_tea_post.class);
        startActivity(i2);
    }

    public void order_food3(View view) {
        Intent i3 = new Intent(this, Order_bakery.class);
        startActivity(i3);
    }

    public void order_food4(View view) {
        Intent i4 = new Intent(this, Order_food_nest.class);
        startActivity(i4);
    }

}
