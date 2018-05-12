package com.example.hrishi.foodin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.hrishi.foodin.Adapters.Item;
import com.example.hrishi.foodin.Adapters.ItemAdapter;
import com.example.hrishi.foodin.Adapters.Order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order_food_nest_item extends AppCompatActivity {

    public List<Item> itemList;
    int value;

    Item item;

    RecyclerView recyclerView;
    Button btnOrder, btnPlus, btnMinus;

    public  List<Order> orderList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food_nest_item);

        recyclerView = findViewById(R.id.recyclerView_food_nest);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();
        orderList = new ArrayList<>();
        recyclerView.setHasFixedSize(true);

        btnOrder = findViewById(R.id.place_order);

        btnOrder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println(itemList);
                for(int i=0; i<=(itemList.size()-1); i++) {
                    if(itemList.get(i).getCount()>0) {
                        orderList.add(
                                new Order(
                                        itemList.get(i).getItem(),
                                        itemList.get(i).getCost(),
                                        itemList.get(i).getCount()));
                    }
                }

                Intent i = new Intent(getApplicationContext(), Order_confirmation.class);
                i.putExtra("order_details", (Serializable) orderList);
                startActivity(i);
                finish();
            }
        });

        itemList.add(
                new Item(
                        "Egg fry rice",
                        60,
                        0
                )
        );

        itemList.add(
                new Item(
                        "Egg burji",
                        40,
                        0
                )
        );

        itemList.add(
                new Item(
                        "Egg omlet",
                        20,
                        0
                )
        );

        itemList.add(
                new Item(
                        "Egg boil",
                        20,
                        0
                )
        );

        itemList.add(
                new Item(
                        "Egg masala fry",
                        40,
                        0
                )
        );

        itemList.add(
                new Item(
                        "Egg fry",
                        30,
                        0
                )
        );

        //setting adapter to recyclerview
        ItemAdapter adapter = new ItemAdapter(this, itemList, new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item, int count, int t) {
                item.setCount(count);

            }
        });
        recyclerView.setAdapter(adapter);
    }

}
