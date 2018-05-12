package com.example.hrishi.foodin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.hrishi.foodin.Adapters.Order;
import com.example.hrishi.foodin.Adapters.OrderAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class Order_confirmation extends AppCompatActivity {

    RecyclerView recyclerView;

    TextView textViewTotal;

    List<Order> orderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);
        DatabaseReference mDataBase = FirebaseDatabase.getInstance().getReference();

        orderList = (List<Order>) getIntent().getSerializableExtra("order_details");
        recyclerView = findViewById(R.id.item_confirmation_recyclerView);
        textViewTotal = (TextView) findViewById(R.id.total1);
        textViewTotal.setText(String.valueOf(getIntent().getExtras().getInt("total_value")));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        OrderAdapter adapter = new OrderAdapter(this, orderList);
        recyclerView.setAdapter(adapter);
    }

}
