package com.example.hrishi.foodin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hrishi.foodin.Adapters.Item;
import com.example.hrishi.foodin.Adapters.ItemAdapter;
import com.example.hrishi.foodin.Adapters.Order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order_food_nest extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<Item> parathaList;
    private List<Item> chickenList;
    private List<Item> southList;
    private List<Item> andeList;
    private List<Item> chineeseList;
    private List<Order> orderList;

    private int total;

    private TextView textViewTotal;

    Button btnOrder;
    public Item item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food_nest);

        recyclerView = findViewById(R.id.item_individual_recyclerView);
        textViewTotal = (TextView) findViewById(R.id.total);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        parathaList = new ArrayList<>();
        chickenList = new ArrayList<>();
        southList = new ArrayList<>();
        andeList = new ArrayList<>();
        chineeseList = new ArrayList<>();
        orderList = new ArrayList<>();


        recyclerView.setHasFixedSize(true);

        btnOrder = findViewById(R.id.place_order);

        btnOrder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                for (int i = 0; i <= (parathaList.size() - 1); i++) {
                    if (parathaList.get(i).getCount() > 0) {
                        orderList.add(
                                new Order(
                                        parathaList.get(i).getItem(),
                                        parathaList.get(i).getCost(),
                                        parathaList.get(i).getCount()));
                    }

                }

                for (int i1 = 0; i1 <= (chickenList.size() - 1); i1++) {
                    if (chickenList.get(i1).getCount() > 0) {
                        orderList.add(
                                new Order(
                                        chickenList.get(i1).getItem(),
                                        chickenList.get(i1).getCost(),
                                        chickenList.get(i1).getCount()));
                    }
                }

                for (int i2 = 0; i2 <= (southList.size() - 1); i2++) {
                    if (southList.get(i2).getCount() > 0) {
                        orderList.add(
                                new Order(
                                        southList.get(i2).getItem(),
                                        southList.get(i2).getCost(),
                                        southList.get(i2).getCount()));
                    }
                }

                for (int i3 = 0; i3 <= (andeList.size() - 1); i3++) {
                    if (chickenList.get(i3).getCount() > 0) {
                        orderList.add(
                                new Order(
                                        andeList.get(i3).getItem(),
                                        andeList.get(i3).getCost(),
                                        andeList.get(i3).getCount()));
                    }
                }

                for (int i4 = 0; i4 <= (chineeseList.size() - 1); i4++) {
                    if (chineeseList.get(i4).getCount() > 0) {
                        orderList.add(
                                new Order(
                                        chineeseList.get(i4).getItem(),
                                        chineeseList.get(i4).getCost(),
                                        chineeseList.get(i4).getCount()));
                    }
                }

                if(orderList.size()>0) {
                    Intent i = new Intent(getApplicationContext(), Order_confirmation.class);
                    i.putExtra("order_details", (Serializable) orderList);
                    i.putExtra("total_value", total);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Select atleast one item", Toast.LENGTH_LONG).show();
                }
            }
        });

        parathaList.add(
                new Item(
                        "Aloo paratha",
                        25,
                        0
                )
        );

        parathaList.add(
                new Item(
                        "Gobi paratha",
                        25,
                        0
                )
        );

        parathaList.add(
                new Item(
                        "Cheese paratha",
                        30,
                        0
                )
        );

        parathaList.add(
                new Item(
                        "Paneer paratha",
                        30,
                        0

                )
        );

        chickenList.add(
                new Item(
                        "Chicken masala",
                        90,
                        0
                )
        );

        chickenList.add(
                new Item(
                        "Chicken grvy",
                        90,
                        0
                )
        );

        chickenList.add(
                new Item(
                        "Boneless chicken",
                        120,
                        0
                )
        );

        chickenList.add(
                new Item(
                        "Chilly chicken",
                        110,
                        0
                )
        );

        chickenList.add(
                new Item(
                        "Biriyani",
                        60,
                        0
                )
        );

        chickenList.add(
                new Item(
                        "Chicken manchurian",
                        60,
                        0
                )
        );

        chickenList.add(
                new Item(
                        "Chicken fry rice",
                        60,
                        0
                )
        );

        chickenList.add(
                new Item(
                        "Roasted tandoori chicken",
                        130,
                        0
                )
        );

        chickenList.add(
                new Item(
                        "Chicken pahadi",
                        130,
                        0
                )
        );

        chickenList.add(
                new Item(
                        "Boneless tikka",
                        120,
                        0
                )
        );

        chickenList.add(
                new Item(
                        "Green boneless tikka",
                        120,
                        0
                )
        );

        southList.add(
                new Item(
                        "Plain dosa",
                        30,
                        0
                )
        );

        southList.add(
                new Item(
                        "Masala dosa",
                        50,
                        0
                )
        );

        southList.add(
                new Item(
                        "Paneer dosa",
                        60,
                        0
                )
        );

        southList.add(
                new Item(
                        "Cheese dosa",
                        60,
                        0
                )
        );

        southList.add(
                new Item(
                        "Idli sambhar",
                        20,
                        0
                )
        );

        southList.add(
                new Item(
                        "Medu vada",
                        25,
                        0
                )
        );

        andeList.add(
                new Item(
                        "Egg fry rice",
                        60,
                        0
                )
        );

        andeList.add(
                new Item(
                        "Egg burji",
                        40,
                        0
                )
        );

        andeList.add(
                new Item(
                        "Egg omlet",
                        20,
                        0
                )
        );

        andeList.add(
                new Item(
                        "Egg boil",
                        20,
                        0
                )
        );

        andeList.add(
                new Item(
                        "Egg masala fry",
                        40,
                        0
                )
        );

        andeList.add(
                new Item(
                        "Egg fry",
                        30,
                        0
                )
        );

        chineeseList.add(
                new Item(
                        "Veg. Fry rice",
                        70,
                        0
                )
        );

        chineeseList.add(
                new Item(
                        "Veg. manchurian noodles",
                        80,
                        0
                )
        );

        chineeseList.add(
                new Item(
                        "Manchurian dry",
                        60,
                        0
                )
        );

        chineeseList.add(
                new Item(
                        "Manchurian gravy",
                        70,
                        0
                )
        );

        chineeseList.add(
                new Item(
                        "Paneer chilly dry",
                        90,
                        0
                )
        );

        chineeseList.add(
                new Item(
                        "Paneer chilly gravy",
                        90,
                        0
                )
        );

        ItemAdapter adapter = new ItemAdapter(this, parathaList, new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item, int count, int t) {
                item.setCount(count);
                total = total+(item.getCost()*t);
                textViewTotal.setText(String.valueOf(total));
            }
        });
        recyclerView.setAdapter(adapter);
    }

    public void paratha(View view) {
        ItemAdapter adapter = new ItemAdapter(this, parathaList, new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item, int count, int t) {
                item.setCount(count);
                total = total+(item.getCost()*t);
                textViewTotal.setText(String.valueOf(total));
            }
        });

        recyclerView.setAdapter(adapter);
    }

    public void chicken(View view) {
        ItemAdapter adapter = new ItemAdapter(this, chickenList, new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item, int count, int t) {
                item.setCount(count);
                total = total+(item.getCost()*t);
                textViewTotal.setText(String.valueOf(total));
            }
        });

        recyclerView.setAdapter(adapter);
    }

    public void south(View view) {
        ItemAdapter adapter = new ItemAdapter(this, southList, new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item, int count, int t) {
                item.setCount(count);
                total = total+(item.getCost()*t);
                textViewTotal.setText(String.valueOf(total));
            }
        });

        recyclerView.setAdapter(adapter);
    }

    public void ande(View view) {
        ItemAdapter adapter = new ItemAdapter(this, andeList, new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item, int count, int t) {
                item.setCount(count);
                total = total+(item.getCost()*t);
                textViewTotal.setText(String.valueOf(total));
            }
        });

        recyclerView.setAdapter(adapter);
    }

    public void chinese(View view) {
        ItemAdapter adapter = new ItemAdapter(this, chineeseList, new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item, int count,int t) {
                item.setCount(count);
                total = total+(item.getCost()*t);
                textViewTotal.setText(String.valueOf(total));
            }
        });

        recyclerView.setAdapter(adapter);
    }
}
